package com.flchen.multiple_datasource_demo.web.controller;

import com.flchen.multiple_datasource_demo.commom.mo.ResponseMO;
import com.flchen.multiple_datasource_demo.commom.web.controller.BaseController;
import com.flchen.multiple_datasource_demo.dao.mongo.shop.SharedAutoRepo;
import com.flchen.multiple_datasource_demo.entity.shop.operation.entity.SharedDO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author feilongchen
 * @since 2019-02-20 5:30 PM
 */
@Slf4j
@RestController
@RequestMapping("/shared")
public class SharedController extends BaseController {

    @Autowired
    private SharedAutoRepo sharedAutoRepo;

    @GetMapping("/all")
    public ResponseMO listAll() {
        List<SharedDO>  shared = sharedAutoRepo.findAll();
        return success(shared);
    }
}
