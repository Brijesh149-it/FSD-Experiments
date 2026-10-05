package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class StudentDAO {
    private SessionFactory factory;
    public StudentDAO(SessionFactory factory) {
        this.factory = factory;
    }

    public void save(Student student) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(student);
        session.getTransaction().commit();
        session.close();
    }

    public Student get(int id) {
        Session session = factory.openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    public List<Student> getAll() {
        Session session = factory.openSession();
        List<Student> students =
                session.createQuery("from Student", Student.class).list();
        session.close();
        return students;
    }

    public void update(Student student) {
        Session session = factory.openSession();
        session.beginTransaction();
        session.merge(student);
        session.getTransaction().commit();
        session.close();
    }

    public void delete(int id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Student student = session.get(Student.class, id);
        if (student != null) {
            session.remove(student);
        }
        session.getTransaction().commit();
        session.close();
    }
}