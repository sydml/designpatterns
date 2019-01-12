package com.yml.designpatterns.bulider.streambuilder.innerclassbuilder;

/**
 * @author Liuym
 * @date 2019/1/11 0011
 */
public class Person {
    private String name;
    private int age;
    private String address;
    private String phone;
    private char gender;
    
    public static class Builder{
        private String name;
        private int age;
        private String address;
        private String phone;
        private char gender;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder gender(char gender) {
            this.gender = gender;
            return this;
        }

        /**
         * 推荐使用构造函数的方式builder，创建本类使用
         * @return
         */
        public Person builder() {
            return new Person(this);
        }

        public Person builderOut() {
           return create(this);
        }

    }

    public Person(Builder builder) {
        name = builder.name;
        address = builder.address;
        gender = builder.gender;
        age = builder.age;
        phone = builder.phone;
    }

    /**
     * 可以用来builder 其他类
     *
     * @param builder
     * @return Person
     */
    public static Person create(Builder builder) {
        Person person = new Person(builder);
        person.name = builder.name;
        person.address = builder.address;
        person.gender = builder.gender;
        person.age = builder.age;
        person.phone = builder.phone;
        return person;
    }
}
