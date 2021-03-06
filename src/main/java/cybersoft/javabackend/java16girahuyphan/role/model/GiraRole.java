package cybersoft.javabackend.java16girahuyphan.role.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;

import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import cybersoft.javabackend.java16girahuyphan.common.model.BaseEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "gira_role")
public class GiraRole extends BaseEntity {

	@Size(min = 5,max = 5)
	private String code;
	
	@NotBlank
	private String description;
	
	@ManyToMany(mappedBy = "roles")
	Set<GiraGroup> groups = new LinkedHashSet<GiraGroup>();
}
