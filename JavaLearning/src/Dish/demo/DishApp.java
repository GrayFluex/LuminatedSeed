package Dish.demo;
import java.util.Scanner;
public class DishApp {
    public static void main(String[] args){
        java.util.List<Dish> dishNow = new java.util.ArrayList<Dish>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Init.showMainMenu();
            System.out.println("Choose the number you want");
            int f = scanner.nextInt();
            if (f == 1) {
                int now = 0;
                do {
                    //System.out.println("Choose the number you want");
                    Init.showDishTotal();
                    System.out.println("print the number u want");
                    System.out.println("or print 0 to the main menu");
                    now = scanner.nextInt();
                    if(Init.invalidNum(now))break;
                    dishNow.add(Init.getDish(now));
                    Init.showDishesNow(dishNow);
                } while (true);
            } else if (f == 2) {
                Init.showDishesNow(dishNow);
                System.out.println("return to the Main Menu......");
            } else if (f == 3) {
                Init.showDishesNow(dishNow);
                double tot = 0;
                for(Dish dish : dishNow)
                    tot += dish.price;
                System.out.printf("The total price is : %.2f\n",tot);
                break;
            } else
                System.out.println("!!!Invalid number,Fuck you!!!");
        }
    }

}
