package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:17
 */
public class BritishStyleHouseBuilderImpl implements IHouseBuilder {

    private House britishStyleHouse = new BritishStyleHouse();

    public House buildWall() {
        britishStyleHouse.setWall("英国风墙");
        return britishStyleHouse;
    }

    public House buildDoor() {
        britishStyleHouse.setDoor("英国风门");
        return britishStyleHouse;
    }

    public House buildFloor() {
        britishStyleHouse.setFloor("英国风地板");
        return britishStyleHouse;
    }

    public House buildWindow() {
        britishStyleHouse.setWindow("英国风窗户");
        return britishStyleHouse;
    }

    public House getHouse() {
        return britishStyleHouse;
    }
}
