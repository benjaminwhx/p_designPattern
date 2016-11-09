package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:14
 */
public class ChinaStyleHouseBuilderImpl implements IHouseBuilder {

    private House chinaStyleHouse = new ChinaStyleHouse();

    public House buildWall() {
        chinaStyleHouse.setWall("中国风墙");
        return chinaStyleHouse;
    }

    public House buildDoor() {
        chinaStyleHouse.setDoor("中国风门");
        return chinaStyleHouse;
    }

    public House buildFloor() {
        chinaStyleHouse.setFloor("中国风地板");
        return chinaStyleHouse;
    }

    public House buildWindow() {
        chinaStyleHouse.setWindow("中国风窗户");
        return chinaStyleHouse;
    }

    public House getHouse() {
        return chinaStyleHouse;
    }
}
