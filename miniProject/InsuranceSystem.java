class InsurancePolicy {
    protected String policyHolderName;
    protected int policyTerm;

    public InsurancePolicy(String policyHolderName, int policyTerm) {
        this.policyHolderName = policyHolderName;
        this.policyTerm = policyTerm;
    }

    public void displayPolicyDetails() {
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Policy Term: " + policyTerm + " years");
    }
}

// Derived class for health insurance
class HealthInsurance extends InsurancePolicy {
    private int age;

    public HealthInsurance(String policyHolderName, int policyTerm, int age) {
        super(policyHolderName, policyTerm);
        this.age = age;
    }

    @Override
    public void displayPolicyDetails() {
        super.displayPolicyDetails();
        System.out.println("Age: " + age);
    }

    public double calculatePremium() {
        return 500 * policyTerm + (age > 50 ? 200 : 0);
    }
}

// Derived class for car insurance
class CarInsurance extends InsurancePolicy {
    private String carModel;

    public CarInsurance(String policyHolderName, int policyTerm, String carModel) {
        super(policyHolderName, policyTerm);
        this.carModel = carModel;
    }

    @Override
    public void displayPolicyDetails() {
        super.displayPolicyDetails();
        System.out.println("Car Model: " + carModel);
    }

    public double calculatePremium() {
        return 300 * policyTerm;
    }
}

// For calculating premiums
class InsuranceCalculator {
    public double calculatePremium(HealthInsurance healthInsurance) {
        return healthInsurance.calculatePremium();
    }

    public double calculatePremium(CarInsurance carInsurance) {
        return carInsurance.calculatePremium();
    }

    // Overloaded method to calculate premium based on age and term
    public double calculatePremium(String policyType, int age, int term) {
        if (policyType.equalsIgnoreCase("Health")) {
            return 500 * term + (age > 50 ? 200 : 0);
        } else if (policyType.equalsIgnoreCase("Car")) {
            return 300 * term;
        }
        return 0;
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        HealthInsurance healthPolicy = new HealthInsurance("Isaac Newton", 5, 55);

        CarInsurance carPolicy = new CarInsurance("Shivam Bhuskute", 3, "Mercedes maybach");

        InsuranceCalculator calculator = new InsuranceCalculator();

        // Display Policy Details
        healthPolicy.displayPolicyDetails();
        System.out.println("Health Insurance Premium: $" + calculator.calculatePremium(healthPolicy));

        System.out.println();

        carPolicy.displayPolicyDetails();
        System.out.println("Car Insurance Premium: $" + calculator.calculatePremium(carPolicy));

        System.out.println();

        // Using overloaded method
        System.out.println("Overloaded Premium Calculation:");
        System.out.println("Health Insurance Premium: $" + calculator.calculatePremium("Health", 55, 5));
        System.out.println("Car Insurance Premium: $" + calculator.calculatePremium("Car", 0, 3));
    }
}