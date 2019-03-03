# Hiding_Super

- Create a new project in IntelliJ with a Main class with a main method
- Create a Parent class with a private String firstName and private String lastName instance variables. Let IntelliJ generate n constructor that takes both variables as arguments and a toString methods.
- Create a Child class that extends the Parent class. The Child class should have a private String middleName instance variable. Let IntelliJ generate a constructor that takes all three variables as parameters and a toString methods. Modify the toString method to call the parent's toString method before printing the middle name.
- In main do the following:
````
Parent parent = new Parent("Betty", "Boop");
System.out.println(parent.toString());

Child child = new Child("Tina", "Stamatina", "Fey");
System.out.println(child.toString());
````