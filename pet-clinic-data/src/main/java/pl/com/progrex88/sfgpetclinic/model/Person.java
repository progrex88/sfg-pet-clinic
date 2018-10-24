package pl.com.progrex88.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;


public class Person extends BaseEntity {

    @Getter
    @Setter
    private Long id;
    private String firstName;
    private String lastName;


}
