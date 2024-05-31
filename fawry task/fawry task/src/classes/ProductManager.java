package classes;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    private List<Product> productList;

    public ProductManager() {
    }

    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product){
        if(productList==null){
            productList=new ArrayList<>();
        }
        productList.add(product);
    }

    public void removeProduct(int productId){
        productList.remove(productId);
    }

    public void viewAllProducts(){
         for (int i=0;i<productList.size();i++){
             System.out.println(productList.get(i).toString());
         }
    }

    public void updateStock(int productId, int newStock){
        productList.get(productId).setStockQuantity(newStock);

    }
}
