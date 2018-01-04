package com.zheng.test.web.controller;

import com.zheng.common.base.BaseController;
import com.zheng.test.dao.model.TUser;
import com.zheng.test.dao.model.TUserRole;
import com.zheng.test.rpc.api.TUserRoleService;
import com.zheng.test.rpc.api.TUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @package: com.zheng.test.web.controller
 * @ClassName: TestController
 * @Description:
 * @author: liting
 * @date: 2017-12-26 11:28
 */
@Controller
@RequestMapping("/test")
public class TestController extends BaseController {

    public static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TUserRoleService tUserRoleService;
    @Autowired
    private TUserService tUserService;

    @GetMapping("/index")
    public String index(Model model) {
        LOGGER.info("edit--");
        TUser tUser = tUserService.selectByPrimaryKey(1);
        model.addAttribute("user",tUser);
        return jsp("/index");
    }

    @GetMapping("/test")
    public String test() {
        LOGGER.info("test");

        return jsp("/index");
    }

    @GetMapping("hehe")
    @ResponseBody
    public String hehe() {
        return "hehe";
    }
}
