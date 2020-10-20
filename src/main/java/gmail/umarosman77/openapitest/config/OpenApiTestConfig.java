package gmail.umarosman77.openapitest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiTestConfig {

	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String applicationDescription, @Value("${application-version}") String applicationVersion) {
		return new OpenAPI()
				.info(new Info()
						.title("sample application API")
						.version(applicationVersion)
						.description(applicationDescription));
	}
}
