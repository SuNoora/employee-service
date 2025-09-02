package kg.megalab.employee_service.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "addresses")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Address {

    @Id
    @GeneratedValue
    Long id;
    String city;
    String street;
    int house;
    int flat;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    Employee employee;
}
