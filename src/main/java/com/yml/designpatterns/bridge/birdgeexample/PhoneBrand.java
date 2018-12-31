package com.yml.designpatterns.bridge.birdgeexample;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public abstract class PhoneBrand {

    protected PhoneSoft phoneSoft;

    public PhoneBrand(PhoneSoft phoneSoft) {
        this.phoneSoft = phoneSoft;
    }

    public abstract void run();
}
