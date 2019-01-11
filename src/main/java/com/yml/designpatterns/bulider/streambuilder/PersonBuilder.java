package com.yml.designpatterns.bulider.streambuilder;

/**
 * @author Liuym
 * @date 2019/1/11 0011
 */
public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    private String phone;
    private char gender;

    private static volatile PersonBuilder personBuilder;

    public static PersonBuilder getInstance() {
        if (personBuilder == null) {
            synchronized (PersonBuilder.class) {
                if (personBuilder == null) {
                    personBuilder = new PersonBuilder();
                }
            }
        }
        return personBuilder;
    }

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public PersonBuilder gender(char gender) {
        this.gender = gender;
        return this;
    }

    public Person builder() {
        Person person = new Person();
        person.setName(this.name);
        person.setAddress(this.address);
        person.setAge(this.age);
        person.setGender(this.gender);
        person.setPhone(this.phone);
        return person;
    }


}
