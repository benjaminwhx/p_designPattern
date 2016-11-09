package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:20
 */
public class HouseBuilderTest {

    public static void main(String[] args) {
        IHouseBuilder houseBuilder = new ChinaStyleHouseBuilderImpl();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        House house = houseDirector.buildHouse();
        System.out.println(house);
    }
}
