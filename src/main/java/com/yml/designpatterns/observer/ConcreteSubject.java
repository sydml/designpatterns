package com.yml.designpatterns.observer;

/**
 * @author Liuym
 * @date 2018/12/25 0025
 */
public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
