/*
     * UC1: Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User. To begin
     * with show Hello from BridgeLabz
     *	- Use GET Request Method
     *	- Use CURL to demonstrate the REST API Call
     *	- curl localhost:8080/hello -w "\n"
     *
     * UC2: Make REST Call to show Hello Pooja from BridgeLabz
     *   - Use GET Request Method and pass name as query parameter
     *   - Use CURL to demonstrate the REST API Call
     *   - curl localhost:8080/getHelloMessage?name=Pooja -w "\n"
 */
package com.org.RestAPICalls.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    /*
     * Once the requestMapping hit the server, sayHello() is called and Standard message is displayed as output.
     * @return
     */
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello I am From Bridgelabz";
    }

    /*
     *Once getMapping hit the server sayHello() method is called and standard message is display with name parameter
     * @param: name
     * @return
     */
    @GetMapping(value = "/getHelloMessage")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello I am " + name + " From Bridgelabz.";
    }
}