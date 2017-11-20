package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import netty.ToString;

@RestController
public class GreetingController {

    public static final String template = "Hello, %s!";
    public static AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                            String.format(template, name));
    	String jj = "<div style=\"color:#00FF00\"> <h3>This is a header%s</h3> <p>This is a paragraph.</p> </div>";
        return String.format(jj, ""+counter.incrementAndGet());
//        return new Greeting(counter.incrementAndGet(),
//        		"<div style=\"color:#00FF00\"> <h3>This is a header</h3> <p>This is a paragraph.</p> </div>");
     
    }
}
