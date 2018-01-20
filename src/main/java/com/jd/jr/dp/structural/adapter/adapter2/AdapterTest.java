package com.jd.jr.dp.structural.adapter.adapter2;

import com.jd.jr.dp.structural.adapter.adapter2.Bird;
import com.jd.jr.dp.structural.adapter.adapter2.Dog;
import com.jd.jr.dp.structural.adapter.adapter2.Fish;

/**
 * User: benjamin.wuhaixu
 * Date: 2018-01-20
 * Time: 5:15 pm
 */
public class AdapterTest {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        Fish fish = new Fish();
        fish.swim();
        Bird bird = new Bird();
        bird.fly();
    }
}
