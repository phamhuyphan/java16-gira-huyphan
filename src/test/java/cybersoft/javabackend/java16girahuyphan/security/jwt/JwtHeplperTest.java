package cybersoft.javabackend.java16girahuyphan.security.jwt;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JwtHeplperTest {

	@Autowired
	private JwtHeplper helper;
	
	@Test
	public void shouldBeInjectedSuccessfully() {
		assertNotNull(helper);
	}
}
