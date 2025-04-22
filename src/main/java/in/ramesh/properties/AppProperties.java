package in.ramesh.properties;

import java.util.HashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
public class AppProperties {
	
	private HashMap<String, String> message = new HashMap<>();

	public HashMap<String, String> getMessage() {
		return message;
	}

	public void setMessage(HashMap<String, String> message) {
		this.message = message;
	}
	

}
