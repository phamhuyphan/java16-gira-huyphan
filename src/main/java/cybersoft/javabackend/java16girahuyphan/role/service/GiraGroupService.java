package cybersoft.javabackend.java16girahuyphan.role.service;

import java.util.List;

import cybersoft.javabackend.java16girahuyphan.role.dto.GiraGroupDTO;


public interface GiraGroupService {

	List<GiraGroupDTO> findAllDtoo();
	GiraGroupDTO createNewGroup(GiraGroupDTO dto);
}
