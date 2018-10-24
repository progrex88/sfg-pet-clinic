package pl.com.progrex88.sfgpetclinic.services;

import pl.com.progrex88.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);



    
}
