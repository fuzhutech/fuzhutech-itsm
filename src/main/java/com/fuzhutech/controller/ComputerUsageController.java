package com.fuzhutech.controller;

import com.fuzhutech.entity.itsm.ComputerUsage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 部门管理
@RestController
@RequestMapping("/computer-usages")
public class ComputerUsageController extends ItsmRestfulController<ComputerUsage> {

    private static Logger logger = LoggerFactory.getLogger(ComputerUsageController.class);
    
}
