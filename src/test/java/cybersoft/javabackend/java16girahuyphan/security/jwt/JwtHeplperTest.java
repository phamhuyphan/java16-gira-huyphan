package cybersoft.javabackend.java16girahuyphan.security.jwt;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import cybersoft.javabackend.java16girahuyphan.user.model.GiraUser;

@SpringBootTest
public class JwtHeplperTest {
	
	@Autowired
	private JwtHeplper heplper;
	
	@Test
	public void shouldBeInjectedSuccessfully() {
		assertNotNull(heplper);
	}
	
	@Test
	public void shouldGenerateJwtToken() {
		GiraUser user = GiraUser.builder()
				.username("testUser")
				.build();
		Authentication authentication = new UsernamePasswordAuthenticationToken(user,null,null);
		String jwt = heplper.generateJwtToken(authentication);
		assertNotNull(jwt);
	}
}
