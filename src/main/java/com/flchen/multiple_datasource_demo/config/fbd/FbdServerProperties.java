package com.flchen.multiple_datasource_demo.config.fbd;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author feilongchen
 * @since 2019-02-25 11:45 PM
 */
@Data
@Component
@ConfigurationProperties(prefix = "fbd-server")
public class FbdServerProperties {

//    @Value("${host:http://uatfbd.fujfu.com}")
    @Value("${host:http://192.168.96.38:8081}")
    private String host;

    @Value("${pay-mapping:/fbd/v1/pay}")
    private String payMapping;

    @Value("${pay-build-path:/fbd/v1/pay/shop}")
    private String payBuildPath;

    @Value("${pay-createp-ath:/create}")
    private String payCreatePath;

    @Value("${secret:C4B31CECF9E3FC1567EDF309F121E2EC}")
    private String secret;

    @Value("${channel:10}")
    private String channel;

    @Value("${login-mapping:/fbd/app/user/login}")
    private String loginMapping;
}
