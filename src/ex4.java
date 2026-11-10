public class ex4 {
}
void main() {
    Scanner input= new Scanner(System.in);
    System.out.println("Dona'm un text");
    String frase = input.nextLine();
    if (frase.isEmpty()){

    }else{
        System.out.println("dona'm una paraula");
        String paraula = input.nextLine();
        if (frase.contains(paraula)) {
            System.out.println("La paraula " + paraula + " esta");
        }else{
            System.out.println("La paraula " +  paraula + " no està");
        }
    }



}

