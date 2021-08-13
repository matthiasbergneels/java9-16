package de.mubn.java16;

public class Examples {

    public static void main(String[] args) {

        System.out.println("instanceOf with type matching Example:");
        demoInstanceOfTypeMatching();

        System.out.println("Record Class Example:");
        demoRecordClass();

    }

    private static void demoRecordClass() {
        record MyPoint(int x, int y){ }

        MyPoint myFirstPoint = new MyPoint(5, 3);

        System.out.println(myFirstPoint.x());
        System.out.println(myFirstPoint.y());
        System.out.println(myFirstPoint);
        System.out.println(myFirstPoint.hashCode());

        MyPoint mySecondPoint = new MyPoint(5,3);

        System.out.println(myFirstPoint.equals(mySecondPoint));
        System.out.println(mySecondPoint.hashCode());
    }

    private static void demoInstanceOfTypeMatching() {
        Object obj = "Hello World";

        // before Java 16
        if(obj instanceof String){
            String s = (String) obj;
            if(s.length() > 5){
                System.out.println("obj is a String with more than 5 characters: " + s.toUpperCase());
            }
        }

        // starting from Java 16
        if(obj instanceof String s && s.length() > 5){
            System.out.println("obj is a String with more than 5 characters: " + s.toUpperCase());
        }
    }
}
