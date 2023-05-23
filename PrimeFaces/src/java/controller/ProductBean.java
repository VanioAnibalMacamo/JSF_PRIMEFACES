package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import model.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ProductBean implements Serializable {
    private List<Product> products;
    private Product newProduct;
    private Product selectedProduct;

    public ProductBean() {
        products = new ArrayList<>();
        newProduct = new Product();
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product getNewProduct() {
        return newProduct;
    }

    public void addProduct() {
        products.add(newProduct);
        newProduct = new Product();
    }
    public void deleteProduct(Product product) {
    products.remove(product);
    }
    
   

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public void updateProduct() {
       for(Product produto: products){
           if(produto.getId() == selectedProduct.getId()){
               products.set(products.indexOf(produto), selectedProduct);
           }
       }
    }


}
