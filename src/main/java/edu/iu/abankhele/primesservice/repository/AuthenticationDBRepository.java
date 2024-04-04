package edu.iu.abankhele.primesservice.repository;

import edu.iu.abankhele.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);


}
