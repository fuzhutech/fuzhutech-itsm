package com.fuzhutech.controller;

import com.fuzhutech.entity.itsm.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 部门管理
@RestController
@RequestMapping("/devices")
public class DeviceController extends ItsmRestfulController<Device> {

    private static Logger logger = LoggerFactory.getLogger(DeviceController.class);
    
}
