package web.controller;

import Service.CarService;
import Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }
    @GetMapping("/{numb}")
    public String prCarsByNumb(@PathVariable("numb") int numb, ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add(carService.CarsByNumb(numb).toString());
        model.addAttribute("messages", messages);
        return "index";
    }
}