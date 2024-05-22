package lu.its4u.codefather.model;

import java.time.Duration;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CallInvoiceLine extends InvoiceLine {

    private PhoneNumber destination;
    private Duration duration;
    private double pricePerMinute;
}
