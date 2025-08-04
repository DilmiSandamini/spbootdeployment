package lk.ijse.gdse72.spbootdeployment.controller;

import jakarta.validation.Valid;
import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping("/create")
    public Customer saveCustomer( @RequestBody @Valid Customer customer) {
        return customer;
    }
}
