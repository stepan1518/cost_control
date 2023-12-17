package steppp1518.beans;

import java.math.BigDecimal;

public interface User {
    String get_name();
    String get_email();
    int get_age();
    BigDecimal get_wastes();
    BigDecimal get_savings();
    BigDecimal get_procent();
    void chargeProcent();
}
