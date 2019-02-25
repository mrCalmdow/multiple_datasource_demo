package com.flchen.multiple_datasource_demo.commom.service;

import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;

import java.util.Map;

/**
 * @author feilongchen
 * @since 2018-12-13 2:56 PM
 */
public interface RestTemplateExtensionService {

    /**
     *
     * @param api   请求的API地址
     * @param method    请求方式,如Get\Post等
     * @param requestBody   请求体
     * @param returnType    返回对象的类型
     * @param uriVariables  请求地址的参数
     * @param <T>
     * @param <V>
     * @return
     * @throws RestTemplateExtensionException
     */
    <T, V> T exchange(String api, HttpMethod method, V requestBody, Class<T> returnType, Object... uriVariables)
            throws RestTemplateExtensionException;

    /**
     * 增强RestTemplate用于HTTP请求交互
     * @param api 请求的API地址
     * @param method 请求方式,如Get\Post等
     * @param requestBody 请求体
     * @param responseType 返回对象的类型
     * @param uriVariables 请求地址的参数
     * @param <T>
     * @param <V>
     * @return
     * @throws RestTemplateExtensionException
     */
    <T, V> ResponseMO<T> exchange(String api, HttpMethod method, V requestBody, ParameterizedTypeReference<T> responseType, Object... uriVariables)
            throws RestTemplateExtensionException;

    <T, V> T postForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException;

    <T, V> T putForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException;

    <T, V> T deleteForObject(String api, V body, Class<T> returnType) throws RestTemplateExtensionException;

    <T> T getForObject(String api, Class<T> returnType, Map<String, String> param) throws RestTemplateExtensionException;

    <T> T getForObject(String api, Class<T> returnType) throws RestTemplateExtensionException;
}
