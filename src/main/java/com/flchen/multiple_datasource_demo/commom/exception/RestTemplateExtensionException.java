package com.flchen.multiple_datasource_demo.commom.exception;

/**
 * @author feilongchen
 * @since 2018-12-13 2:57 PM
 */
public class RestTemplateExtensionException extends Exception {

    public RestTemplateExtensionException(String message) {
        super(message);
    }

    public RestTemplateExtensionException(String message, Throwable cause) {
        super(message, cause);
    }
}
