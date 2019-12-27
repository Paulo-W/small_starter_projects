package paul.small.projects.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import(FeignClientsConfiguration.class)
@EnableFeignClients
@PropertySource("classpath:server-location.properties")
public class ClientApplication {

}
