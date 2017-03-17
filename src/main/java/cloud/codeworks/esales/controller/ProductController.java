package cloud.codeworks.esales.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cloud.codeworks.esales.business.model.Origin;
import cloud.codeworks.esales.business.model.Product;
import cloud.codeworks.esales.business.service.ProductService;
import cloud.codeworks.esales.business.service.ProductTypeService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductTypeService productTypeService;
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/product/new")
	public ModelAndView addProduct(Product product) {
		ModelAndView mv = new ModelAndView("product/add-product");
		mv.addObject("productType", this.productTypeService.findAll());
		mv.addObject("origin", Origin.values());

		return mv;
	}
	
	@RequestMapping(value="/product/new", method=RequestMethod.POST)
	public ModelAndView saveProduct(@Valid Product product, BindingResult result, Model model, RedirectAttributes attributes) {
		if(result.hasErrors())
			return addProduct(product);
		
		this.productService.save(product);
		
		attributes.addFlashAttribute("message", "Product saved successfully!");
		
		return new ModelAndView("redirect:/product/new");
	}
}
