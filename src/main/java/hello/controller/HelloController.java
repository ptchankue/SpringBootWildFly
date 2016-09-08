package hello.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by patricktchankue on 9/8/16.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    public ResponseEntity hello(){
        return new ResponseEntity("Hello African banker", HttpStatus.OK);
    }
}
