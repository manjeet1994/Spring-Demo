package com.mvc.controller;

import org.apache.log4j.Logger;

import javax.validation.Valid;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mvc.dto.ProductDto;
import com.mvc.entity.Product;

@Controller
public class ProductInfoProcessController {

	private final Logger logger=Logger.getLogger(ProductInfoProcessController.class);
	@RequestMapping(value="/home.htm", method=RequestMethod.GET)
	public String loadPage(Model model) {
		logger.debug("LoadPage method execute");
		model.addAttribute("product", new Product());
		return "add_product";
	}
	
	@RequestMapping(value="/prductInfoProcess.htm", method=RequestMethod.POST)
	public String productProcessInfo(@Valid @ModelAttribute Product product, BindingResult result,  Model model) {
		
		if(result.hasErrors()) {
			logger.warn("Error has been  found in request wraping");
			return "add_product";
		}
       System.out.println("Modification done to chech push command in git");
		logger.debug("ProductProcessInfo method executed");
		ProductDto dto=new ProductDto("PROD-101",product.getProductName(),product.getType(),product.getManufacturer(),product.getPrice());
		
		model.addAttribute("product", dto);
		return "product_details";
	}
}
