package se.lexicon;

public class Ex01ProfileCard {

    String name = "Abdi";
    int age = 34;
    String city = "Stockholm";
    String linebreak = "====================";

    void main() {

        IO.println(linebreak);
        IO.println("     My Profile");
        IO.println(linebreak);
        IO.println("Name : " + name);
        IO.println("Age  : " + age);
        IO.println("City : " + city);
        IO.println(linebreak);

    }
}
