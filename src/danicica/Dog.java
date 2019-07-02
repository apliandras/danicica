package danicica;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Hello my name is " + name);
    }

    public static void shortDescription (){
        System.out.println("Hello I'm a dog. This method can be called on the class itself.");
    }
}
