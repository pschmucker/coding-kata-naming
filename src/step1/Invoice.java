import java.util.Date;
import java.util.List;

public class Invoice {

    Customer customer;
    PhoneNumber phoneNumber;
    Date issuedDate;
    Date dueDate;
    List<CallInvoiceLine> calls;
    List<SmsInvoiceLine> messages;
    double total;
    double taxes;
}
