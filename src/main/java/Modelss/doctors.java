package Modelss;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class doctors {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;


    @Column
    String name;
    Integer phoneNum;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    patient patients;

}
