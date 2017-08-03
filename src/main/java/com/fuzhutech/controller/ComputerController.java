package com.fuzhutech.controller;

import com.fuzhutech.entity.itsm.Computer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 部门管理
@RestController
@RequestMapping("/computers")
public class ComputerController extends ItsmRestfulController<Computer> {

    private static Logger logger = LoggerFactory.getLogger(ComputerController.class);
    
}
