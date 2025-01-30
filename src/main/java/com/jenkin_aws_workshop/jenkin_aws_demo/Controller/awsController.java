package com.jenkin_aws_workshop.jenkin_aws_demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/aws")
@RestController
public class awsController {
	@GetMapping
	public String welcomeAws()
	{
		return "Deploying AWS";
	}

}
