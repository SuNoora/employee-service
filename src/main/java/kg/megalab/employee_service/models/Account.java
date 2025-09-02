package kg.megalab.employee_service.models;

import jakarta.persistence.*;
import kg.megalab.employee_service.models.enums.AccountStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "accounts")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, length = 50, unique = true)
    String login;
    @Column(nullable = false, length = 50)
    String password;
    @Enumerated(EnumType.STRING)
    AccountStatus status;
}
