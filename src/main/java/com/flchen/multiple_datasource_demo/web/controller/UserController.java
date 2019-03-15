package com.flchen.multiple_datasource_demo.web.controller;


import com.flchen.multiple_datasource_demo.client.fbdClient.FbdClient;
import com.flchen.multiple_datasource_demo.client.fbdClient.bo.request.FbdUserLoginReqBO;
import com.flchen.multiple_datasource_demo.client.fbdClient.bo.response.FbdUseLoginRespBO;
import com.flchen.multiple_datasource_demo.commom.entity.BaseFileDO;
import com.flchen.multiple_datasource_demo.commom.exception.RestTemplateExtensionException;
import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.web.controller.BaseController;
import com.flchen.multiple_datasource_demo.repo.mysql.UserAutoRepo;
import com.flchen.multiple_datasource_demo.entity.UserDO;
import com.flchen.multiple_datasource_demo.service.TestFileService;
import com.flchen.multiple_datasource_demo.service.TestRunnerService;
import com.flchen.multiple_datasource_demo.web.mo.UserAddMO;
import com.flchen.multiple_datasource_demo.web.mo.fbd.UserLoginMO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author feilongchen
 * @since 2019-01-29 4:49 PM
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    @Autowired
    private UserAutoRepo userAutoRepo;

    @Autowired
    private FbdClient fbdClient;

    @Autowired
    private TestFileService testFileService;

    @Autowired
    private TestRunnerService testRunnerService;

    @PostMapping
    public ResponseMO addUsers(@RequestBody @Valid UserAddMO userAddMO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userAddMO, userDO);
        userAutoRepo.save(userDO);
        return success(userDO);
    }

    @GetMapping("/all")
    public ResponseMO listAll() {

        List<UserDO> users = userAutoRepo.findAll();
        return success(users);
    }

    /**
     * 模拟富宝袋登陆
     * @param loginMO
     * @return
     * @throws RestTemplateExtensionException
     */
    @PostMapping("/fbdLogin")
    public ResponseMO fbdUserLogin(@RequestBody @Valid UserLoginMO loginMO) throws RestTemplateExtensionException {

        FbdUserLoginReqBO reqBO = new FbdUserLoginReqBO();
        BeanUtils.copyProperties(loginMO, reqBO);
        ResponseMO responseMO = fbdClient.fbdUserLogin(reqBO);
        FbdUseLoginRespBO respBO = (FbdUseLoginRespBO) responseMO.getData();

        BaseFileDO<FbdUserLoginReqBO, FbdUseLoginRespBO> baseFileDO = new BaseFileDO<>();
        baseFileDO.setFileName("用户登陆接口");
        baseFileDO.setMethod("POST");
        baseFileDO.setUrl("http://192.168.96.38:8081/fbd/app/user/login");
        List<String> checkProperties = new ArrayList<>();
        checkProperties.add("userId");
        checkProperties.add("mobile");
        baseFileDO.setWantCheckProperties(checkProperties);
        baseFileDO.setInData(reqBO);
        baseFileDO.setOutData(respBO);

        // TODO 生成
        testFileService.saveXmlFile(baseFileDO, "src/xml/" + baseFileDO.getFileName() + ".xml");
        return responseMO;
    }

    /**
     * 回放富宝袋登陆
     * @return
     */
    @GetMapping("/replay/userLogin")
    public ResponseMO replayFbdUserLogin() {

        BaseFileDO baseFileDO = new BaseFileDO();
        try {
            baseFileDO = testFileService.loadXmlFile("src/xml/用户登陆接口.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Boolean isPass = false;
        try {
            isPass = testRunnerService.runTest(baseFileDO, FbdUseLoginRespBO.class);
        } catch (RestTemplateExtensionException e) {
            e.printStackTrace();
        }
        return success(isPass);
    }
}
