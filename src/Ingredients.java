public class Ingredients {

    private int amount;
    private String unit;
    private String name;

public Ingredients(int amount, String unit, String name) {
    this.amount = amount;
    this.unit = unit;
    this.name = name;
}

public Ingredients(){

}

public int getAmount(){
 return amount;
}

public void setAmount(int amount) {
    this.amount = amount;
}


public String getUnit(){
    return unit;
}

public void setAmount(String unit) {
    this.unit = unit;
}

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

