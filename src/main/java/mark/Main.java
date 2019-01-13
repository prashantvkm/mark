/**
 * 
 */
package mark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @author prashant
 *
 */

@SpringBootApplication
@EnableJpaAuditing
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
