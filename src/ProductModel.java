package ist242;

public class ProductModel {
    public ProductModel(){

    }
    public Product getProduct(int id){
        return Prod_Data.readByIdSQL(id);
    }
}
