package cybersoft.javabackend.java16girahuyphan.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16girahuyphan.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16girahuyphan.role.mapper.GiraRoleMapper;
import cybersoft.javabackend.java16girahuyphan.role.model.GiraRole;
import cybersoft.javabackend.java16girahuyphan.role.repository.GiraRoleRepository;

@Service
public class GiraRoleServiceImpl implements GiraRoleService {

	@Autowired
	private GiraRoleRepository repository;

	@Override
	public List<GiraRole> findAllEntity() {
		return  repository.findAll();
			}

	@Override
	public GiraRole save(GiraRoleDTO dto) {
		GiraRole role = GiraRoleMapper.INSTANCE.mapToEntity(dto);
		return repository.save(role);
	}

}
