import java.util.HashMap;
import java.util.Collection;
class Product{
    private int productId;
    private String productName;
    private int quantity;
    private float price;

    public Product(){
        this.productId = 0;
        this.productName = null;
        this.quantity = 0;
        this.price = 0.0f;
    }
    public Product(int id, String name, int quantity, float price){
        this.productId = id;
        this.productName = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId(){
        return this.productId;
    }
    public String getName(){
        return this.productName;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public float getPrice(){
        return this.price;
    }
    public void setId(int id){
        this.productId = id;
    }
    public void setName(String name){
        this.productName = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setPrice(float price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "Product [ID: "+this.productId+", Name"+this.productName+", Quantity: "+this.quantity+", Price: "+this.price+"]";
    }
}

class InventoryManager{
    private HashMap<Integer, Product> products;

    public InventoryManager(){
        products = new HashMap<>();
    }
    public Product searchProduct(int id){
        Product product = products.get(id);
        if(product == null){
            return null;
        }
        return product;
    }
    public boolean addProduct(Product product){
        if(products.containsKey(product.getId())){
            return false;
        }else{
            products.put(product.getId(), product);
            return true;
        }
    }
    public boolean updateProduct(Product product){
        Product retrivedProduct = this.searchProduct(product.getId());
        if(retrivedProduct==null){
            return false;
        }else{
            products.put(retrivedProduct.getId(), product);
            return true;
        }
    }
    public Product deleteProduct(int id){
        Product retrivedProduct = this.searchProduct(id);
        if(retrivedProduct==null){
            return null;
        }
        products.remove(id);
        return retrivedProduct;
    }
    public Collection<Product> getAllProducts(){
        return products.values();
    }
    public void displayAllProducts(){
        Collection<Product> allProducts = this.getAllProducts();
        for(Product p:allProducts){
            System.out.println(p);
        }
    }
}

public class InventoryManagementSystem{
    public static void main(String[] args){
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Keyboard", 10, 799.99f);
        Product p2 = new Product(102, "Mouse", 25, 399.49f);
        Product p3 = new Product(103, "Monitor", 5, 5499.00f);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("\nInitial Inventory:");
        manager.displayAllProducts();

        p2.setQuantity(100);
        manager.updateProduct(p2);
        manager.deleteProduct(101);

        System.out.println("\nUpdated Inventory:");
        manager.displayAllProducts();
    }
}