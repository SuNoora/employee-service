package kg.megalab.employee_service.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "contacts")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Contact {

    @Id
    @GeneratedValue
    Long id;
    String phoneNumber;
    String email;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    Employee employee;

}
