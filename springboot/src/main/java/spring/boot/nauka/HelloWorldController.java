package spring.boot.nauka;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Piotr Kulma on 22.05.15.
 */

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap modelMap) {
        modelMap.addAttribute("message", "OK");
        return "hello";
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    @ResponseBody
    public Person helloReposnseBody(ModelMap modelMap) {
        modelMap.addAttribute("message", "OK");
        return new Person("Piotr", "Kulma",new Date());
    }
}
