package com.flchen.multiple_datasource_demo.client.fbdClient.impl;

import com.flchen.multiple_datasource_demo.client.fbdClient.FbdClient;
import com.flchen.multiple_datasource_demo.client.fbdClient.bo.request.FbdUserLoginReqBO;
import com.flchen.multiple_datasource_demo.client.fbdClient.bo.response.FbdUseLoginRespBO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.service.RestTemplateExtensionService;
import com.flchen.multiple_datasource_demo.config.fbd.FbdServerProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

/**
 * @author feilongchen
 * @since 2019-03-06 1:42 PM
 */
@Slf4j
@Service
public class FbdClientImpl implements FbdClient {

    @Autowired
    private RestTemplateExtensionService restTemplateExtensionService;

    @Autowired
    private FbdServerProperties fbdServerProperties;

    @Override
    public ResponseMO<FbdUseLoginRespBO> fbdUserLogin(FbdUserLoginReqBO loginBO) throws RestTemplateExtensionException {

        FbdUseLoginRespBO response = restTemplateExtensionService.exchange(fbdServerProperties.getHost() + fbdServerProperties.getLoginMapping(),
                HttpMethod.POST, loginBO, FbdUseLoginRespBO.class);
        ResponseMO responseMO = new ResponseMO();
        responseMO.setData(response);
        return responseMO;
    }
}
