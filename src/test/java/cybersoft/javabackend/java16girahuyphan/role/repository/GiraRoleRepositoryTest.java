package cybersoft.javabackend.java16girahuyphan.role.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cybersoft.javabackend.java16girahuyphan.role.model.GiraRole;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GiraRoleRepositoryTest {
	
	@Autowired
	private GiraRoleRepository repository;
	
	@Test
	public void shoudNotInsertRole() {
		GiraRole role = GiraRole.builder()
								.code("FIVEH")
								.description("Description")
								.build();
		assertDoesNotThrow(()-> repository.save(role));
	}
	
}

