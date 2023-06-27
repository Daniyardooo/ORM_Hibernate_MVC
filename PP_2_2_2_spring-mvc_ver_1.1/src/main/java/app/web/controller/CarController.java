package app.web.controller;

import app.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carService.GetCarsByNumb(5));
        return "cars";
    }


    @GetMapping(value = "", params = "count")
    public String prCarsByNumb(@RequestParam("count") int numb, ModelMap model) {
        model.addAttribute("cars", carService.GetCarsByNumb(numb));
        return "cars";
    }
}
