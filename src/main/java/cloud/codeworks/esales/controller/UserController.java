package cloud.codeworks.esales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/user/new")
	public String addUser() {
		return "user/add-user";
	}

}
