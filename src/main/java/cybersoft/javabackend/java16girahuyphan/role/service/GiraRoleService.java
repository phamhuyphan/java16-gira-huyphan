package cybersoft.javabackend.java16girahuyphan.role.service;

import java.util.List;

import cybersoft.javabackend.java16girahuyphan.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girahuyphan.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	GiraRole save(GiraRoleDTO dto);
}
