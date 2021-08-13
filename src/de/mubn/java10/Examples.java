package de.mubn.java10;

public class Examples {

    public static void main(String[] args) {
        System.out.println("var keyword with type inference:");
        demoVarWithTypeInference();

    }

    private static void demoVarWithTypeInference() {
        String description = "Description text";

        var newDescription = "Description text";

        var number = Integer.parseInt("42");
        System.out.println(number + 18);

        var count= description.length();
    }
}
