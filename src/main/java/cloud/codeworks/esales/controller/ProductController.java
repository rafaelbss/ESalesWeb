package cloud.codeworks.esales.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/product/new")
	public String addProduct() {
		return "product/add-product";
	}

}
