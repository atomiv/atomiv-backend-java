package org.atomiv.template.lite.web.restapi.service;

import java.util.List;

import org.atomiv.template.lite.web.restapi.dto.CustomerDto;
import org.atomiv.template.lite.web.restapi.models.Customer;

import com.google.common.base.Optional;

public interface CustomerDtoService {

	List<CustomerDto> getAllCustomers();

	Optional<CustomerDto> getCustomersById(long customerId);

	Optional<Customer> getCustomerId(long customerId);

	Customer createCustomer(CustomerDto customer);

	Customer updateCustomer(Customer customerDetails);

	void deleteCustomer(Customer customer);

}