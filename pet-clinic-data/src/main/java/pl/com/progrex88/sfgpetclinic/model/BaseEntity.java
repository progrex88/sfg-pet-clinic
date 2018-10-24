package pl.com.progrex88.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

//    @Getter
//    @Setter
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
