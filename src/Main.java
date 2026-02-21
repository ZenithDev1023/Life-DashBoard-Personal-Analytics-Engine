import java.util.Scanner;

import service.dashboard.DashboardService;
import persistence.CsvManager;

import module.FinanceModule;
import module.HealthModule;
import module.LearningModule;
import module.RelationshipModule;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        FinanceModule financeModule = new FinanceModule();
        HealthModule healthModule = new HealthModule();
        LearningModule learningModule = new LearningModule();
        RelationshipModule relationshipModule = new RelationshipModule();
        DashboardService DashboardService = new DashboardService();

        CsvManager csvManager = new CsvManager();

        boolean running = true;

        while (running) {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting...");
                    return;

                case 1:

                    break;

                case 2:

                    break;
                
                case 3:

                    break;
                
                case 4:

                    break;
                
                case 5:

                    break;

                case 6:

                    break;

                default:
                    System.out.println("Invalid input! Please try again...");
            }
        }
        scanner.close();
    }
}
