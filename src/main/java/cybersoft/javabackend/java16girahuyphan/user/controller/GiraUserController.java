package cybersoft.javabackend.java16girahuyphan.user.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java16girahuyphan.common.util.ResponseHelper;
import cybersoft.javabackend.java16girahuyphan.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girahuyphan.user.service.GiraUserService;

@RestController
@RequestMapping("user")
public class GiraUserController {
	@Autowired
	private GiraUserService service;
	
	@PostMapping
	public Object createNewUser(@RequestBody @Valid GiraUserDTO dto,BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return ResponseHelper.getErrorResponse(bindingResult, HttpStatus.BAD_REQUEST);
		GiraUserDTO newUser = service.createNewUser(dto);
		
		return ResponseHelper.getErrorResponse(bindingResult, HttpStatus.CREATED);
	} 
}
 