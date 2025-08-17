import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
class itemMenu{
    String itemName;
    int price;

    itemMenu(String itemName,int price){
        this.itemName=itemName;
        this.price=price;
    }
    public void displayItem(){
        System.out.println(itemName+"-$"+price);
    }
    public int getPrice(){
        return price;
    }
}
class prizza extends itemMenu{
    prizza(){
        super("Pizza",150);
    }
    public void displayItem(){
        System.out.println("Delicious"+itemName+"-$ "+price);
    }
}
class pasta extends itemMenu{
    pasta(){
        super("Pasta",200);
    }

    @Override
    public void displayItem() {
        System.out.println("Hot "+itemName+"-$ "+price);
    }
}
class burger extends itemMenu{
    burger(){
        super("Burger",300);
    }
    public void displayItem(){
        System.out.println("Crispy"+itemName+"-$ "+price);
    }
}

public class restaurantInterSystems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int totalPrice=0;

       do{
           System.out.println("----Menu----");
           System.out.println("1.Pizza");
           System.out.println("2.Pasta");
           System.out.println("3.Burger");
           System.out.println("4.Show bill");
           System.out.println("5.Exit");
           choice = sc.nextInt();
           itemMenu item= null;
           switch (choice){
               case 1: item= new prizza(); break;
               case 2: item = new pasta(); break;
               case 3: item = new burger(); break;
               case 4:
                   System.out.println("Total bill: "+totalPrice);
                   break;
               case 5:
                   System.out.println("Thank you visit again!");
                   break;
               default:
                   System.out.println("Invalid Choice!");
           }
           if(item!=null){
               item.displayItem();
               totalPrice+= item.getPrice();
           }
       }while (choice!=5);

       sc.close();
    }
}
