package com.example.Exp_10;
import jakarta.validation.constraints.*;

public class Student {

    @NotBlank(message = "Name is required")
    @Pattern(regexp = "^[a-zA-Z .]+$",
            message = "Name must contain only letters")
    private String studentName;

    @NotBlank(message = "Contact is required")
    @Pattern(regexp = "^[6-9][0-9]{9}$",
            message = "Enter a valid 10-digit contact number")
    private String studentContact;

    @Size(min = 1, message = "Select at least one hobby")
    private String[] hobbies;

    @NotBlank(message = "Please select gender")
    @Pattern(regexp = "^(male|female)$",
            message = "Select a valid gender")
    private String studentGender;

    @NotNull(message = "Pincode is required")
    @Min(value = 100000, message = "Pincode must be 6 digits")
    @Max(value = 999999, message = "Pincode must be 6 digits")
    private Integer studentPincode;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public Integer getStudentPincode() {
        return studentPincode;
    }

    public void setStudentPincode(Integer studentPincode) {
        this.studentPincode = studentPincode;
    }
}
