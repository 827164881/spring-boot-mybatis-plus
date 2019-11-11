package com.monkey.sysplus.welcome;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: monkey.G
 * @create: 2019-11-08 18:36
 **/
@Controller
@RequestMapping("/")
public class WelcomeController {

  @ApiOperation("欢迎默认的controller，包括跳转index")
  @RequestMapping("/")
  public String indexPage(Model model){
    model.addAttribute("linkurl","http://127.0.0.1:8271/swagger-ui.html");
    return "index";
  }

  @RequestMapping("/index")
  public String indexPage2(Model model){
    return "index";
  }

  @RequestMapping("swagger")
  public String swagger(HttpServletRequest request){
    return "swagger-ui";
  }


}
