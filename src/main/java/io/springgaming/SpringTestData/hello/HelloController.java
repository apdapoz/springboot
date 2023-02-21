package io.springgaming.SpringTestData.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //whenever there is a request at url /hello, it will call this method
    //by default @requestmapping uses HTTP GET
    @RequestMapping("/hello")
    public String sayHi() {
        return "Hi";
    }

}
