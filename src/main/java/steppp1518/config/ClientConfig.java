package steppp1518.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import steppp1518.database.Role;
import steppp1518.database.Waste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Configuration
@ComponentScan("steppp1518.beans")
public class ClientConfig {
    @Bean
    public Collection<Role> getRoles() {
        var roles = new ArrayList<Role>();
        roles.add(Role.USER);
        return roles;
    }
}
