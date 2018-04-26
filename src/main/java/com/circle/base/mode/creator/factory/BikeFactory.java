package com.circle.base.mode.creator.factory;

/**
 * @Description
 * @Author xiyongchun
 * @Date 2018/4/3 下午2:05
 */
public class BikeFactory {

    public static final String ROAD_BIKE = "ROAD_BIKE";
    public static final String MOUNTAIN_BIKE = "MOUNTAIN_BIKE";

    public static void main(String[] args) {
        BikeFactory factory = new BikeFactory();
        Bike roadBike = factory.getBike(ROAD_BIKE);
        roadBike.draw();

        Bike mountainBike = factory.getBike(MOUNTAIN_BIKE);
        mountainBike.draw();
    }

    public Bike getBike(String bikeType){
        switch (bikeType){
            case ROAD_BIKE : return new RoadBike();
            case MOUNTAIN_BIKE : return new MountainBike();
            default : return null;
        }
    }
}
