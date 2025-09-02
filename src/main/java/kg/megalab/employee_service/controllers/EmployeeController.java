package kg.megalab.employee_service.controllers;

import jakarta.validation.Valid;
import kg.megalab.employee_service.models.dto.EmployeeCreateDto;
import kg.megalab.employee_service.services.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    //dependency injection
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("")
    public ResponseEntity<?> createEmployee(@RequestBody @Valid EmployeeCreateDto employeeCreateDto){
        try {
            Long employeeId = employeeService.appendEmployee(employeeCreateDto);
            Map<String, Long> map = new HashMap<>();
            map.put("emlployee_id", employeeId);

            return ResponseEntity.status(HttpStatus.CREATED).body(map);

        } catch (RuntimeException e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        }
    }
}
