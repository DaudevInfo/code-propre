package ex4;

import java.util.Date;

public class TestPattern {
    public static void main(String[] args) {
        Date d1 = new Date(120,9,29);

        System.out.println("Date du jour pattern par défaut " + DateUtils.format(null,d1));
        System.out.println("Date du jour pattern dédié " + DateUtils.format("yyyy-MM-dd ",d1));



    }
}
