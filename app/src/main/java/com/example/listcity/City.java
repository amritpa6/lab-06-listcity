package com.example.listcity;
/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    /**
     * Name of the city
     */
    private String city;
    /**
     * Name of the province.
     */
    private String province;
    /**
     * Constructor for City
     * @param city  city name
     * @param province  province name
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * Gets the city name
     * @return  city name
     */
    String getCityName(){
        return this.city;
    }
    /**
     * Gets the province name
     * @return province name
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City other) {
        return this.city.compareTo(other.getCityName()); // compare by city name
    }
}