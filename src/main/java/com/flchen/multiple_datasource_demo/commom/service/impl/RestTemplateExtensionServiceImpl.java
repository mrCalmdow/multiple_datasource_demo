package com.flchen.multiple_datasource_demo.commom.service.impl;

import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.service.RestTemplateExtensionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * @author feilongchen
 * @since 2018-12-13 2:56 PM
 */
@Slf4j
@Service
public class RestTemplateExtensionServiceImpl implements RestTemplateExtensionService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public <T, V> T exchange(String api, HttpMethod method, V requestBody, Class<T> returnType, Object... uriVariables) throws RestTemplateExtensionException {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<V> requestEntity = new HttpEntity<>(requestBody, headers);

        ParameterizedTypeReference<ResponseMO<T>> typeRef = new ParameterizedTypeReference<ResponseMO<T>>() {
            @Override
            public Type getType() {
                ParameterizedType rawType = (ParameterizedType) super.getType();
                return new ParameterizedTypeImpl(new Type[]{returnType}, rawType.getOwnerType(), rawType.getRawType());
            }
        };
        ResponseEntity<ResponseMO<T>> response;
        try {
            response = restTemplate.exchange(api, method, requestEntity, typeRef, uriVariables);
        } catch (Exception e) {
            String msg = "api request error.";
            log.error(msg, e);
            throw new RestTemplateExtensionException(msg, e);
        }
        if (!response.getStatusCode().equals(HttpStatus.OK)) {
            throw new RestTemplateExtensionException(String.format("api request error, http status is %s, body: %s",
                    response.getStatusCodeValue(), response.getBody()));
        }
        ResponseMO<T> responseMO = response.getBody();
        if (responseMO == null) {
            String msg = "request error, response body is empty";
            log.error(msg);
            throw new RestTemplateExtensionException(msg);
        }
        if (!responseMO.isSuccess()) {
//            String msg = String.format("response core: %s, response msg: %s", responseMO.getCode(), responseMO.getMsg());
            String msg = responseMO.getMsg();
            log.error(msg);
            throw new RestTemplateExtensionException(msg);
        }

        return responseMO.getData();
    }


    @Override
    public <T, V> ResponseMO<T> exchange(String api, HttpMethod method, V requestBody, ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestTemplateExtensionException {
        HttpHeaders headers = new HttpHeaders();
        MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
        headers.setContentType(type);
        headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        HttpEntity<V> requestEntity = new HttpEntity<>(requestBody, headers);

        ParameterizedTypeReference<ResponseMO<T>> typeRef = new ParameterizedTypeReference<ResponseMO<T>>() {
            @Override
            public Type getType() {
                Type type = responseType.getType();
                return type;
            }
        };
        ResponseEntity<ResponseMO<T>> response;
        try {
            response = restTemplate.exchange(api, method, requestEntity, typeRef, uriVariables);
        } catch (Exception e) {
            String msg = "外部服务 api request error.";
            log.error(msg, e);
            throw new RestTemplateExtensionException(msg, e);
        }
        if (!response.getStatusCode().equals(HttpStatus.OK)) {
            throw new RestTemplateExtensionException(String.format("外部服务 api request error, http status is %s, body: %s",
                    response.getStatusCodeValue(), response.getBody()));
        }
        ResponseMO<T> responseMO = response.getBody();
        if (responseMO == null) {
            String msg = "外部服务 request error, response body is empty";
            log.error(msg);
            throw new RestTemplateExtensionException("请求失败，请稍后重试");
        }
        if (!responseMO.isSuccess()) {
            String msg = String.format("外部服务 response core: %s, response msg: %s", responseMO.getCode(), responseMO.getMsg());
            log.error(msg);
            throw new RestTemplateExtensionException(responseMO.getMsg());
        }
        return responseMO;
    }

    @Override
    public <T, V> T postForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException {
        return exchange(api, HttpMethod.POST, body, returnType);
    }

    @Override
    public <T, V> T putForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException {
        return exchange(api, HttpMethod.PUT, body, returnType);
    }

    @Override
    public <T, V> T deleteForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException {
        return exchange(api, HttpMethod.DELETE, body, returnType);
    }

    @Override
    public <T> T getForObject(String api, Class<T> returnType, Map<String, String> param) throws RestTemplateExtensionException {
        return exchange(api, HttpMethod.GET, null, returnType, param);
    }

    @Override
    public <T> T getForObject(String api, Class<T> returnType) throws RestTemplateExtensionException {
        return exchange(api, HttpMethod.GET, null, returnType);
    }
}
