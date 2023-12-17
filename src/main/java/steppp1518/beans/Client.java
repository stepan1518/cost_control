package steppp1518.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@PropertySource("classpath:User.properties")
public class Client implements User {
    @Value("${User.name}")
    private String _name;
    @Value("${User.age}")
    private int _age;
    @Value("${User.wastes}")
    private BigDecimal _wastes;
    @Value("${User.savings}")
    private BigDecimal _savings;
    @Value("${User.procent}")
    private BigDecimal _procent;
    @Value("${User.email}")
    private String _email;

    @Override
    public String toString() {
        return "Name : " + _name + "\nAge : " + String.valueOf(_age)
                + "\nWastes : " + String.valueOf(_wastes) + "\n\n\n";
    }

    @Override
    public String get_name() {
        return _name;
    }

    @Override
    public int get_age() {
        return _age;
    }

    @Override
    public BigDecimal get_wastes() {
        return _wastes;
    }

    @Override
    public BigDecimal get_savings() {
        return _savings;
    }

    @Override
    public BigDecimal get_procent() {
        return _procent;
    }

    @Override
    public void chargeProcent() {_savings = _savings.multiply(_procent);}

    @Override
    public String get_email() {
        return _email;
    }
}
