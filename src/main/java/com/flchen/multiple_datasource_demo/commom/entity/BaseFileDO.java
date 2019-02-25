package com.flchen.multiple_datasource_demo.commom.entity;

import lombok.Data;

/**
 * @author feilongchen
 * @since 2019-02-21 6:29 PM
 */
@Data
public class BaseFileDO<T, K> extends BaseDO {

    T inData;

    K outData;
}
