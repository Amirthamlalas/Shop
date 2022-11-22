import java.util.ArrayList;
import java.util.Scanner;

class customer{

    int Tea = 10;
    int coffee = 15;
    int snacks = 10;
    int idili = 8;
    int dosa = 6;
    int Teaprice;



    public customer() {




    }



    int tea(int quantity){
        int teaprice = quantity*Tea;
        return teaprice;
    }

    int coffee(int quantity){
        int cofeeprice = quantity*coffee;
        return cofeeprice;
    }

    int snacks(int quantity){
        int snackprice = quantity*snacks;
        return snackprice;
    }

    int idili(int quantity){
        int idiliprice = quantity*idili;
        return idiliprice;
    }

    int dosa(int quantity){
        int dosaprice = quantity*dosa;
        return dosaprice;
    }




}

public class Shop {


    public static void main(String[] args) {

        ArrayList<customer> customers = new ArrayList<customer>();
        customer c = new customer();
        while (true) {
            System.out.println("Select an option \n 1 - Add Tea \n 2 - Add coffee\n 3 - Add snacks \n" +
                    "4 - Add idili \n 5 - Add Dosa \n 6 - Generate bill \n 7- View transaction \n 8- Exit");


            Scanner input = new Scanner(System.in);
            int n = input.nextInt();




            switch (n) {

                case 1:

                    System.out.println("enter the quantity");
                    int qt = input.nextInt();
                    int Teaprice = c.tea(qt);
                    c.Teaprice = Teaprice;

                    break;

            }








            }



        }
    }
