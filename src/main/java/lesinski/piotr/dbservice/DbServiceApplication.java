package lesinski.piotr.dbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "lesinski.piotr.dbservice.repository")
@SpringBootApplication
public class DbServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DbServiceApplication.class, args);
    }
}
