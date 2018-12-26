package com.yml.designpatterns.prototype;

/**
 * @author Liuym
 * @date 2018/12/20 0020
 */
public abstract class Prototype {
    public Prototype() {
    }

    private Long id;

    public Prototype(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

   abstract Prototype cloneProtorype();
}
