package pl.dmichalski.c10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.dmichalski.c10.entity.Cat;
import pl.dmichalski.c10.entity.Owner;
import pl.dmichalski.c10.repository.CatRepository;
import pl.dmichalski.c10.repository.OwnerRepository;

/**
 * Author: Daniel
 */
public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring/spring-data.xml", "spring/spring-general.xml");

        OwnerRepository ownerRepository = context.getBean("ownerRepository", OwnerRepository.class);
        CatRepository catRepository = context.getBean("catRepository", CatRepository.class);

        Owner owner = new Owner();
        Cat cat = new Cat();
        owner.setFirstName("Thom");
        owner.setLastName("Long");
        cat.setName("bunny");
        owner.setCat(cat);

        catRepository.save(cat);
        ownerRepository.save(owner);
    }


}
