package lk.ijse.gdse72.spbootdeployment.repo;

import lk.ijse.gdse72.spbootdeployment.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
