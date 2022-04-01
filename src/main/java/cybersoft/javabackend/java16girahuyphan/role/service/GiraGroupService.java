package cybersoft.javabackend.java16girahuyphan.role.service;

import java.util.List;

import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupWithRolesDTO;


public interface GiraGroupService {

	List<GiraGroupDTO> findAllDtoo();
	GiraGroupDTO createNewGroup(GiraGroupDTO dto);
	GiraGroupWithRolesDTO removeRole(String groupId, String roleId);
	GiraGroupWithRolesDTO addRole(String groupId, String roleId);
}
