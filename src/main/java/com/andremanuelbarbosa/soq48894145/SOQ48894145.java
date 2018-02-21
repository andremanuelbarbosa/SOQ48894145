package com.andremanuelbarbosa.soq48894145;

import com.andremanuelbarbosa.soq48894145.dao.CarDao;
import com.andremanuelbarbosa.soq48894145.domain.Car;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class SOQ48894145 extends Application<SOQ48894145Configuration> {

    @Override
    public void initialize(Bootstrap<SOQ48894145Configuration> bootstrap) {

        bootstrap.addBundle(new MigrationsBundle<SOQ48894145Configuration>() {

            @Override
            public DataSourceFactory getDataSourceFactory(SOQ48894145Configuration soq48894145Configuration) {

                return soq48894145Configuration.getDataSourceFactory();
            }
        });
    }

    @Override
    public void run(SOQ48894145Configuration soq48894145Configuration, Environment environment) throws Exception {

        final DBI dbi = (new DBIFactory()).build(environment, soq48894145Configuration.getDataSourceFactory(), "SOQ48894145");

        final CarDao carDao = dbi.onDemand(CarDao.class);

        final Car car = new Car();
        car.setMake("VW");
        car.setModel("Golf");

        final Car carWithDescription = carDao.getCarDescription(car);

        System.out.println("Found car with Description: " + carWithDescription.getCarDescription());
    }

    public static void main(String[] args) throws Exception {

        new SOQ48894145().run(args);
    }
}