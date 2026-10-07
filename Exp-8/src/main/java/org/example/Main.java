package org.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.example.entities.*;

public class Main {
    public static void main(String[] args){

        Configuration config = new Configuration();
        config.addAnnotatedClass(org.example.entities.Student.class);
        config.addAnnotatedClass(org.example.entities.StudentDetail.class);

        SessionFactory sf = config.buildSessionFactory();
        Session s = sf.openSession();

        try {
            s.beginTransaction();

            StudentDetail tomDetail = new StudentDetail();
            tomDetail.setZipCode(395001);

            Student tom = new Student();
            tom.setStudent_name("Tom Cruise");
            tom.setStudentDetail(tomDetail);
            s.persist(tom);
            s.getTransaction().commit();
        } finally {
            s.close();
            sf.close();
        }

    }
}
