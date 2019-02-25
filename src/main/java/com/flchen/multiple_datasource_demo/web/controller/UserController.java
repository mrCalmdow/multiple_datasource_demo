package com.flchen.multiple_datasource_demo.web.controller;


import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.web.controller.BaseController;
import com.flchen.multiple_datasource_demo.dao.mysql.UserAutoRepo;
import com.flchen.multiple_datasource_demo.entity.UserDO;
import com.flchen.multiple_datasource_demo.web.mo.UserAddMO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author feilongchen
 * @since 2019-01-29 4:49 PM
 */
@RestController
@RequestMapping("/users")
public class UserController extends BaseController {

    @Autowired
    private UserAutoRepo userAutoRepo;

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
}
