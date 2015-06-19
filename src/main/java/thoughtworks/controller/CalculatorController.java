package thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thoughtworks.model.Calculator;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void calculate(@RequestBody Calculator calculator, Model model) {

    }

}
