import java.util.ArrayList;

/*
* File: App.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft II/N
* Date: 2022-10-24
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/

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
