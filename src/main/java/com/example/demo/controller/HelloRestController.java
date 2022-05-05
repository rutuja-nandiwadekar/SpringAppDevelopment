package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {
    /**
     * UC1
     * Create a Rest Controller to demonstrate the various HTTP Methods and
     * respond hello messages to the User.
     * To begin with show Hello from BridgeLabz
     * - Use GET Request Method
     * - Use CURL to demonstrate the REST API Call
     * http://localhost:8080/hello/RUTU
     * @return Hello RUTU from bridgelabz
     */
    @GetMapping("/hello/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " from bridgelabz";
    }

    /**
     * UC2
     * Make REST Call to show Hello Mark from BridgeLabz
     * - Use GET Request Method and pass name as query parameter
     * - Use CURL to demonstrate the REST API Call
     * http://localhost:8080/query?name=rutuja
     * @return Hello rutuja from bridgelabz
     */
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name +" from bridgelabz";
    }

    /**
     * UC3
     * Make REST Call to show Hello from BridgeLabz
     * - Use GET Request Method and pass name as path variable
     * - Use CURL to demonstrate the REST API Call
     *  http://localhost:8080/home
     *  @return Hello From Bridgelabz!!!
     */
    @RequestMapping(value = {"", "/", "/home"})
    public String sayHello() {
        return "Hello From Bridgelabz!!!";
    }

    /**
     * UC4
     * Make REST Call to show Hello Mark Taylor from BridgeLabz
     * - Use POST Request Method and pass first name and last name in the Body
     * - Create User DTO Bean with firstName and lastName as attributes.
     * - Use CURL to demonstrate the REST API Call
     * {"firstName":"rutu",
     *   "lastName":"nandiwadekar"
     *   }
     * http://localhost:8080/create-user
     * @return user = rutu  nandiwadekar from bridgelabz
     */
    @PostMapping("/create-user")
    public String createUser(@RequestBody User user) {
        return "user = " + user.getFirstName() + "  " + user.getLastName() + " from bridgelabz";
    }

    /**
     * UC5
     * Make REST Call to show Hello Mark Taylor from BridgeLabz
     * - Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter
     * - Use CURL to demonstrate the REST API Call
     * http://localhost:8080/put/Rutu/?lastName= nandiwadekar
     *  @return Hello Rutu  nandiwadekar from bridgelabz!
     */
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + " from bridgelabz!";
    }
}

