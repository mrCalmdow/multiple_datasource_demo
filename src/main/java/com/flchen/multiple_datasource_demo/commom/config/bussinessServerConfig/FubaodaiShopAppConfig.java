package com.flchen.multiple_datasource_demo.commom.config.bussinessServerConfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author feilongchen
 * @since 2019-02-20 6:02 PM
 */
@Data
@Component
@ConfigurationProperties(prefix = "fbd-shop-app")
public class FubaodaiShopAppConfig {

}
