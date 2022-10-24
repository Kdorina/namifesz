import java.util.ArrayList;
import java.util.Arrays;

public class Nyilvantartas implements Nevek {

    @Override
    public ArrayList<String> getNames() {
        String[] nevek = {"Béla", "Géza"};
        ArrayList<String>nevekLista =
        new ArrayList<>(Arrays.asList(nevek));
        return nevekLista;
    }


    
}
