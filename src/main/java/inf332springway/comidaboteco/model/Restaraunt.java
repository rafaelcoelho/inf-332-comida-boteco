package inf332springway.comidaboteco.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity
public class Restaraunt {

    @Id
    private Long id;
    private String name;
    private String address;
    private String phone;

}
