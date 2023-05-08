package nika.home.learnweb;

import nika.home.learnweb.database.repositories.CarRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LearnWebApplicationTests {
    
    @Autowired
    public CarRepo carrepo;
    
	@Test
	void contextLoads() {
               
	}

}