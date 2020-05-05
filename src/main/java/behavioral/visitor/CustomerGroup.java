package behavioral.visitor;

import behavioral.visitor.inter.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-05 10:22
 **/
public class CustomerGroup {
    private List<Customer> customers = new ArrayList<>();

    void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
