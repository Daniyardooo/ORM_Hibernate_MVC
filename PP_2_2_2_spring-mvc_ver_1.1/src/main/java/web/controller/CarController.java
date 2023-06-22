package web.controller;

import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cars")
public class CarController {


    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carService.CarsByNumb(5));
        return "cars";
    }


    @GetMapping(value = "", params = "count")
    public String prCarsByNumb(@RequestParam("count") int numb, ModelMap model) {
        model.addAttribute("cars", carService.CarsByNumb(numb));
        return "cars";
    }
}
