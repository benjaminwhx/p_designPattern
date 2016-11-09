package com.jd.jr.dp.creational.builder.builder2;

/**
 * User: 吴海旭
 * Date: 2016-11-09
 * Time: 下午-1:12
 * 房子实体类
 */
public class House {

    private String door;
    private String floor;
    private String wall;
    private String window;

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "House{" +
                "door='" + door + '\'' +
                ", floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", window='" + window + '\'' +
                '}';
    }
}
