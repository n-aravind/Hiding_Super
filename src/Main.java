public class Main {

    public static void main(String[] args) {
	// write your code here
        Parent parent = new Parent("Betty", "Boop");
        System.out.println(parent.toString());

        Child child = new Child("Tina", "Stamatina", "Fey");
        System.out.println(child.toString());
    }
}
