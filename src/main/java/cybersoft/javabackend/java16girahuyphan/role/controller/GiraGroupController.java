package cybersoft.javabackend.java16girahuyphan.role.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cybersoft.javabackend.java16girahuyphan.common.util.ErrorHeplper;
import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16girahuyphan.role.service.GiraGroupService;

@RestController
@RequestMapping("groups")
public class GiraGroupController {
	
	@Autowired
	private GiraGroupService service;
	
	@GetMapping
	public Object findAllGroups() {
		List<GiraGroupDTO> groups = service.findAllDtoo();
		
		return new ResponseEntity<>(groups,HttpStatus.OK);
	}
	
	@PostMapping
	public Object createNewGroup(@Valid @RequestBody GiraGroupDTO dto,BindingResult result){
		if(result.hasErrors()) {
			return new ResponseEntity<>(ErrorHeplper.getAllError(result),HttpStatus.OK);
		}
		
		GiraGroupDTO newGroup = service.createNewGroup(dto);
		return new ResponseEntity<>(newGroup,HttpStatus.CREATED);
		
	}
}
