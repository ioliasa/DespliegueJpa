package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProyectoJpaSpringBootApplicationTests {

	@Test
	void testGetDireccion() {
		user.setDireccion("Calle de la Fresa");
		assertTrue(user.getDireccion()=="Calle de la Fresa");
	}

}
