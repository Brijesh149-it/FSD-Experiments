package org.example.entities;


import jakarta.persistence.*;

@Entity
public class StudentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STDETAIL_ID")
    int studentDetail_id;

    @Column(name = "ZIPCODE")
    int zipCode;

    public int getStudentDetail_id() {
        return studentDetail_id;
    }

    public void setStudentDetail_id(int studentDetail_id) {
        this.studentDetail_id = studentDetail_id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}
