package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Dao.CarDao;
import web.Dao.CarDaoImpl;
import web.model.Car;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = true, defaultValue = "5") int count) {
        CarDao carDao = new CarDaoImpl();
        List<Car> cars = carDao.create5Car();
        if (count <= 0 || count > 5) {
            model.addAttribute("messages", cars);
        } else {
            model.addAttribute("messages", cars.subList(0, count));
        }
        return "cars";
    }
}
