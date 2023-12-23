package steppp1518.service;

import java.math.BigDecimal;

public class Waste {
    private BigDecimal _amount;
    private Category _category;
    private String _email;

    public BigDecimal get_amount() {
        return _amount;
    }

    public Category get_category() {
        return _category;
    }

    public String get_email() {
        return _email;
    }
}
