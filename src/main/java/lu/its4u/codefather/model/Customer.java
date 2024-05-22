package lu.its4u.codefather.model;

import lombok.Data;

@Data
public class Customer {

    private String firstName;
    private String lastName;
    private Address address;
    private String email;
}
