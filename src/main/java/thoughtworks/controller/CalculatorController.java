package thoughtworks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import thoughtworks.model.Calculator;

@Controller
@RequestMapping(value = "/")
public class CalculatorController {

    @RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public String calculate(@ModelAttribute("SpringWeb") Calculator calculator, ModelMap model) {
        model.addAttribute("firstNumber", calculator.getFirstNumber());
        model.addAttribute("secondNumber", calculator.getSecondNumber());
        model.addAttribute("result", calculator.calculate());
        model.addAttribute("calculator",calculator);
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {

        model.addAttribute("calculator", new Calculator());
        return "index";
    }

}
