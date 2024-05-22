package lu.its4u.codefather.model;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class Invoice {

    private Customer customer;
    private PhoneNumber phoneNumber;
    private Date issuedDate;
    private Date dueDate;
    private List<CallInvoiceLine> calls;
    private List<SmsInvoiceLine> messages;
    private double total;
    private double taxes;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
