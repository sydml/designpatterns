package com.yml.designpatterns.bridge.birdgeexample;

/**
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class PhoneBrandM extends PhoneBrand {

    public PhoneBrandM(PhoneSoft phoneSoft) {
        super(phoneSoft);
    }

    @Override
    public void run() {
        phoneSoft.run();
    }
}
