package classes;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<Order> orderList;

    public OrderManager() {
    }

    public OrderManager(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public void addOrder(Order order){
        if(orderList==null){
            orderList=new ArrayList<>();
        }
        orderList.add(order);

    }

    public void removeOrder(int orderId){
        orderList.remove(orderId);
    }

    public void viewAllOrders(){
        for (int i=0;i<orderList.size();i++){
            System.out.println(orderList.get(i).toString());
        }
    }
}
