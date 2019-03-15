package com.flchen.multiple_datasource_demo.service;

import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;

/**
 * @author feilongchen
 * @since 2019-03-07 10:50 AM
 */
public interface TestFileService<T> {

    void saveXmlFile(BaseFileDO dataObj, String fileAndName);

    BaseFileDO loadXmlFile(String filePathAndName) throws Exception;

    ResponseMO<T> sendRequestByTestFile(BaseFileDO testFileObj) throws RestTemplateExtensionException;
}
