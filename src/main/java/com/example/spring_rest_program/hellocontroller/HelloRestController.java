package com.example.spring_rest_program.hellocontroller;

import com.example.spring_rest_program.User.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping("/home")//GET http://localhost:8080/home
    public String sayHello() {
        return "Hello from Bridgelabz!!";
    }
    @GetMapping("/query")//GET http://localhost:8080/query?name=Sahil
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/param/{name}")// GET http://localhost:8080/param/Sahil
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post") //POST //http://localhost:8080/post //JSON: {
   //"firstName":"Sahil","lastName":"Khan" }
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstName}") //PUT http://localhost:8080/put/Sahil?lastName=Khan
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }

    @PutMapping("/put1/{firstName}") //PUT http://localhost:8080/put/Sahil?lastName=Khan
    public String sayHello2(@PathVariable String firstName, @RequestBody User uses) {
        return "Hello " + firstName + " " + uses.getLastName() + "!";
    }
}
