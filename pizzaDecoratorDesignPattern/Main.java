//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza basePizza = new MargheritaPizza();

        basePizza = new ExtraCheese(basePizza);
        basePizza = new GreenVeges(basePizza);

        System.out.println(basePizza.description()+" "+ "with total cost of "+basePizza.cost());
    }
}