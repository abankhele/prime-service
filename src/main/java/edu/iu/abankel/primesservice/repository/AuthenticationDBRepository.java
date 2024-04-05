package edu.iu.abankel.primesservice.repository;

import edu.iu.abankel.primesservice.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationDBRepository extends CrudRepository<Customer, String> {
    Customer findByUsername(String username);


}
