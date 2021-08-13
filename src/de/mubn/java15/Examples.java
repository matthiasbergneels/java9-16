package de.mubn.java15;

public class Examples {

    public static void main(String[] args) {

        System.out.println("Text block:");
        demoTextBlock();

        System.out.println("new NullPointerException Message");
        demoNewNullPointerExceptionMessage();
    }

    private static void demoNewNullPointerExceptionMessage() {
        MyClass myClass = null;
        try {
            System.out.println(myClass.myName.length());
        }catch (Exception e){
            System.err.println(e.getMessage());

            e.printStackTrace();
        }

        myClass = new MyClass();
        try {
            System.out.println(myClass.myName.length());
        }catch (Exception e){
            System.err.println(e.getMessage());

            e.printStackTrace();
        }

        try {
            System.out.println(myClass.meAgain.myName.length());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

    private static void demoTextBlock() {
        String html = "<html>\n" +
                " <body>\n" +
                "   <p>Hello, world</p>\n" +
                " </body>\n" +
                "</html>";

        System.out.println(html);

        String htmlAsBlock = """
            <html>
              <body>
                <p>Hello, world</p>
              </body>
            </html>
            """;

        System.out.println(htmlAsBlock);
    }

    private static class MyClass{
        protected String myName;
        protected MyClass meAgain;
    }
}
