import java.util.Scanner;

class Person
 {
   private String FName;
   private String MName;
   private String LName;
   private int age;
   private String bday;
   private String add;
  
      
   public String getfirstName()
   {
     return FName;
   }
   public void setfirstName(String FName)
   {
     this.FName = FName;
   }
   
   public String getmiddleName()
   {
     return MName;
   }
   public void setmiddleName(String MName)
   {
     this.FName = FName;
   }
   
   public String getlastName()
   {
     return LName;
   }
   public void setlastName(String LName)
   {
     this.LName = LName;
   }
   
   public int getAge()
   {
     return age;
   }
   public void setAge(int age)
   {
     this.age = age;
   }
   
   public String getBday()
   {
     return bday;
   }
   public void setBday(String bday)
   {
     this.bday = bday;
   }
   
   public String getAdd()
   {
     return add;
   }
   public void setAdd(String add)
   {
     this.add = add;
   }
   
   public static void main (String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     Person person = new Person();

     System.out.print("First Name: ");
     person.setfirstName(scanner.nextLine());
     
     System.out.print("Middle Name: ");
     person.setmiddleName(scanner.nextLine());
     
     System.out.print("Last Name: ");
     person.setlastName(scanner.nextLine());
     
     System.out.print("Age: ");
     person.setAge(scanner.nextInt());
     scanner.nextLine();
     
     System.out.print("Birthday: ");
     person.setBday(scanner.nextLine());
     
     System.out.print("Address: ");
     person.setAdd(scanner.nextLine());
     
     System.out.println("\nFull Details: ");
     System.out.println("Full Name: " + person.getfirstName() + " "+ person.getmiddleName() + " " + person.getlastName());
     System.out.println("Age: " + person.getAge());
     System.out.println("Birthday: " + person.getBday());
     System.out.println("Address: " + person.getAdd());
   }
}