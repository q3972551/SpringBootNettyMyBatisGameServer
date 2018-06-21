package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author peanut
 * @date 2018/6/19
 */
@Controller
public class Test {

    @RequestMapping("/test")
    public @ResponseBody String test()
    {
        return "hello world";
    }
}
