package com.example.myfirebase;

public class Student {
    private String studentName;
    private String address;
    private String mobileNo;
    private String email;



    public Student(String studentName, String address, String mobileNo, String email) {
        this.studentName = studentName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.email = email;
    }

    public Student() {

    }


    public void setStudentName(String studentName) {

        this.studentName = studentName;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setMobileNo(String mobileNo) {

        this.mobileNo = mobileNo;
    }

    public void setEmail(String email) {

        this.email = email;
    }
    public String getStudentName() {

        return studentName;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNo() {

        return mobileNo;
    }

    public String getEmail() {

        return email;
    }


}
