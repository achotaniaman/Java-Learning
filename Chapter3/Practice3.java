public class Practice3 {
    public static void main(String[] args) {
        String name=  "Aman Ach";
        name =name.toLowerCase();
        System.out.println(name);

        name = name.replace(" ", "_");
        System.out.println(name);

        String letter = "Dear <|name|> thanks a lot";
        System.out.println(letter.replace("<|name|>", "Aman"));

        String space= "This contains  double and    triple space";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));

    }
}
