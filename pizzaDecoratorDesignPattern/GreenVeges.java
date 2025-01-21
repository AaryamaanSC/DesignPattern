public class GreenVeges extends Toppings{
    BasePizza basePizza;

    GreenVeges(BasePizza basePizza){
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost()+30;
    }

    @Override
    public String description() {
        return basePizza.description()+" + GreenVeges Toppings";
    }
}
