package lk.ijse.gdse72.spbootdeployment.controller;

import jakarta.validation.Valid;
import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import lk.ijse.gdse72.spbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }


    @PostMapping("create")
    public ResponseEntity<Customer> registerCustomer(@RequestBody @Valid Customer Customer) {
        return ResponseEntity.ok(customerService.saveCustomer(Customer));
}

}
