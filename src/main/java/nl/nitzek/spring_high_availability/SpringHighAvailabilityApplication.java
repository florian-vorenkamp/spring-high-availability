package nl.nitzek.spring_high_availability;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class SpringHighAvailabilityApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(SpringHighAvailabilityApplication.class, args);
	}
}
