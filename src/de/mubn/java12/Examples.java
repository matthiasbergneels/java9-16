package de.mubn.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class Examples {

    public static void main(String[] args) {

        System.out.println("Compact Number formating:");
        demoCompactNumberInstanceClass();

    }

    private static void demoCompactNumberInstanceClass() {
        NumberFormat fmtIn = NumberFormat.getCompactNumberInstance(
                new Locale("hi", "IN"), NumberFormat.Style.SHORT);
        String result = fmtIn.format(50000000);

        System.out.println(fmtIn.format(50000000));
        System.out.println(fmtIn.format(1000));


        NumberFormat fmtUs = NumberFormat.getCompactNumberInstance(
                new Locale( "US"), NumberFormat.Style.SHORT);

        System.out.println(fmtUs.format(50000000));
        System.out.println(fmtUs.format(1000));


        NumberFormat fmtDe = NumberFormat.getCompactNumberInstance(
                new Locale( "DE"), NumberFormat.Style.SHORT);

        System.out.println(fmtDe.format(50000000));
        System.out.println(fmtDe.format(1000));
    }
}
