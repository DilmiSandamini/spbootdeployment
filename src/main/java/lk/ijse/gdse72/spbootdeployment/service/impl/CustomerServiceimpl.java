package lk.ijse.gdse72.spbootdeployment.service.impl;

import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import lk.ijse.gdse72.spbootdeployment.repo.CustomerRepo;
import lk.ijse.gdse72.spbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceimpl implements CustomerService {
    private final CustomerRepo CustomerRepo;
    @Override
    public Customer saveCustomer(Customer customer) {
        return CustomerRepo.save(customer);
}

}
