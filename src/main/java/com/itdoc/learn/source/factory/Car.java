/**
 * @filename: Car.java
 * @author: Wang Chinda
 * @date: 2018-05-22
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180522   Wang Chinda   create
 * 20180522   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.factory;

/**
 * @desc FactoryBean 的使用
 * @author Wang Chinda
 * @create 2018-05-22 16:07
 */
public class Car {
    /** 最大速度 */
    private int maxSpeed;
    /** 品牌 */
    private String brand;
    /** 价钱 */
    private double price;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
