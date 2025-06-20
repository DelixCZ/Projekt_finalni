import java.util.ArrayList;
import java.util.List;

public class Evidence {
    private List<Pojisteny> seznam = new ArrayList<>();

    public void pridatPojisteneho(Pojisteny p) {
        seznam.add(p);
    }

    public void vypisVsechny() {
        for (Pojisteny p : seznam) {
            System.out.println(p);
        }
    }

    public void vyhledat(String jmeno, String prijmeni) {
        boolean nalezen = false;
        for (Pojisteny p : seznam) {
            if (p.getJmeno().equalsIgnoreCase(jmeno) && p.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println(p);
                nalezen = true;
            }
        }
        if (!nalezen) {
            System.out.println("Pojištěný nebyl nalezen.");
        }
    }
}
