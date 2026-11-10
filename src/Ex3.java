    public class Ex3 {
    }
    void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Dona'm una frase");
        String frase = input.nextLine();
        String fraseMinuscules = frase.toLowerCase();
        System.out.println(fraseMinuscules);
        String frasemajuscules= frase.toUpperCase();
        System.out.println(frasemajuscules);
    }
