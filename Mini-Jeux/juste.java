import java.util.Random;
import java.util.Scanner;
public class juste{ 
    public static void main(String [] args){
Random rand = new Random();
int rdm = rand.nextInt(1000);
int guess;
Scanner input = new Scanner(System.in);
boolean win = false;
while (win == false){
System.out.println("Veuillez entrer un nombre entre 1 et 1000: ");
guess = input.nextInt();
if(guess == rdm){
    win = true;
}
else if(guess > rdm){
    System.out.println("Le nombre est plus petit!");
}
else if(guess < rdm){
    System.out.println("Le nombre est plus grand!");
}
}
System.out.println("Bravo!");
input.close();
}
}
