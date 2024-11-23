package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class ServiceCarImpl implements ServiceCar {
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> findAll(Integer c) {
        return carDao.findAll(c);
    }
}
