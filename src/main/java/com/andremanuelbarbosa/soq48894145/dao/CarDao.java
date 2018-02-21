package com.andremanuelbarbosa.soq48894145.dao;

import com.andremanuelbarbosa.soq48894145.dao.mapper.CarMapper;
import com.andremanuelbarbosa.soq48894145.domain.Car;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(CarMapper.class)
public abstract class CarDao {

    @SqlQuery("select * from car where car_description = :car.carDescription")
    public abstract Car getCarDescription(@BindBean("car") Car car);
}
