package com.flchen.multiple_datasource_demo.web.controller;

import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.web.controller.BaseController;
import com.flchen.multiple_datasource_demo.repo.mongo.shop.UserAccountAutoRepo;
import com.flchen.multiple_datasource_demo.entity.shop.account.entity.UserAccountDO;
import com.flchen.multiple_datasource_demo.web.mo.shop.mo.UserAccountInfoMO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * @author feilongchen
 * @since 2019-02-20 5:50 PM
 */
@Slf4j
@RestController
@RequestMapping("/baseTools")
public class BaseToolsController extends BaseController {

    @Autowired
    private UserAccountAutoRepo userAccountAutoRepo;

    @GetMapping("/userAccount/{mobile}/info")
    public ResponseMO userAccountInformation(@PathVariable("mobile") @NotBlank(message = "mobile can not be empty") String mobile) {

        UserAccountDO userAccountDO = userAccountAutoRepo.findByMobileAndEnableIsTrue(mobile);
        UserAccountInfoMO infoMO = new UserAccountInfoMO();
        BeanUtils.copyProperties(userAccountDO, infoMO);
        return success(infoMO);
    }
}
