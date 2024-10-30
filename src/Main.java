class SolidIngredient implements ingredients{
    private String _name;
    private int _quantity;
    public void SolidIngredient(){}
    public void SolidIngredient(String n, int q){
        _name = n;
        _quantity = q;
    }
public String getName(){
    return _name;
    }
    public int getQuantity(){
    return _quantity;
    }

}
interface ingredients{
    String getName();
    int getQuantity();
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}