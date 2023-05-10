package Modelss;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class hospitals {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;


    @Column
    String name;
    Integer phoneNum;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    patient patients;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    doctors Doctors;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    medical_appointments med_appointments;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    prescriptions prescription;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    medical_records med_records;

    @ManyToOne
    @JoinColumn(name = "users_id",referencedColumnName = "id")
    test_results Test_result;


}
