package Dish.demo;

public class Init{
    static int SIZE=2;
    static Dish dishMap[] = new Dish[]{
            new Dish(1,"test1",42),
            new Dish(2,"test2",43)
    };
    public static void showDishTotal(){
        System.out.println("----- The dish you can order -----");
        for(Dish dish :dishMap)
            System.out.printf("%d  %s  %.2f\n",dish.id,dish.name,dish.price);
        System.out.println("-------------  End  --------------");
    }
    public static void showMainMenu(){
        System.out.println("------------Main Menu-------------");
        System.out.println("Main Menu             1");
        System.out.println("Dishes u ordered      2");
        System.out.println("To pay the bill       3");
        System.out.println("-------------  End  --------------");
        //System.out.println("print the number u want");
    }
    public static void showDishesNow(java.util.List<Dish> dishList){
        System.out.println("------The dish you had order------");
        for(Dish dish : dishList){
            System.out.printf("%d  %s  %.2f\n",dish.id,dish.name,dish.price);
        }
        System.out.println("----------------------------------");
        //System.out.println("print the number u want");
    }
    public static Dish getDish(int idx){
        return dishMap[idx-1];
    }
    public static boolean invalidNum(int num){
        if(num!=0&&num<=SIZE)return false;
        else if(num==0)return true;
        else{
            System.out.println("!!!Invalid number,Fuck you!!!");
            return true;
        }
    }
    /*
    public static void dishAdd(java.util.Set<Dish> dishSet,Dish dish){
        dishSet.add(dish);
    }
    public static void dishRemove(java.util.Set<Dish> dishSet,Dish dish){
        dishSet.remove(dish);
    }
    */
}