package steppp1518.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import steppp1518.database.Role;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

@Configuration
public class ClientConfig {
    @Bean
    public Collection<Role> getRoles() {
        var roles = new ArrayList<Role>();
        roles.add(Role.USER);
        return roles;
    }

    @Bean
    @Scope("prototype")
    public Date getDate() {
        return new Date();
    }
}
