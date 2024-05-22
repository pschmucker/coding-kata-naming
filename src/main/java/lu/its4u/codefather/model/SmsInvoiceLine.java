package lu.its4u.codefather.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SmsInvoiceLine extends InvoiceLine {

    private PhoneNumber destination;
    private int quantity;
    private double unitPrice;
}
