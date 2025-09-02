package kg.megalab.employee_service.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "employees")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, length = 50)
    String firstName;
    @Column(nullable = false, length = 100)
    String LastName;
    String birthOfDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    Account account;
}
