package com.flchen.multiple_datasource_demo.commom.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feilongchen
 * @since 2019-02-21 6:29 PM
 */
@Data
public class BaseFileDO<T, K> extends BaseDO {

    String fileName;

    String url;

    String method;

    List<String> wantCheckProperties = new ArrayList<>();

    T inData;

    K outData;
}
