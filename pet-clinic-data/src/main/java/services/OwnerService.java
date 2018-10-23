package services;

import pl.com.progrex88.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findbyID(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

    
}
