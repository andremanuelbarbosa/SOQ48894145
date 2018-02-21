package com.andremanuelbarbosa.soq48894145.dao.mapper;

import com.andremanuelbarbosa.soq48894145.domain.Car;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CarMapper implements ResultSetMapper<Car> {

    @Override
    public Car map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        final Car car = new Car();

        car.setMake(resultSet.getString("make"));
        car.setModel(resultSet.getString("model"));

        return car;
    }
}
