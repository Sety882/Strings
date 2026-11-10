
public class Ex2 {
    public static void main(String[] args) {
        String path = "home/user/index.html";

        int barra = path.lastIndexOf("/");
        int punto = path.lastIndexOf(".");
        String sisi = path.substring(punto + 1);
        String algo = path.substring(barra + 1, punto);

        System.out.println(algo);
        System.out.println(sisi);

    }
}