package com.flchen.multiple_datasource_demo.commom.web.controller;


import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.util.ResponseUtil;


/**
 * @author feilongchen
 * @since 2019-01-30 9:33 AM
 */
public abstract class BaseController {

    protected ResponseMO success() {
        return ResponseUtil.success();
    }

    protected ResponseMO success(String msg) {
        return ResponseUtil.success(msg);
    }

    protected ResponseMO success(Object obj) {
        return ResponseUtil.successWithData("", obj);
    }

    protected ResponseMO success(Object obj, String msg) {
        return ResponseUtil.successWithData(msg, obj);
    }

    protected ResponseMO error(String msg) {
        return ResponseUtil.error(msg);
    }
}
