import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Saffron {
    public static void main(String[] args) {
        // Initialize necessary classes
        Person person = new Person();
        Administrator admin = new Administrator();
        Student student = new Student();
        Teacher teacher = new Teacher();
        Course course = new Course();
        Grade grade = new Grade();
        Scholarship scholarship = new Scholarship();
        Internship internship = new Internship();
        Master master = new Master();

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Welcome to Saffron! Please select an option:");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Exit");

            int option = scanner.nextInt();

            switch(option) {
                case 1:
                    // Handle login
                    System.out.println("Enter your email: ");
                    String email = scanner.next();
                    System.out.println("Enter your password: ");
                    String password = scanner.next();
                    person.login(email, password);
                    break;
                case 2:
                    // Handle registration
                    System.out.println("Enter your email: ");
                    email = scanner.next();
                    System.out.println("Enter your phone number: ");
                    int phoneNumber = scanner.nextInt();
                    System.out.println("Enter your first name: ");
                    String firstName = scanner.next();
                    System.out.println("Enter your last name: ");
                    String lastName = scanner.next();
                    System.out.println("Enter your password: ");
                    password = scanner.next();
                    person.register(email, phoneNumber, firstName, lastName, password);
                    break;
                case 3:
                    // Exit program
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            // check if the user is logged in
            if (person.isLoggedIn()) {
                System.out.println("Welcome, " + person.getFirstName() + "! Please select an option:");
                System.out.println("1. View courses");
                System.out.println("2. View grades");
                System.out.println("3. View scholarships");
                System.out.println("4. View internships");
                System.out.println("5. View masters");
                System.out.println("6. View professors");
                System.out.println("7. Logout");
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                    // View courses
                    if (student.isLoggedIn()) {
                        List<String> courses = course.getAllCourses();
                        System.out.println("Courses available:");
                        for (String c : courses) {
                            System.out.println(c);
                        }
                    } else {
                        System.out.println("You must be logged in as a student to view courses.");
                    }
                    break;
                case 2:
                    // View grades
                    if (student.isLoggedIn()) {
                        Map<Integer, Integer> grades = grade.getGrades(person.getID());
                        System.out.println("Grades:");
                        for (Map.Entry<Integer, Integer> entry : grades.entrySet()) {
                            System.out.println("Course ID: " + entry.getKey() + " Grade: " + entry.getValue());
                        }
                    } else {
                        System.out.println("You must be logged in as a student to view grades.");
                    }
                    break;
                case 3:
                    // View scholarships
                    if (student.isLoggedIn()) {
                        List<Scholarship> scholarships = scholarship.getAllScholarships();
                        System.out.println("Scholarships available:");
                        for (Scholarship s : scholarships) {
                            System.out.println("ID: " + s.getOpportunityNumber() + " location: " + s.getLocation() +" Duration: " + s.getDuration());
                        }
                    } else {
                        System.out.println("You must be logged in as a student to view scholarships.");
                    }
                    break;
                case 4:
                    // View internships
                    if (student.isLoggedIn()) {
                        List<Internship> internships = internship.getAllInternships();
                        System.out.println("Internships available:");
                        for (Internship i : internships) {
                            System.out.println("At: " + i.getLocation() + " at company: " + i.getOrganization() + " Description: " + i.getDescription());
                        }
                    } else {
                        System.out.println("You must be logged in as a student to view internships.");
                    }
                    break;
                case 5:
                        // View masters
                        if (student.isLoggedIn()) {
                            List<Master> masters = master.getAllMasters();
                            System.out.println("Masters programs available:");
                            for (Master m : masters) {
                                System.out.println("location: " + m.getLocation() + " University: " + m.getUniversity() + " Required GPA: " + m.getRequiredGPA());
                            }
                        } else {
                            System.out.println("You must be logged in as a student to view masters programs.");
                        }
                        break;
                    case 6:
                        // View professors
                        if (student.isLoggedIn()) {
                            List<Teacher> professors = teacher.getAllProfessors();
                            System.out.println("Professors:");
                            for (Teacher prof : professors) {
                                System.out.println("Professor: " + prof.getFirstName() + " " + prof.getLastName() + " Email: " + prof.getEmail());
                            }
                        } else {
                            System.out.println("You must be logged in as a student to view professors.");
                        }
                        break;
                    case 7:
                        // Logout
                        person.logout();
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}

                   
