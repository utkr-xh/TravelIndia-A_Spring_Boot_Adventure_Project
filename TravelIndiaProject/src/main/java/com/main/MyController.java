package com.main;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TravelIndia")
public class MyController {
	
	
	@PostMapping("/AboutUs")
	public String about() {
		return "Welcome to TravelIndia. We are excited to take you on a new adventure.\n"
				+ "Click on the places to know more about your dream destination";
	}
	@PostMapping("/ContactUs")
	public String contact() {
		return "You can contact us on the details given below\n."
				+ "Phone No: +91 988xxxxx\n"
				+ "Email: travelindin@gmail.com";
	}
	
	
	@PostMapping("/places")
	public String places() {
		return "Here you can find your dream destinations to travel.\n"
				+ "Click on any of the destinations below to find more about them.\n"
				+ "Stay tuned as we are Adding more places soon..!";
	}
	
	@PostMapping("/places/rajasthan")
	public String Rajasthan() {
		return "Jaisalmer\n"
				+ "Explore the golden sand dunes and majestic forts.";

	}
	
	@PostMapping("/places/goa")
	public String Goa() {
		return "Baga Beach\n"
				+ "Enjoy vibrant nightlife and pristine beaches.";

	}
	
	@PostMapping("/places/himachal")
	public String HimachalPradesh() {
		return "Manali\n"
				+ "Experience snow-capped mountains and adventure sports.";
		
	}
	
	@PostMapping("/places/kerela")
	public String Kerala() {
		return "Munnar\n"
				+ "Discover lush tea gardens and serene backwaters.";
		
	}
}
