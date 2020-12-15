package mvn.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Docker Java Web App running on container/pod: "+ System.getenv("HOSTNAME") ;
	}
	
}
