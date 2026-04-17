
package decoratordesignpattern;

public class DecoratorDesignPattern {

    public static void main(String[] args)
    {
         
        Pizza pizza1 = new PlainPizza();
        printPizza(pizza1);

        
        Pizza pizza2 = new Cheese(new PlainPizza());
        printPizza(pizza2);

       
        Pizza pizza3 = new Mushroom(new Cheese(new PlainPizza()));
        printPizza(pizza3);

        
        Pizza pizza4 = new Olive(new Mushroom(new Cheese(new PlainPizza())));
        printPizza(pizza4);
    }

    public static void printPizza(Pizza pizza)
    {
        System.out.println("Description : " + pizza.getDescription());
        System.out.println("Cost        : " + pizza.getCost());
        System.out.println();
    }
 }
    

