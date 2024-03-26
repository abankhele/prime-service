package edu.iu.aav.primesservice.repository;

public interface IAuthenticationRepository {
    boolean save (Customer customer) throws IOException;
    Customer findByUsername (String username) throws IOException;
}