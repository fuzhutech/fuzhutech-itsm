package com.fuzhutech.controller;

import com.fuzhutech.common.ResponseResult;
import com.fuzhutech.entity.itsm.Server;
import com.fuzhutech.service.ServerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 部门管理
@RestController
@RequestMapping("/servers")
public class ServerController extends ItsmRestfulController<Server> {

    private static Logger logger = LoggerFactory.getLogger(ServerController.class);

}
