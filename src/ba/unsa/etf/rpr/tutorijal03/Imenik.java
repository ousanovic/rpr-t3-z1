package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    public void dodaj(String ime, TelefonskiBroj broj) {
        imenik.put(ime, broj);
    }
    public String dajBroj(String ime) {
        return imenik.get(ime).ispisi();
    }
    public String dajIme(TelefonskiBroj broj) {
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue().equals(broj)) return entry.getKey();
        }
        throw new IllegalArgumentException("Ne postoji broj u imeniku");
    }

    public String naSlovo(char c) {
        StringBuilder sb = new StringBuilder();
        int brojac = 1;
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getKey().charAt(0) == c) {
                sb.append(Integer.toString(brojac) + ". " + entry.getKey() + " - " + entry.getValue().ispisi());
                brojac++;
            }
        }
        return sb.toString();
    }

    public Set<String>  izGrada(FiksniBroj.Grad g) {
        TreeSet<String> povratni = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj) entry.getValue()).getGrad().equals(g))
                povratni.add(entry.getKey());
        }
        return povratni;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g) {
        TreeSet<TelefonskiBroj> povratni = new TreeSet<>();
        for(Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if(entry.getValue() instanceof FiksniBroj && ((FiksniBroj) entry.getValue()).getGrad().equals(g))
                povratni.add(entry.getValue());
        }
        return povratni;
    }


}
