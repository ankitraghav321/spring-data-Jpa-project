package com.ankit.spring_data_jpa_ex;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ankit.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

        StudentRepo repo = context.getBean((StudentRepo.class));

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        Student s3 = context.getBean(Student.class);

//        s1.setRollNo(101);
//        s1.setName("Ankit");
//        s1.setMarks(75);
//
//        s2.setRollNo(102);
//        s2.setName("rahul");
//        s2.setMarks(80);

//        repo.save(s1);
//        repo.save(s2);

//        System.out.println(repo.findAll());

//        System.out.println(repo.findById(101));
//        System.out.println(repo.findByName("Ankit"));
        s2.setRollNo(102);
        s2.setName("himanshu");
        s2.setMarks(80);
        repo.save(s2);
	}

}
