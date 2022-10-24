import java.util.ArrayList;
/*
* File: Nyilvantartas.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II/N
* Date: 2022-10-24
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

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
