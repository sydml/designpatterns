package com.yml.designpatterns.bridge.birdgeexample;

/**
 * 优先使用对象的合成和聚合，而不是继承
 *
 * @author Liuym
 * @date 2018/12/31 0031
 */
public class Main {
    public static void main(String[] args) {
        PhoneSoft mp3 = new PhoneSoftMp3();
        PhoneSoft game = new PhoneSoftGame();

        PhoneBrand brandN = new PhoneBrandN(mp3);
        brandN.run();

        PhoneBrand brandM = new PhoneBrandM(game);
        brandM.run();

    }
}
