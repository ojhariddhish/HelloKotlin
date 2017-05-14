package com.dnsoftindia.hellokotlin.interop;

import com.dnsoftindia.hellokotlin.classes.CustomerJava;

import java.util.List;

/**
 * Created by Ganesha on 5/13/17.
 */
public interface CustomerRepository {

    CustomerJava getById(int id);
    List<CustomerJava> getAll();

}
