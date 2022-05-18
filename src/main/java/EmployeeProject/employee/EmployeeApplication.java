package EmployeeProject.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployeeApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
		log.info("Logger is Activated!!");
        System.out.println("Logger");

}
}
