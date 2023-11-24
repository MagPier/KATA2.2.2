package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;


@Controller
public class CarController {
    private final CarDao carDao;

    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }


    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = true, defaultValue = "5") int count) {

            model.addAttribute("messages",  carDao.getUpTo5cars(count));
        return "cars";
    }
}
