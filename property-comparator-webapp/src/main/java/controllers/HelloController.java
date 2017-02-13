/**
 * 
 */
package controllers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comparator.property.service.HelloService;

/**
 * @author xqv66
 *
 */
@Path("/hello")
@Component
public class HelloController {

	@Autowired
	private HelloService helloService;

	@GET
	@Path("/sayHello")
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
		return helloService.sayHello();
	}

}
