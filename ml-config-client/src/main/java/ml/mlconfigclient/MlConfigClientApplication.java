package ml.mlconfigclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MlConfigClientApplication {

	private static final Logger LOG = LoggerFactory.getLogger(MlConfigClientApplication.class);

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(MlConfigClientApplication.class, args);

		String mongoHost = ctx.getEnvironment().getProperty("spring.data.mongodb.host");
		String rabbitHost = ctx.getEnvironment().getProperty("spring.rabbitmq.host");
		LOG.info("Connected to MongoDb: {}", mongoHost);
		LOG.info("Connected to MongoDb: {}", rabbitHost);
	}

}
