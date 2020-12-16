package mvn.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ControllerView {

		@RequestMapping("/cv")
		public String cv() {
			return "cv";
		}

}
