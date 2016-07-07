package jahv.springboot.controller;

import jahv.springboot.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by ahernandez on 7/7/16.
 */
@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public int add(@RequestParam(required = true, name = "number1") final int a,
                   @RequestParam(required = true, name = "number2") final int b) {
        return calculatorService.add(a, b);
    }
}
