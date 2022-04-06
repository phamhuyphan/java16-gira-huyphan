package cybersoft.javabackend.java16girahuyphan.security.jwt;

import java.util.Date;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtHeplper {
	public String generateJwtToken(Authentication authentication) {
		if (authentication == null) {
			return null;
		}

		UserDetails userDetails = (UserDetails) authentication.getPrincipal();

		Date curentDate = new Date();
		
		return Jwts.builder()
					.setSubject(userDetails.getUsername())
					.setIssuedAt(curentDate)
					.setExpiration(new Date(curentDate.getTime()+86400))
					.signWith(SignatureAlgorithm.HS512,"Whatissecret")
					.compact();
	}
}
