package com.flchen.multiple_datasource_demo.commom.mo;


import com.alibaba.fastjson.JSONObject;
import com.flchen.multiple_datasource_demo.commom.constants.CommonConstants;

import java.io.Serializable;

public class ResponseRemoteMO implements Serializable {

    private static final long serialVersionUID = 1L;
    private int code = CommonConstants.RESPONSE_CODE_SUCCESS;
    private String msg = "";
    private JSONObject data;
    private String debugInfo;

    /**
     * 成功
     *
     * @return
     */
    public boolean isSuccess() {
        return this.code == CommonConstants.RESPONSE_CODE_SUCCESS;
    }

    public boolean checkFailure() {
        boolean result = false;
        if (this.code == CommonConstants.RESPONSE_CODE_FAILURE) {
            result = true;
        }
        return result;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public JSONObject getData() {
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public String getDebugInfo() {
        return debugInfo;
    }

    public void setDebugInfo(String debugInfo) {
        this.debugInfo = debugInfo;
    }
}
