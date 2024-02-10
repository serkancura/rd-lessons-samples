package org.rd.lessons.lesson18.junitTestNg;


import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;

    public Customer(String firstname){
        this.firstname = firstname;
    }

    public Customer(String firstname, String email){
        this.firstname = firstname;
        this.email = email;
    }
}
