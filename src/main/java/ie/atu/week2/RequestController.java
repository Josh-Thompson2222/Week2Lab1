package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController
{
    @GetMapping("/sayHello")
    public String sayHello()
    {
        return "Hi there";
    }

    @GetMapping("/calculate")
    public String add(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation)
    {
        float ans = 0;
        switch (operation)
        {
            case "add":
                ans = num1 + num2;
                break;
            case "subtract":
                ans = num1 - num2;
                break;
            case "multiply":
                ans = num1 * num2;
                break;
            case "divide":
                if(num2 == 0) {
                    return "can't divide by 0!";
                }
                else{
                    ans = (float)num1/num2;
                }
                break;

            default:
                break;
        }
        return Float.toString(ans);
    }

}


