package cloud.codeworks.esales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CityController {
	
	@RequestMapping("/city/new")
	public String addCity() {
		return "city/add-city";
	}

}
