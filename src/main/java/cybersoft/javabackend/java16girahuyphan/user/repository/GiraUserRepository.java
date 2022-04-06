package cybersoft.javabackend.java16girahuyphan.user.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import cybersoft.javabackend.java16girahuyphan.user.model.GiraUser;

public interface GiraUserRepository extends JpaRepository<GiraUser, UUID>{
	Optional<GiraUser> findByUsername(String username);

	Optional<GiraUser> findByEmail(String email);
	
	Optional<GiraUser> findByEmailAndUsername(String email, String username);
}
