package cybersoft.javabackend.java16girahuyphan.role.service;

import java.util.List;

import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupWithRolesDTO;


public interface GiraGroupService {

	List<GiraGroupDTO> findAllDto();
	GiraGroupDTO createNewGroup(GiraGroupDTO dto);
	GiraGroupWithRolesDTO addRole(String groupId, String roleId);
	GiraGroupWithRolesDTO removeRole(String groupId, String roleId);
}
