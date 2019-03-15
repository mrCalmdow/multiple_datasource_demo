package com.flchen.multiple_datasource_demo.service.impl;

import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.service.RestTemplateExtensionService;
import com.flchen.multiple_datasource_demo.commom.util.BeanToMapUtil;
import com.flchen.multiple_datasource_demo.service.TestFileService;
import com.flchen.multiple_datasource_demo.service.TestRunnerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Map;

/**
 * @author feilongchen
 * @since 2019-03-07 11:39 AM
 */
@Slf4j
@Service
public class TestRunnerServiceImpl implements TestRunnerService {

    @Autowired
    private RestTemplateExtensionService restTemplateExtensionService;

    @Autowired
    private TestFileService testFileService;

    @Override
    public <T> Boolean runTest(String casePathAndName, Class<T> tClass) throws Exception {
        BaseFileDO baseFileDO = testFileService.loadXmlFile(casePathAndName);
        return runTest(baseFileDO, tClass);
    }

    @Override
    public <T> Boolean runTest(BaseFileDO caseDO, Class<T> tClass) throws RestTemplateExtensionException {
        Assert.notNull(caseDO, "case object can not be null");
        Object object = restTemplateExtensionService.exchange(caseDO.getUrl(), HttpMethod.POST, caseDO.getInData(), tClass);

        Map<String, String> sourceMap = BeanToMapUtil.beanToMap(caseDO.getOutData());
        Map<String, String> targetMap = BeanToMapUtil.beanToMap(object);

        List<String> checkItems = caseDO.getWantCheckProperties();
        for (String str : checkItems) {
            if (!sourceMap.get(str).equals(targetMap.get(str))) {
                log.error("[compare properties] name->{} : expect value -> {}, real value -> {}, check failure!", str, sourceMap.get(str), targetMap.get(str));
                return false;
            } else {
                log.info("[compare properties] name->{} : expect value -> {}, real value -> {}, check pass!", str, sourceMap.get(str), targetMap.get(str));
            }
        }
        return true;
    }
}
