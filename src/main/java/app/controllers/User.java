package app.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManagerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    private Session session;

    public User(EntityManagerFactory factory) {
        session = factory.unwrap(SessionFactory.class).openSession();
    }

    @GetMapping("/user")
    public String getUser() {
        System.out.println(session);

        return "user";
    }
}
