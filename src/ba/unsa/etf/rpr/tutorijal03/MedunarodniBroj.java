package ba.unsa.etf.rpr.tutorijal03;

public class MedunarodniBroj extends TelefonskiBroj{
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.broj = drzava + broj;
    }

    @Override
    public String ispisi() {
        return broj;
    }

    @Override
    public int hashCode() {
        return broj.hashCode();
    }

    @Override
    public int compareTo(Object obj) {
        TelefonskiBroj broj = (TelefonskiBroj) obj;
        return this.broj.compareTo(broj.ispisi());
    }
}
