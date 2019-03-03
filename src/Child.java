public class Child extends Parent {

    private String middleName;

    public Child(String firstName, String lastName, String middleName) {
        super(firstName, lastName);
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Child{" +
                "middleName='" + middleName + '\'' +
                '}';
    }
}
