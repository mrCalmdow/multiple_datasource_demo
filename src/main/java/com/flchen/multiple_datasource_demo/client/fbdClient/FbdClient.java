package com.flchen.multiple_datasource_demo.client.fbdClient;

import com.flchen.multiple_datasource_demo.client.fbdClient.bo.request.FbdUserLoginReqBO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;

/**
 * @author feilongchen
 * @since 2019-02-25 11:43 PM
 */
public interface FbdClient <T> {

    /**
     * 调用fbd登陆接口
     * @param loginBO
     * @return
     * @throws RestTemplateExtensionException
     */
    ResponseMO<T> fbdUserLogin(FbdUserLoginReqBO loginBO) throws RestTemplateExtensionException;
}
