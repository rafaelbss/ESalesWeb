package cloud.codeworks.esales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
	
	@RequestMapping("/customer/new")
	public String addCustomer() {
		return "customer/add-customer";
	}

}
