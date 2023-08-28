@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! Your application is running";
    }
}