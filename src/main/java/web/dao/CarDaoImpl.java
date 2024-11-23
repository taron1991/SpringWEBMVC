package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> list = new ArrayList<>();

    {
        Collections.addAll(list, new Car("bmw", 250, "black"),
                new Car("opel", 90, "white"),
                new Car("kia", 100, "red"),
                new Car("nissan", 150, "black"),
                new Car("fiat", 50, "green"));
    }


    @Override
    public List<Car> findAll(Integer c) {
        if (c!= null && c >= 1 && c < 5) {
           return list.stream().limit(c).collect(Collectors.toList());
        }

        return list;
    }
}
