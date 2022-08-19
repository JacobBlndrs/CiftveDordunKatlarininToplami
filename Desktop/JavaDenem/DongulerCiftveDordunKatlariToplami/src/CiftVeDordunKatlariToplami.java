import java.util.Scanner;

public class CiftVeDordunKatlariToplami {
    public static void main(String[] args) {
        int number,total = 0;

        Scanner inp=new Scanner(System.in);


       do {
           System.out.print("Sayi Giriniz : ");
           number=inp.nextInt();

           if (number %2 == 0 && number %4 == 0 ){

               total+=number;
           }


       }while (number %2 ==0);

               System.out.println("Toplam : "+ total);
    }



}

