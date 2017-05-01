package pl.ks.dev.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class PingController {


    @RequestMapping(value="/home",method = RequestMethod.GET)
    public String homepage(){
        return "index";
    }


    @RequestMapping("/ping")
    public String ping() {
        return LocalDateTime.now().toString();
    }
}
