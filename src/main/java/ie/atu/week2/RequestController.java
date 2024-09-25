package ie.atu.week2;

import org.springframework.web.bind.annotation.*;
//import

@RestController
@RequestMapping("/person")
public class RequestController {
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there";
    }

    @GetMapping("/greet/{name}")
    public String userName(@PathVariable String name)
    {
        return "User name is: " + name;
    }
    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age)
    {
        return name + " " + age;
    }
}
