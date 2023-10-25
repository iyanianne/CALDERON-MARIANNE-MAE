import java.util.Scanner;

class Activity_1 {
public static void main(String args[]) {

Animal1 a_dog = new Animal1();
Animal2 a_mouse = new Animal2();
Animal3 a_duck = new Animal3();
Animal4 a_cow = new Animal4();
int num;

Scanner input = new Scanner(System.in);

System.out.println("==========Activity One: What does the animal say?==========");
System.out.println("Select an animal: ");
System.out.println("1. Dog\n2. Mouse\n3. Duck\n4. Cow\n");
System.out.println("Enter a number: ");
num = input.nextInt();

System.out.println("Animal: " + num);

if (num == 1) {
a_dog.dog();
} else if (num == 2) {
a_mouse.mouse();
} else if (num == 3) {
a_duck.duck();
} else if (num == 4) {
a_cow.cow();
} else {
System.out.println("Invalid number. Please choose a number between 1 and 4.");
}
}
}

class Animal1 {
public void dog() {
System.out.println("Dog says wof! wof!");
}
}

class Animal2 extends Animal1 {
public void mouse() {
System.out.println("Mouse says squeak! squeak!");
}
}

class Animal3 {
public void duck() {
System.out.println("Duck says quack! quack!");
}
}

class Animal4 {
public void cow() {
System.out.println("Cow says moo! moo!");
}
}
