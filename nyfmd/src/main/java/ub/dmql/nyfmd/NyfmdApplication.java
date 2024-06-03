package ub.dmql.nyfmd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("ub.dmql.nyfmd.entity")
public class NyfmdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NyfmdApplication.class, args);
	}

}
