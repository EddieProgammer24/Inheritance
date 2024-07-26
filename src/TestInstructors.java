public class TestInstructors {
    public static void main(String[] args) {
        Instructors instructor = new Instructors();
        Spartans spartan = new Spartans();
        Athenians athenian = new Athenians();

        // Display the total budgeted amount allocated for teaching
        double totalBudget = instructor.getBudget() + spartan.getBudget() + athenian.getBudget();
        System.out.println("Total Budgeted Amount: $" + totalBudget);

        // Display what locations each instructor will be positioned
        System.out.println("\nInstructor Locations:");
        System.out.println("Standard Instructors: " + String.join(", ", instructor.getLocations()));
        System.out.println("Spartans: " + String.join(", ", spartan.getLocations()));
        System.out.println("Athenians: " + String.join(", ", athenian.getLocations()));

        // Display levels of knowledge
        System.out.println("\nLevels of Knowledge:");
        System.out.println("Standard Instructors: " + String.join(", ", instructor.getKnowledgeLevels()));
        System.out.println("Spartans: " + String.join(", ", spartan.getKnowledgeLevels()));
        System.out.println("Athenians: " + String.join(", ", athenian.getKnowledgeLevels()));

        // Display needed general teaching materials
        System.out.println("\nGeneral Teaching Materials: " + String.join(", ", instructor.getTeachingMaterials()));
    }
}
