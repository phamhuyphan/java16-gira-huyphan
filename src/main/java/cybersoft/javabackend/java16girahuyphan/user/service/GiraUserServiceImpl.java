package cybersoft.javabackend.java16girahuyphan.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16girahuyphan.user.dto.GiraUserDTO;
import cybersoft.javabackend.java16girahuyphan.user.mapper.GiraUserMapper;
import cybersoft.javabackend.java16girahuyphan.user.model.GiraUser;
import cybersoft.javabackend.java16girahuyphan.user.repository.GiraUserRepository;

@Service
public class GiraUserServiceImpl implements GiraUserService {
	@Autowired
	private GiraUserRepository repository;

	@Override
	public GiraUserDTO createNewUser(GiraUserDTO dto) {
		GiraUser user = GiraUserMapper.INSTANCE.toModel(dto);
		
		GiraUser newUser = repository.save(user);
		
		return GiraUserMapper.INSTANCE.toDTO(newUser);
	}
} 
