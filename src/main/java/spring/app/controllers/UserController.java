package spring.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.app.entity.user.User;
import spring.app.logic.user.UserLogic;

@Controller
public class UserController {

	@Autowired
	private UserLogic userLogic;

	@RequestMapping(value="/user", method= {RequestMethod.GET, RequestMethod.POST})
	public String home(Model model) {
		List<User> list = userLogic.findAllUser();

        model.addAttribute("hello", "Hello World!!!!");

		return "index";

	}

}
