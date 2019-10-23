package com.baeldung;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import com.baeldung.domain.Student;
import com.baeldung.repository.StudentRepository;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.context.TestPropertySource;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application.properties")
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class SpringJMeterControllerApplicationIntegrationTest {
   
   @Autowired
    private MockMvc mvc;

    @Autowired
    private StudentRepository repository;
	@Test
	public void contextLoads() {
	}
	    @Test
    public void createStudents() throws Exception {
        createTestStudents("bob","lname","1234567890","abcd@efgh.com");
        createTestStudents("alex","lname","1234567890","abcd@efgh.com");
    }

	private void createTestStudents(String fname,String lname, String phone,String email) {
        Student stdnt = new Student();
        repository.insert(stdnt);
		System.out.println("Inserted student......********************************************************************");
    }

}
