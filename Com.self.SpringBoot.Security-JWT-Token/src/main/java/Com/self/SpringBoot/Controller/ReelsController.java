package Com.self.SpringBoot.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReelsController {

	@PostMapping("/upload/reel")
	public String UploadReel() {
		
		
		return "Reel uploaded";
	}
	
}
