/*
 * Create a Rest Controller to demonstrate the various HTTP Methods and respond hello messages to the User. To begin
 * with show Hello from BridgeLabz
 *	- Use GET Request Method
 *	- Use CURL to demonstrate the REST API Call
 *	- curl localhost:8080/hello -w "\n"
 *
 * @author: Pooja Roy
 */

package com.org.RestAPICalls;

import org.springframework.web.bind.annotation.RequestMapping;
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
}