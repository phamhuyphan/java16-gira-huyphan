package cybersoft.javabackend.java16girahuyphan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellComeController {
	@GetMapping
	public Object welcome() {
		return "Hé Lu";
		
	}
}
