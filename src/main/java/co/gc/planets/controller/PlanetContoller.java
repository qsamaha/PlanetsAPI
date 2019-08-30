package co.gc.planets.controller;

import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.gc.planets.entity.Planet;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;

@Controller
public class PlanetContoller {
	
	RestTemplate template = new RestTemplate();
	
	@RequestMapping("/")
	public ModelAndView home() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
		
		String url = "https://grandcircusco.github.io/demo-apis/planets.json";
		
		ResponseEntity<Planet[]> response = template.exchange(url, HttpMethod.GET, new HttpEntity<String>("parameters", headers), Planet[].class);
		
		return new ModelAndView ("index", "response", response.getBody());
	}
}