package lk.ijse.gdse72.spbootdeployment.controller;

import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping("/create")
    public Customer saveCustomer(Customer customer) {
        return customer;
    }
}
