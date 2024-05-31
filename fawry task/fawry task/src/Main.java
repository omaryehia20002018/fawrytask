import classes.*;

public class Main {
    public static void main(String[] args) {
        Product product1=new Product(1,"fish","fish food",70,2);
        Product product2=new Product(2,"fish","fish food",70,3);
        Product product3=new Product(3,"fish","fish food",70,2);
        ProductManager productlist=new ProductManager();
        productlist.addProduct(product1);
        productlist.addProduct(product2);
        productlist.addProduct(product3);
        productlist.viewAllProducts();
        productlist.removeProduct(2);
        productlist.viewAllProducts();
        Customer customer1=new Customer(1,"omar","yehia","nasr city");
        Customer customer2=new Customer(2,"ahmed","yehia","nasr city");
        Customer customer3=new Customer(3,"omar","yehia","nasr city");
        CustomerManager customerlist=new CustomerManager();
        customerlist.addCustomer(customer1);
        customerlist.addCustomer(customer2);
        customerlist.addCustomer(customer3);
        customerlist.viewAllCustomers();
        customerlist.removeCustomer(2);
        customerlist.viewAllCustomers();

        Order order1=new Order(1,customer1,productlist.getProductList());
        order1.calculatetotalAmount();
        Order order2=new Order(2,customer2,productlist.getProductList());
        order2.calculatetotalAmount();
        OrderManager orderlist=new OrderManager();
        orderlist.addOrder(order1);
        orderlist.addOrder(order2);
        orderlist.viewAllOrders();


    }
}