package de.mubn.java14;

public class Examples {

    enum DAY{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        System.out.println("Switch Statement:");
        demoSwitchStatement();

    }

    private static void demoSwitchStatement() {
        DAY day = DAY.MONDAY;

        int numLetters = 0;
        switch(day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numLetters = 6;
                break;
            case TUESDAY:
                numLetters = 7;
                break;
            default:
                String s = day.toString();
                int result = s.length();
                numLetters = result;

        }

        System.out.println("original Switch - Letter count: " + numLetters);

        switch(day){
            case MONDAY, FRIDAY, SUNDAY -> numLetters = 6;
            case TUESDAY                -> numLetters = 7;
            default -> {
                String s = day.toString();
                int result = s.length();
                numLetters = result;
            }
        }

        System.out.println("new Switch - Letter count: " + numLetters);

        numLetters = switch (day){
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            default -> {
                String s = day.toString();
                int result = s.length();
                yield result;
            }
        };

        System.out.println("new  Switch using return / yield - Letter count: " + numLetters);
    }
}
