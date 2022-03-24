package cybersoft.javabackend.java16girahuyphan.role.dto;

import java.util.Set;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java16girahuyphan.role.model.GiraRole;

public class GiraGroupWithRolesDTO {
	private UUID id;

	private String code;

	private String description;
	
	Set<GiraRoleDTO> roles;
}
