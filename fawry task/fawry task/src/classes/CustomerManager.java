package classes;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
   private List<Customer>customerList;

    public CustomerManager() {
    }

    public CustomerManager(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer){
        if (customerList==null){
            customerList=new ArrayList<>();
        }

        customerList.add(customer);
    }

    public void removeCustomer(int customerId){
        customerList.remove(customerId);
    }

    public void viewAllCustomers(){
        for (int i=0;i<customerList.size();i++){
            System.out.println(customerList.get(i).toString());
        }
    }
}
