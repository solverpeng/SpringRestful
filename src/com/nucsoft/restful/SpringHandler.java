package com.nucsoft.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringHandler {
	
	
	@RequestMapping(value="{/testRestFul/order/{id},testRestFul/order}", method= RequestMethod.PUT)
	public String testRestFul(@PathVariable(value="id) String id) {
		System.out.println("......");
		return "target";
	}

}
