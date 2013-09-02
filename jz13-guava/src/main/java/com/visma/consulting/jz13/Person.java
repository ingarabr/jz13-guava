package com.visma.consulting.jz13;

public class Person {

    private String firstname;
    private String lastname;
    private Sex sex;

    public Person setFirstname(String firstname) {
        this.firstname = firstname;
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Person setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Person setSex(Sex sex) {
        this.sex = sex;
        return this;
    }
}
