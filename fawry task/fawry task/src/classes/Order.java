package classes;

import java.util.List;

public class Order {

    private int id;

    private Customer customer;

    private List<Product> productList;

    private int totalAmount;

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, Customer customer, List<Product> productList) {
        this.id = id;
        this.customer = customer;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void calculatetotalAmount(){

        for(int i=0;i<productList.size();i++){
            totalAmount= (int) (totalAmount+productList.get(i).getPrice()*productList.get(i).getStockQuantity());

        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer=" + customer +
                ", productList=" + productList +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
