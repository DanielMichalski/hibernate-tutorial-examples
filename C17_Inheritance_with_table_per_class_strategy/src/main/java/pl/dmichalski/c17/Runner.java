package pl.dmichalski.c17;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c17.entity.Professor;
import pl.dmichalski.c17.entity.Student;
import pl.dmichalski.c17.repository.PersonRepository;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-general.xml", "spring/spring-data.xml");

        PersonRepository personRepository =
                context.getBean("personRepository", PersonRepository.class);

        Professor professor = new Professor();
        professor.setFirstName("John");
        professor.setLastName("Long");
        professor.setSalary(16000.0);

        Student student = new Student();
        student.setFirstName("Lucky");
        student.setLastName("Luck");
        student.setAverageGrade(4.75);

        personRepository.save(professor);
        personRepository.save(student);
    }

}
