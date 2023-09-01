import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CareerPortal {

    // Define the data structure for storing the career information
    private static Map<String, List<String>> careers = new HashMap<>();

    // Define the data structure for storing the individual's information
    private static Map<String, List<String>> individuals = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Load the career information into the careers map
        loadCareers();

        // Loop until the user exits
        while (true) {
            System.out.println("\n ---Welcome to the Career Portal--- \n ");
            System.out.println("1. Register an Individual");
            System.out.println("2. View Available Careers");
            System.out.println("3. View Recommended Careers for an Individual");
            System.out.println("4. Take the quiz");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    registerIndividual(scanner);
                    break;
                case 2:
                    viewCareers();
                    break;
                case 3:
                    recommendCareer(scanner);
                    break;
                case 4:
                    new start();
                   // new quiztest("Simple Quiz Test");
                    break;

                case 5:
                    System.out.println("Thank you for using the Career Portal. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void loadCareers() {
        // Load the career information into the careers map
        List<String> itCareers = new ArrayList<>();
        itCareers.add("Software Engineer");
        itCareers.add("Web Developer");
        itCareers.add("Database Administrator");
        careers.put("IT", itCareers);

        List<String> healthcareCareers = new ArrayList<>();
        healthcareCareers.add("Physician");
        healthcareCareers.add("Nurse");
        healthcareCareers.add("Physical Therapist");
        careers.put("Healthcare", healthcareCareers);
        
        
        List<String> FinanceCareers = new ArrayList<>();
        FinanceCareers.add("Accountant");
        FinanceCareers.add("Bank teller");
        FinanceCareers.add("Billing Specialist");
        FinanceCareers.add("Budget analyst");
        FinanceCareers.add("Corporate Banker");
        careers.put("Finance", FinanceCareers);

        List<String> ManagementCareers = new ArrayList<>();
        ManagementCareers.add("Accounts manager");
        ManagementCareers.add("Airfield Operations Specialist");
        ManagementCareers.add("Administrative assistant");
        ManagementCareers.add("Chief Executive officer");
        ManagementCareers.add("Bussiness Development manager");
        careers.put("Management", ManagementCareers);

        // Add more career categories and careers as needed
    }

    private static void registerIndividual(Scanner scanner) {
        System.out.println("Enter the individual's name: ");
        String name = scanner.nextLine();
        List<String> individualData = new ArrayList<>();
        individualData.add(getHobbies(scanner));
        individualData.add(getExtraCurricularActivities(scanner));
        individuals.put(name, individualData);
        System.out.println("Individual registered successfully.");
    }

    private static String getHobbies(Scanner scanner) {
        System.out.println("Enter the individual's hobbies (comma-separated): ");
        return scanner.nextLine();
    }

    private static String getExtraCurricularActivities(Scanner scanner) {
        System.out.println("Enter the individual's extra-curricular activities (comma-separated): ");
        return scanner.nextLine();
    }

    private static void viewCareers() {
        // Loop through the careers map and print out the available careers
        for (String category : careers.keySet()) {
            System.out.println(category + ": ");
            List<String> categoryCareers = careers.get(category);
            for (String career : categoryCareers) {
                System.out.println("- " + career);
            }
        }
    }

    private static void recommendCareer(Scanner scanner) {
    System.out.println("Enter the name of the individual: ");
    String name = scanner.nextLine();
    if (!individuals.containsKey(name)) {
        System.out.println("Individual not found.");
        return;
    }
    List<String> individualData = individuals.get(name);
    String hobbies = individualData.get(0);
    String extraCurricularActivities = individualData.get(1);

    List<String> recommendedCareers = new ArrayList<>();

    for (String category : careers.keySet()) {
        List<String> categoryCareers = careers.get(category);
        for (String career : categoryCareers) {
            if (matchesInterests(career, hobbies) || matchesActivities(career, extraCurricularActivities)) {
                recommendedCareers.add(career);
            }
        }
    }

    if (recommendedCareers.isEmpty()) {
        System.out.println("No recommended careers found for " + name);
    } else {
        System.out.println("Recommended careers for " + name + ": ");
        for (String career : recommendedCareers) {
            System.out.println("- " + career);
        }
    }
    }

     private static boolean matchesInterests(String career, String hobbies) {
    String[] interests = hobbies.split(",");
    for (String interest : interests) {
        if (career.toLowerCase().contains(interest.trim().toLowerCase())) {
            return true;
        }
    }
    return false;
      } 

    private static boolean matchesActivities(String career, String activities) {
    String[] activityList = activities.split(",");
    for (String activity : activityList) {
        if (career.toLowerCase().contains(activity.trim().toLowerCase())) {
            return true;
        }
    }
    return false;
     }
    }


       
