import java.util.Scanner;
public class MedicalExpert {
    private String username ="";
    private String chestPain ="";
    private String cough ="";
    private String fainting ="";
    private String fatigue ="";
    private String headache ="";
    private String backPain ="";
    private String sunkenEyes ="";
    private String fever ="";
    private String soreThroat ="";
    private String restlessness ="";
    private String disease ="";

    public void startDiagnosis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! I am Mr.Expert.\n\nYou can get yourself diagnosed here free of cost!\nI will ask you 10 questions.\n");

        if (username.isEmpty()) {
            System.out.println("What's your name?");
            username = scanner.nextLine();
        }

        if (chestPain.isEmpty()) {
            System.out.println("\nDo you have chest pain?\nPlease type Yes/No");
            chestPain = scanner.nextLine().toLowerCase();
        }

        
        if (cough.isEmpty()) {
            System.out.println("\nDo you have cough?\nPlease type Yes/No");
            cough = scanner.nextLine().toLowerCase();
        }

        if (fainting.isEmpty()) {
            System.out.println("\nDo you faint occasionally?\nPlease type Yes/No");
            fainting = scanner.nextLine().toLowerCase();
        }
    
        if (fatigue.isEmpty()) {
            System.out.println("\nDo you experience fatigue occasionally?\nPlease type Yes/No");
            fatigue = scanner.nextLine().toLowerCase();
        }

        if (headache.isEmpty()) {
            System.out.println("\nDo you experience headaches?\nPlease type Yes/No");
            headache = scanner.nextLine().toLowerCase();
        }

        if (backPain.isEmpty()) {
            System.out.println("\nDo you experience back pains?\nPlease type Yes/No");
            backPain = scanner.nextLine().toLowerCase();
        }

        if (sunkenEyes.isEmpty()) {
            System.out.println("\nDo you experience sunken eyes?\nPlease type Yes/No");
            sunkenEyes = scanner.nextLine().toLowerCase();
        }

        if (fever.isEmpty()) {
            System.out.println("\nDo you experience fever?\nPlease type Yes/No");
            fever = scanner.nextLine().toLowerCase();
        }

        if (soreThroat.isEmpty()) {
            System.out.println("\nDo you experience sore throat?\nPlease type Yes/No");
            soreThroat = scanner.nextLine().toLowerCase();
        }

        if (restlessness.isEmpty()) {
            System.out.println("\nDo you experience restlessness?\nPlease type Yes/No");
            restlessness = scanner.nextLine().toLowerCase();
        }

        diagnoseDisease();

        System.out.println("\n\nDiagnosis Result for " + username + ":");
        if (disease.equals("unknown")) {
            System.out.println("No diseases found. You are healthy!");
        } else {
            System.out.println("We believe that you suffer from " + disease);
        }
    }

    private void diagnoseDisease() {
        if (chestPain.equals("yes") && cough.equals("yes")) {
            disease = "Bronchitis";
        } else if (fainting.equals("yes") && fatigue.equals("yes") && headache.equals("yes")) {
            disease = "Migraine";
        } else if (backPain.equals("yes") && sunkenEyes.equals("yes")) {
            disease = "Kidney Infection";
        } else if (fever.equals("yes") && soreThroat.equals("yes") && restlessness.equals("yes")) {
            disease = "Strep Throat";
        } else {
            disease = "unknown";
        }
    }

    public static void main(String[] args) {
        MedicalExpert medicalExpert = new MedicalExpert();
        medicalExpert.startDiagnosis();
    }
}
