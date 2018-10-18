package pl.com.progrrex88.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


public class Pet {

    @Getter
    @Setter
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;


}
