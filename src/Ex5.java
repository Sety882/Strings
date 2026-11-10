
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            String[] catalogo = {"Los muertos vivientes", "Brevísima historia del tiempo", "La clave secreta del universo", "Mi universo", " Patria", " De mayor quiero ser feliz", " Empieza por los zapatos" };

        System.out.println("Diga'm el llibre:");
        String llibre = input.nextLine();

        String resultat = "El llibre no existeix";

        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].equalsIgnoreCase(llibre)) {
                resultat = "El llibre existeix";
            }
        }
        System.out.println(resultat);



                }


            }






