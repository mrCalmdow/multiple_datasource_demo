package com.flchen.multiple_datasource_demo.service.impl;

import com.flchen.multiple_datasource_demo.client.fbdClient.FbdClient;
import com.flchen.multiple_datasource_demo.client.fbdClient.bo.request.FbdUserLoginReqBO;
import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.service.TestFileService;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * @author feilongchen
 * @since 2019-03-07 10:53 AM
 */
@Slf4j
@Service
public class TestFileServiceImpl<T> implements TestFileService {

    @Autowired
    private XStream xStream;

    @Autowired
    private FbdClient fbdClient;

    @Override
    public void saveXmlFile(BaseFileDO dataObj, String filePathAndName) {

        String xmlContent = xStream.toXML(dataObj);
        byte[] bytes = xmlContent.getBytes();

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePathAndName);
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public BaseFileDO loadXmlFile(String filePathAndName) throws Exception {

        File file = new File(filePathAndName);

        if (!file.exists() || file.isDirectory()) {
            log.error("{} not exists or file is directory, please check it.", filePathAndName);
            throw new Exception(filePathAndName + " not exists or file is directory, please check it.");
        }

        BaseFileDO baseFileDO = (BaseFileDO) xStream.fromXML(file);
        return baseFileDO;
    }

    @Override
    public ResponseMO<T> sendRequestByTestFile(BaseFileDO testFileObj) throws RestTemplateExtensionException {
        ResponseMO responseMO = fbdClient.fbdUserLogin((FbdUserLoginReqBO) testFileObj.getInData());
        if (responseMO.checkFailure()) {
            return responseMO;
        }

        List<String> checkItems = testFileObj.getWantCheckProperties();


        return null;
    }
}
