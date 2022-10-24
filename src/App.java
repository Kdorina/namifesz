import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Nyilvantartas nyilvantartas = new Nyilvantartas();
        ArrayList<String> nevekLista = nyilvantartas.getNames();
        for(String nevek : nevekLista){
            System.out.println(nevek);
        }
    }
}
