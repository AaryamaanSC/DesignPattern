public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }



    @Override
    public int cost() {
        return basePizza.cost()+40;
    }

    @Override
    public String description() {
        return basePizza.description()+" + ExtraCheese Toppings";
    }
}
