package ba.unsa.etf.rpr.tutorijal03;

import java.util.Collections;

public class FiksniBroj extends TelefonskiBroj {
    public enum Grad {
        BIHAC(0), ORASJE(1), TUZLA(2), ZENICA(3), GORAZDE(4), TRAVNIK(5), MOSTAR(6), SIROKIBRIJEG(7), SARAJEVO(8), LIVNO(9), BRCKO(10);

        private final int value;
        private Grad(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }};
    private final String pozivni[] =  new String[]{"037", "031", "035", "032", "038", "030", "036", "039", "033", "034", "049"};
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        this.broj = pozivni[grad.getValue()] + "/" + broj;
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
