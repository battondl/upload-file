package demo.thymeleaf;

import demo.thymeleaf.controller.UploadController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class UploadFileApplication {

	public static void main(String[] args) {
		new File(UploadController.UPLOAD_DIR).mkdir();

		SpringApplication.run(UploadFileApplication.class, args);
	}

}
