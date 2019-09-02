package ba.unsa.etf.rpr.tutorijal03;

public class MobilniBroj extends TelefonskiBroj {
    String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.broj = "0" + Integer.toString(mobilnaMreza) + "/" + broj;
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode();
    }
}
