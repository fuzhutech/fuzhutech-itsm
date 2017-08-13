package com.fuzhutech.controller;

import com.fuzhutech.entity.itsm.ComputerMaintain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 部门管理
@RestController
@RequestMapping("/computer-maintains")
public class ComputerMaintainController extends ItsmRestfulController<ComputerMaintain> {

    private static Logger logger = LoggerFactory.getLogger(ComputerMaintainController.class);
    
}
