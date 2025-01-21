public class Mushroom extends Toppings{
    BasePizza basePizza;

    Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost()+50;
    }


    @Override
    public String description() {
        return basePizza.description()+" + Mushroom topping";
    }
}
