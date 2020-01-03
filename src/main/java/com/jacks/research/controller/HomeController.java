package com.jacks.research.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacks.research.model.Stage;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("myfirstvariaable", "jacks");
		return "home";
	}

	@GetMapping(value = { "/get/stage" })
	public String getStage(Model model) {
		model.addAttribute("stage", new Stage());
		return "stage";
	}

	@PostMapping(value = { "/stage/add" })
	@ResponseBody
	public String stageAddPost(@ModelAttribute("stage") Stage stage, BindingResult errors, Model model) {
		System.out.println("Stage date candi : " + stage.getDatecandidature());
		System.out.println("Stage date relance : " + stage.getDaterelance());
		System.out.println("Stage date rep : " + stage.getDatereponse());
		return "success";
	}
}
