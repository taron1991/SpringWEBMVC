package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.ServiceCar;

import java.util.List;

@Controller
public class CarController {

    private ServiceCar serviceCar;

    @Autowired
    public CarController(ServiceCar serviceCar) {
        this.serviceCar = serviceCar;
    }

    @GetMapping("/cars")
    public String getCars(Model model,@RequestParam(required = false) Integer count) {
        List<Car> cars = serviceCar.findAll(count);
        model.addAttribute("cars", cars);
        return "cars.html";
    }
}
