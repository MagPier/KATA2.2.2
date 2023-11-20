package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) String count) {
        if(count==null){
            count="0";
        }
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Black", 444));
        cars.add(new Car("Mersedes", "White", 333));
        cars.add(new Car("Porshe", "Purple", 111));
        cars.add(new Car("Subaru", "Green", 666));
        cars.add(new Car("Ford", "Yellow", 777));
        if (Integer.parseInt(count) <= 0 || Integer.parseInt(count) > 5) {
            model.addAttribute("messages", cars);
        } else {
            model.addAttribute("messages", cars.subList(0, Integer.parseInt(count)));
        }
        return "cars";
    }
}
