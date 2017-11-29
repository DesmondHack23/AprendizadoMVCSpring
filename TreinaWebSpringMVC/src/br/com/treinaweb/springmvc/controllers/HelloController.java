package br.com.treinaweb.springmvc.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {

	// <server>/application/hello/message

	@RequestMapping("/message")
	public String message() {
		return "hello";
	}

	@RequestMapping("/serverMessage")
	public String serverMessage(Model model) {
		model.addAttribute("message", new Date().toString());
		return "serverMessage";
	}

	@RequestMapping("/serverMessage2")
	public ModelAndView serverMessageV2() {
		ModelAndView result = new ModelAndView("serverMessage", "message", new Date().toString());
		return result;
	}

	// <server>/application/hello/getMessage/variable
	@RequestMapping("/getMessage/{message}")
	public String getMessage(Model model, @PathVariable("message") String msg) {
		model.addAttribute("message", msg);
		return "serverMessage";
	}

	// <server>/application/hello/getMessage2?message=value
	@RequestMapping("/getMessage2")
	public String getMessage2(Model model, @RequestParam(value = "message", required = false, defaultValue = "Aloha Abiguinho!!") String msg) {
		model.addAttribute("message", msg);
		return "serverMessage";
	}

}
