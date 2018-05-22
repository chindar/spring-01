/**
 * @filename: CarFactoryBean.java
 * @author: Wang Chinda
 * @date: 2018-05-22
 * @version: v1.0
 * @copyright: Copyright © 2018 上海丝金供应链管理有限公司大连分公司 版权所有
 * @modify_history: -
 * 20180522   Wang Chinda   create
 * 20180522   Wang Chinda   modify   method()
 */
package com.itdoc.learn.source.factory;

import org.springframework.beans.factory.FactoryBean;

/**
 * @desc FactoryBean测试的工厂类
 * @author Wang Chinda
 * @create 2018-05-22 16:17
 */
public class CarFactoryBean implements FactoryBean<Car> {

    /** 车的详细信息 */
    private String carInfo;

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(",");
        car.setBrand(infos[0].trim());
        car.setMaxSpeed(Integer.valueOf(infos[1].trim()));
        car.setPrice(Double.valueOf(infos[2].trim()));
        return car;
    }

    @Override
    public Class<Car> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
