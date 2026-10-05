package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Configuration config = new Configuration();
        config.addAnnotatedClass(org.example.Student.class);
        SessionFactory factory = config.buildSessionFactory();

        StudentDAO dao = new StudentDAO(factory);

        Student student = new Student("Tom Cruise", 25);
        dao.save(student);

        Student found = dao.get(student.getId());
        System.out.println("Student Found: " + found);

        found.setName("Tom Updated");
        dao.update(found);
        System.out.println("Student Updated: " + dao.get(found.getId()));

        dao.delete(found.getId());
        factory.close();
    }
}