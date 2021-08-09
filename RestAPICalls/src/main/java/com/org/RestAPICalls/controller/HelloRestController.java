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
     *
     * UC3: Make REST Call to show Hello Mark from BridgeLabz
     *  - Use GET Request Method and pass name as path variable
     *  - Use CURL to demonstrate the REST API Call
     *  - curl localhost:8080/home/param/Pooja -w "\n"
     *
     * UC4: Make REST Call to show Hello I am Pooja Roy from BridgeLabz
     *  - Use POST Request Method and pass first name and last name in the Body
     *  - Create User DTO Bean with firstName and lastName as attributes.
     *  - Use CURL to demonstrate the REST API Call
     *  - curl -X POST -H "Content-Type: application/json" -d '{"firstName": ”Mark","lastName": ”Taylor"}' "http://localhost:8080/hello/post" -w "\n"
     *
     * UC5: Make REST Call to show Hello I am Pooja Roy from BridgeLabz
     *  - Use PUT Request Method and pass first name as Path Variable and last name as Query Parameter
     *  - Use CURL to demonstrate the REST API Call
     *  - curl -X PUT localhost:8080/hello/put/Pooja/?lastName=Roy -w "\n"
 */
package com.org.RestAPICalls.controller;

import com.org.RestAPICalls.dto.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
     * Once getMapping hit the server sayHello() method is called and standard message is display with name parameter
     * @param: name
     * @return
     */
    @GetMapping(value = "/getHelloMessage")
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello I am " + name + " From Bridgelabz.";
    }

    /*
     * Once getMapping hit the server sayHelloWithParam() method is called and name is given as Path veriable
     * @param: name
     * @return
     */
    @GetMapping("home/param/{name}")
    public String sayHelloWithParam(@PathVariable String name) {
        return "Hello I am " + name + " From Bridgelabz.";
    }

    /*
    * Post Request
    * @param: sutdent
     */

    @PostMapping("/post")
    public String sayHello(@RequestBody Student student) {
        return "Hello I am " + student.getFirstName() + " " + student.getLastName() + " from Bridgelabz.";
    }
    /*
     * Put Request
     * @param: sutdent
    */
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
        return "Hello I am " + firstName + " " + lastName + " from Bridgelabz";
    }
}