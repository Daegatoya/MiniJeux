import java.util.Scanner;
import java.io.*;
public class jeu {
public static void main(String [] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int lol;
        int y = 2;
        int n = 3;
        int bbb = 1;
        System.out.println("Veuillez choisir votre jeu: ");
        System.out.println("1- Prix Juste");
        System.out.println("2- Bonhomme Pendu");
        System.out.println("3- Snake");
        lol = in.nextInt();

        if(lol == bbb){
            String command = "cmd.exe /c start "+"java juste";

            Runtime.getRuntime().exec(command);
       
    }
        else if(lol == y){
            String command = "cmd.exe /c start "+"java pendu";

            Runtime.getRuntime().exec(command);
}
else if(lol == n){
    String command = "cmd.exe /c start "+"snake.exe";

    Runtime.getRuntime().exec(command);

}
in.close();
}
}
            