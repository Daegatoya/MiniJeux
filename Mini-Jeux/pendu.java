import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class pendu {

 public static final String[] mots = {
  "salut", "bonjour", "personnage", "brique", "utile", 
  "mur", "chat", "chien", "admirer", "contruire",
  "meuble", "baleine", "plage", "faire", "or", 
  "diamant", "solide", "code", "finaliste", "homme",
  "voler", "maman", "deux", "un", "lettre", 
  "qui", "femme", "papa", "internet", 
  "long", "nation", "pays", "pacifique", "bienvenue", 
  "publique", "bouclier", "crayon", "voiture", 
  "mon", "hiver", "coller", "super", "bonne", 
  "wagon", "zebre", "xylophone", "yaourt", 
  "faux", "fille", "lourd", "porte", "monture", "durant"
 };

 public static final Random r = new Random();
 public static final int err = 10;
 private String trouve;
 private char[] gagne;
 private int err2;
 private ArrayList < String > letters = new ArrayList < > ();


 private String nextMot() {
  return mots[r.nextInt(mots.length)];
 }

 public void newGame() {
  err2 = 0;
  letters.clear();
  trouve = nextMot();

  gagne = new char[trouve.length()];

  for (int i = 0; i < trouve.length(); i++) {
   gagne[i] = '.';
  }
 }

 public boolean wordFound() {
  return trouve.contentEquals(new String(gagne));
 }

 private void enter(String c) {

  if (!letters.contains(c)) {
  
   if (trouve.contains(c)) {

    int index = trouve.indexOf(c);

    while (index >= 0) {
     gagne[index] = c.charAt(0);
     index = trouve.indexOf(c, index + 1);
    }
   } else {

    err2++;
   }

   letters.add(c);
  }
 }


 private String wordFoundContent() {
  StringBuilder builder = new StringBuilder();

  for (int i = 0; i < gagne.length; i++) {
   builder.append(gagne[i]);

   if (i < gagne.length - 1) {
    builder.append(" ");
   }
  }

  return builder.toString();
 }


 public void play() {
  try (Scanner input = new Scanner(System.in)) {

   while (err2 < err) {
    System.out.println("\nVeuillez entrer une lettre : ");

    String str = input.next();

    if (str.length() > 1) {
     str = str.substring(0, 1);
    }

    enter(str);

    System.out.println("\n" + wordFoundContent());

    if (wordFound()) {
     System.out.println("\nVous avez gagné!");
     break;
    } else {
  
     System.out.println("\n Nombre d'éssaies restant : " + (err - err2));
    }
   }

   if (err2 == err) {
    System.out.println("\nVous avez perdu!");
    System.out.println("Le mot était : " + trouve);
   }
  }
 }

 public static void main(String[] args) {
  pendu p = new pendu();
  p.newGame();
  p.play();
 }

}