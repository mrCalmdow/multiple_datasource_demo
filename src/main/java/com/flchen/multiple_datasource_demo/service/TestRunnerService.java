package com.flchen.multiple_datasource_demo.service;

import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;

/**
 * @author feilongchen
 * @since 2019-03-07 11:35 AM
 */
public interface TestRunnerService {

    <T> Boolean runTest(String casePathAndName, Class<T> tClass) throws Exception;

    <T> Boolean runTest(BaseFileDO caseDO, Class<T> tClass) throws RestTemplateExtensionException;

}
