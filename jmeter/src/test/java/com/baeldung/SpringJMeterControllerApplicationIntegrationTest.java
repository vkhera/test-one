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
import com.baeldung.repository.StudentDataRestRepository;
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
    private StudentDataRestRepository repository;
	@Test
	public void contextLoads() {
	}
	@Test
    public void createStudents() throws Exception {
        createTestStudents(11223344L,"lname","1234567890");
        createTestStudents(33755656L,"lname","1234567890");
    }

	private void createTestStudents(long fname,String lname, String pnumber) {
        Student stdnt = new Student(fname,lname,pnumber);
//        repository.insert(stdnt);
		System.out.println("Inserted student......********************************************************************");
    }

}
