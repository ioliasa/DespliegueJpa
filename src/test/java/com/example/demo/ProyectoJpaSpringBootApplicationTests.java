package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.Usuario;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ProyectoJpaSpringBootApplicationTests {
	
	private static Usuario user;
	 @BeforeAll
	    public static void init() {
	        user = new Usuario();
	    }

	@Test
	void testGetDireccion() {
		user.setDireccion("Calle de la Fresa");
		assertTrue(user.getDireccion()=="Calle de la Fresa");
	}

}
