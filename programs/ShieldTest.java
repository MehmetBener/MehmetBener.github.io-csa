// TARGET: Find 7 errors.

public class ShieldTest {
    public static void main(String[] args) {
        
        System.out.println("=== SHIELD TEST INITIATED ===");

        // --- STEP 1: VARIABLES AND PRINTING ---
        System.out.println("\n[STEP 1] Charging energy...");
        
        // ERROR 1: Missing punctuation at the end of the statement.
        int energyLevel = 100;
        
        // ERROR 2: You cannot assign a double directly to an int without casting.
        double preciseVoltage = 12.5;
        int voltageWhole = (int)(preciseVoltage); 

        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Voltage: " + voltageWhole);


        // --- STEP 2: MATH AND DIVISION ---
        System.out.println("\n[STEP 2] Calculating efficiency...");
        
        int totalCapacity = 50;
        int sensorCount = 4;
        
        // ERROR 3: Dividing two ints results in an int (12 instead of 12.5). Fix it with a cast.
        double efficiency = totalCapacity / (double)(sensorCount); 
        
        // ERROR 4: To find the remainder, use the modulo operator, not division.
        int leftoverEnergy = totalCapacity % sensorCount; 

        System.out.println("Efficiency (Expected 12.5): " + efficiency);
        System.out.println("Leftover Energy (Expected 2): " + leftoverEnergy);


        // --- STEP 3: THE MATH CLASS ---
        System.out.println("\n[STEP 3] Mathematical verifications...");
        
        // ERROR 5: Java is case-sensitive. The Math class must be capitalized.
        double deviation = Math.abs(-8.5); 
        
        // ERROR 6: Math.pow(base, exponent) requires exactly two parameters.
        double targetPower = Math.pow(3.0, 2.0); 
        
        // ERROR 7: Missing a closing parenthesis.
        int randomCode = (int) (Math.random() * 10); 

        System.out.println("Deviation: " + deviation);
        System.out.println("Target Power: " + targetPower);
        System.out.println("Random Code: " + randomCode);

        System.out.println("\n=== SHIELD TEST SUCCESSFUL! ===");
    }
}
