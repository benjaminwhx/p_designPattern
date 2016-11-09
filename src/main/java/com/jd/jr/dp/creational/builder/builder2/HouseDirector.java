package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:20
 */
public class HouseDirector {

    private IHouseBuilder houseBuilder;

    public HouseDirector(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse() {
        houseBuilder.buildDoor();
        houseBuilder.buildFloor();
        houseBuilder.buildWall();
        houseBuilder.buildWindow();
        return houseBuilder.getHouse();
    }
}
