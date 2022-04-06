package cybersoft.javabackend.java16girahuyphan.user.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java16girahuyphan.user.model.UserStatus;
import cybersoft.javabackend.java16girahuyphan.user.validation.annotation.UniqueEmail;
import cybersoft.javabackend.java16girahuyphan.user.validation.annotation.UniqueUsername;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class GiraUserDTO {
	@Size(min = 3, max = 100, message = "{user.username.size}")
	@UniqueUsername(message = "{user.username.existed}")
	@NotBlank
	private String username;
	
	private String password;
	
	private String displayName;
	
	@UniqueEmail(message = "{user.email.existed}")
	@NotBlank
	private String email;
	
	private UserStatus status;
}
