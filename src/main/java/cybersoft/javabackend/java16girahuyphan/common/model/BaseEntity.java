package cybersoft.javabackend.java16girahuyphan.common.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import cybersoft.javabackend.java16girahuyphan.role.model.GiraGroup;
import cybersoft.javabackend.java16girahuyphan.role.model.GiraRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
public class BaseEntity  implements Serializable{
	@Id
	@Type(type = "uuid-char")
	@GeneratedValue
	private UUID id;
	
	@Version
	protected int version;
	
	@CreatedDate
	protected LocalDateTime createdAt;
	
	@CreatedBy
	protected String createdBy;
	
	@CreatedDate
	protected LocalDateTime lastModifiedAt;
	
	@CreatedBy
	protected String lastModifiedBy;
}
