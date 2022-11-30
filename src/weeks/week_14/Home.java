
package weeks.week_14;

public class Home {
    private double yuzolcumu;
    private int banyosayisi;
    private int odasayisi;
    private boolean garajVarmi;
    private double ucret;
    private double kira;
    private String cephesi;
    private int yil;

    public Home() {
        this(60, 1, 4, false, 100_000, 500, "Guney", 2001);
    }

    public Home(double yuzolcumu, int banyosayisi, int odasayisi, boolean garajVarmi, double ucret, double kira, String cephesi, int yil) {
        this.yuzolcumu = yuzolcumu;
        this.banyosayisi = banyosayisi;
        this.odasayisi = odasayisi;
        this.garajVarmi = garajVarmi;
        this.ucret = ucret;
        this.kira = kira;
        this.cephesi = cephesi;
        this.yil = yil;
    }

    public double getYuzolcumu() {
        return yuzolcumu;
    }

    public void setYuzolcumu(double yuzolcumu) {
        this.yuzolcumu = yuzolcumu;
    }

    public int getBanyosayisi() {
        return banyosayisi;
    }

    public void setBanyosayisi(int banyosayisi) {
        this.banyosayisi = banyosayisi;
    }

    public int getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(int odasayisi) {
        this.odasayisi = odasayisi;
    }

    public boolean isGarajVarmi() {
        return garajVarmi;
    }

    public void setGarajVarmi(boolean garajVarmi) {
        this.garajVarmi = garajVarmi;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public double getKira() {
        return kira;
    }

    public void setKira(double kira) {
        this.kira = kira;
    }

    public String getCephesi() {
        return cephesi;
    }

    public void setCephesi(String cephesi) {
        this.cephesi = cephesi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public void print() {
        System.out.println("Yuzolcumu: " + getYuzolcumu());
        System.out.println("Banyo sayisi: " + getBanyosayisi());
        System.out.println("Oda sayisi: " + getOdasayisi());
        System.out.println("Garaji var mi : " + (isGarajVarmi() ? "var" : "yok"));
        System.out.println("Ucret: " + getUcret());
        System.out.println("Kira ucreti: " + getKira());
        System.out.println("Hangi cephe: " + getCephesi());
        System.out.println("Bina hangi yil yapildi: " + getYil());
    }
}
