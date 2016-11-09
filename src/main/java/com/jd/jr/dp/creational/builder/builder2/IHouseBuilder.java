package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:12
 */
public interface IHouseBuilder {

    House buildWall();

    House buildDoor();

    House buildFloor();

    House buildWindow();

    House getHouse();
}
