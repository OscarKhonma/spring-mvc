package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.MVCService;

@Controller
public class CarController {

    private MVCService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam("count") int count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }
}

