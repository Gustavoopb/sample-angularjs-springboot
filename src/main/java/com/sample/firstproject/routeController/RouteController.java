package com.sample.firstproject.routeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Gustavo
 *
 */
@Controller
public class RouteController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		return "index.html";
	}
}
