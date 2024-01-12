package org.rd.lessons.lesson11.Inheritances;

public class Sekil {
    private int x;
    private int y;

    public  Sekil (int x , int y){
        this.x = x;
        this.y = y;
    }
    public void yazdirPozisyon(){
        System.out.println("Pozisyon: "+ ( "(" +x + ", " + y + ")" ));
    }

}
