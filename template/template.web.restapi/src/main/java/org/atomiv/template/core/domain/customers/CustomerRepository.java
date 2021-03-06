package org.atomiv.template.core.domain.customers;

import java.util.List;

public interface CustomerRepository {
	void add(Customer customer);
	Customer find(CustomerIdentity id);
	void remove(CustomerIdentity id);
	void update(Customer customer);
	boolean exists(CustomerIdentity id);
}
