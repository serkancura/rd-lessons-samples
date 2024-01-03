package org.rd.lessons.lessons9.NesneOzellikleri;

public class Araba {

    private String marka;
    private String model;
    private int yil;
    private boolean otomatik;

    public Araba(){
        System.out.println("Constructor metodu çalıştı");
    }

    public Araba(String model, int yil){
        System.out.println("Constructor metodu çalıştı. Araba model ve yıl bilgisi atandı");
        this.model = model;
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil){
        this.yil = yil;
    }


    void calistir() {
        model = "Yaris";
        System.out.println("Araba çalıştırıldı");
    }

    void durdur() {
        System.out.println("Araba durdu");
    }

}
