
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
        
    

        BangunRuang bangunruang = new BangunRuang();

        bola Bola = new bola();
        Bola.r = 4;
        Bola.volume();

        kubus Kubus = new kubus();
        Kubus.s = 6;
        Kubus.volume();

        Tabung tabung = new Tabung();
        tabung.r = 21;
        tabung.t = 34;
        tabung.volume();

        LimasSegitiga limassegitiga = new LimasSegitiga();
        limassegitiga.la = 13;
        limassegitiga.tl = 9;
        limassegitiga.volume();

    }
}


