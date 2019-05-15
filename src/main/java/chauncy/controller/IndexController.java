package chauncy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chauncy.service.UserService;

@RestController
@RequestMapping("/IndexController")
public class IndexController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/index")
	public String index(){
		userService.createJdbcUser();
		return "add success";
	}
}
