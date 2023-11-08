import java.util.Scanner;

public class Student {
    private String studentID, firstName, middleName, lastName, suffix;
    private int age;
    private String yearLevel;
    private int phoneNumber;
    private String email;
    private Course course;
   
    public Student(String studentID, String firstName, String middleName, String lastName, String suffix, int age, String yearLevel, int phoneNumber, String email, Course course) {
      this.studentID = studentID;
      this.firstName = firstName;
      this.middleName = middleName;
      this.lastName = lastName;
      this.suffix = suffix;
      this.age = age;
      this.yearLevel = yearLevel;
      this.phoneNumber = phoneNumber;
      this.email = email;
      this.course = course;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearLevel(String yearLevel) {
        this.yearLevel = yearLevel;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public int getAge() {
        return age;
    }

    public String getYearLevel() {
        return yearLevel;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
    
    public Course getCourse () {
      return course;
    }
    
    static class Course {
    private String courseName;
    private String courseCode;
    private String department;

    public Course(String courseName, String courseCode, String department) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
  }
   
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = null;
        
        while (true) {
            System.out.println("Student Record Management App v1");
            System.out.println("\n================================");
            System.out.println("Selection Menu:");
            System.out.println("--------------------------------");
            System.out.println("\n1. Create Student Record");
            System.out.println("0. Exit");
            System.out.println("\n--------------------------------");
            System.out.print("Enter Selection: ");

            int selection = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("================================");
            
            if (selection == 1) {
                System.out.println("\n\n\nStudent Record Management App v1");
                System.out.println("\n================================");
                System.out.println("Enter Student Details:");
                System.out.println("--------------------------------");
                System.out.print("\nStudent ID No.: ");
                String studentID = scanner.nextLine();
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();
                System.out.print("Middle Name: ");
                String middleName = scanner.nextLine();
                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();
                System.out.print("Suffix: ");
                String suffix = scanner.nextLine();
                System.out.print("Age: ");
                int age = scanner.nextInt();
                System.out.print("Year Level: ");
                String yearLevel = scanner.nextLine();
                scanner.nextLine();
                System.out.print("Phone Number: ");
                int phoneNumber = scanner.nextInt();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                scanner.nextLine();
                
                System.out.println("================================");
                System.out.println("\nEnter Course Details:");
                System.out.println("--------------------------------");
                System.out.print("\nCourse Name: ");
                String courseName = scanner.nextLine();
                System.out.print("Course Code: ");
                String courseCode = scanner.nextLine();
                System.out.print("Department: ");
                String department = scanner.nextLine();
                System.out.println("\n--------------------------------");
                

                Course course = new Course(courseName, courseCode, department);

                student = new Student(studentID, firstName, middleName, lastName, suffix, age, yearLevel, phoneNumber, email, course);

                System.out.println("Student record created successfully."); 
                System.out.println("================================");            
            } else if (selection == 0) {
                System.out.println("\nExiting the application. Goodbye!");
                break;
            } else {
                System.out.println("\nInvalid selection. Please try again.");
            }      

        while (student != null) {
            System.out.println("\n\n\nStudent Record Management App v1");
            System.out.println("\n================================");
            System.out.println("Student Record Selection Menu:");
            System.out.println("--------------------------------");
            System.out.println("\n1. Update Student Profile Details");
            System.out.println("2. Update Student Course Details");
            System.out.println("3. Display Student Record");
            System.out.println("0. Exit");
            System.out.println("\n--------------------------------");
            System.out.print("Enter Selection: ");    

            int recordMenuSelection = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("================================");

            if (recordMenuSelection == 1) {
                System.out.println("\n\n\nStudent Record Management App v1");
                System.out.println("\n================================");
                System.out.println("Student Profile Details Update Selection Menu:");
                System.out.println("--------------------------------");
                System.out.println("\n1. Update Student ID No.");
                System.out.println("2. Update First Name");
                System.out.println("3. Update Middle Name");
                System.out.println("4. Update Last Name");
                System.out.println("5. Update Suffix");
                System.out.println("6. Update Age");
                System.out.println("7. Update Year Level");
                System.out.println("8. Update Phone Number");
                System.out.println("9. Update Email");
                System.out.println("0. Return");
                System.out.println("\n--------------------------------");
                System.out.print("Enter Selection: ");
                int updateSelection = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("================================");
                
                switch (updateSelection) {
                    case 1:
                        System.out.print("\nEnter new Student ID No.: ");
                        String newStudentID = scanner.nextLine();
                        student.setStudentID(newStudentID);
                        System.out.println("Student ID No. updated successfully.");
                        break;
                    case 2:
                        System.out.print("\nEnter new First Name: ");
                        String newFirstName = scanner.nextLine();
                        student.setFirstName(newFirstName);
                        System.out.println("First Name updated successfully.");
                        break;
                    case 3:
                        System.out.print("\nEnter new Middle Name: ");
                        String newMiddleName = scanner.nextLine();
                        student.setMiddleName(newMiddleName);
                        System.out.println("Middle Name updated successfully.");
                        break;
                    case 4:
                        System.out.print("\nEnter new Last Name: ");
                        String newLastName = scanner.nextLine();
                        student.setLastName(newLastName);
                        System.out.println("Last Name updated successfully.");
                        break;
                    case 5:
                        System.out.print("\nEnter new Suffix: ");
                        String newSuffix = scanner.nextLine();
                        student.setSuffix(newSuffix);
                        System.out.println("Suffix updated successfully.");
                        break;
                    case 6:
                        System.out.print("\nEnter new Age: ");
                        int newAge = scanner.nextInt();
                        student.setAge(newAge);
                        System.out.println("Age updated successfully.");
                        break;
                    case 7:
                        System.out.print("\nEnter new Year Level: ");
                        String newYearLevel = scanner.nextLine();
                        student.setYearLevel(newYearLevel);
                        System.out.println("Year Level updated successfully.");
                        break;
                    case 8:
                        System.out.print("\nEnter new Phone Number: ");
                        int newPhoneNumber = scanner.nextInt();
                        student.setPhoneNumber(newPhoneNumber);
                        System.out.println("Phone Number updated successfully.");
                        break;
                    case 9:
                        System.out.print("\nEnter new Email: ");
                        String newEmail = scanner.nextLine();
                        student.setEmail(newEmail);
                        System.out.println("Email updated successfully.");
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("\nInvalid selection. Please try again.");
                        break;
                }
            } else if (recordMenuSelection == 2) {
                System.out.println("\n\n\nStudent Record Management App v1");
                System.out.println("\n================================");
                System.out.println("Select Student Course Details Update Selection Menu:");
                System.out.println("--------------------------------");
                System.out.println("\n1. Bachelor of Science in Information Technology (BSIT)");
                System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
                System.out.println("3. Associate of Computer Technology (ACT)");
                System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
                System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
                System.out.println("6. Department");
                System.out.println("\n--------------------------------");
                System.out.print("Enter Selection: ");
                int courseSelection = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("================================");
                
                switch (courseSelection) {
                    case 1:
                        student.getCourse().setCourseName("Bachelor of Science in Information Technology");
                        System.out.println("\nCourse updated successfully.");
                        break;
                    case 2:
                        student.getCourse().setCourseName("Bachelor of Science in Computer Science");
                        System.out.println("\nCourse updated successfully.");
                        break;
                    case 3:
                        student.getCourse().setCourseName("Associate of Computer Technology");
                        System.out.println("\nCourse updated successfully.");
                        break;
                    case 4:
                        student.getCourse().setCourseName("\nBachelor of Science in Mechanical Engineering");
                        System.out.println("\nCourse updated successfully.");
                        break;
                    case 5:
                        student.getCourse().setCourseName("\nBachelor of Science in Civil Engineering");
                        System.out.println("\nCourse updated successfully.");
                        break;
                    case 6:
                        System.out.print("\nEnter new Department: ");
                        String newDepartment = scanner.nextLine();
                        student.getCourse().setDepartment(newDepartment);
                        System.out.println("Department updated successfully.");
                        break;
                    default:
                        System.out.println("\nInvalid selection. Please try again.");
                        break;
                }
            } else if (recordMenuSelection == 3) {
                System.out.println("\n\n\nStudent Record Management App v1");
                System.out.println("\n================================");
                System.out.println("Student Record:");
                System.out.println("--------------------------------");
                System.out.println("\nStudent Profile Details");
                System.out.println("Student ID No.: " + student.getStudentID());
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Middle Name: " + student.getMiddleName());
                System.out.println("Last Name: " + student.getLastName());
                System.out.println("Suffix: " + student.getSuffix());
                System.out.println("Age: " + student.getAge());
                System.out.println("Year Level: " + student.getYearLevel());
                System.out.println("Phone Number: " + student.getPhoneNumber());
                System.out.println("Email: " + student.getEmail());
                System.out.println("\nStudent Course Details"); 
                System.out.println("Course Name: " + student.getCourse().getCourseName());
                System.out.println("Course Code: " + student.getCourse().getCourseCode());
                System.out.println("Course Department: " + student.getCourse().getDepartment());
                System.out.println("\n================================");                    
                System.out.println();
            } else if (recordMenuSelection == 0) {
                System.out.println("\nExiting the application. Goodbye!");
                break;
            } else {
                System.out.println("Invalid selection. Please try again.");
            }
          }
        }
      }
    }
