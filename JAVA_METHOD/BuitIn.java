//math wala
// CompleteMathAllCategories.java

public class BuitIn{

    public static void main(String[] args) {

        // ==================================================
        // IMPORTANT EXAM NOTES
        // ==================================================
        // 1. Math class java.lang package me hoti hai.
        // 2. Import karne ki zarurat nahi hoti.
        // 3. Saare methods static hote hain.
        // 4. Object create nahi kar sakte (private constructor).
        // 5. Direct Math.methodName() use karte hain.

        // ==================================================
        // 1️⃣ BASIC METHODS
        // ==================================================
        System.out.println("ABS: " + Math.abs(-15));
        System.out.println("MAX: " + Math.max(50, 100));
        System.out.println("MIN: " + Math.min(50, 100));

        // ==================================================
        // 2️⃣ POWER & ROOT METHODS
        // ==================================================
        System.out.println("POW (3^4): " + Math.pow(3, 4));
        System.out.println("SQRT (49): " + Math.sqrt(49));
        System.out.println("CBRT (64): " + Math.cbrt(64));
        System.out.println("HYPOT (6,8): " + Math.hypot(6, 8));

        // ==================================================
        // 3️⃣ ROUNDING METHODS
        // ==================================================
        System.out.println("ROUND (7.6): " + Math.round(7.6));
        System.out.println("CEIL (7.1): " + Math.ceil(7.1));
        System.out.println("FLOOR (7.9): " + Math.floor(7.9));
        System.out.println("RINT (7.5): " + Math.rint(7.5));

        // ==================================================
        // 4️⃣ TRIGONOMETRIC METHODS
        // NOTE: Angle always in radians
        // ==================================================
        System.out.println("SIN 90°: " + Math.sin(Math.toRadians(90)));
        System.out.println("COS 60°: " + Math.cos(Math.toRadians(60)));
        System.out.println("TAN 45°: " + Math.tan(Math.toRadians(45)));

        System.out.println("ASIN(1): " + Math.asin(1));
        System.out.println("ACOS(0): " + Math.acos(0));
        System.out.println("ATAN(1): " + Math.atan(1));

        System.out.println("Radians of 180°: " + Math.toRadians(180));
        System.out.println("Degrees of PI: " + Math.toDegrees(Math.PI));

        // ==================================================
        // 5️⃣ LOGARITHMIC METHODS
        // ==================================================
        System.out.println("LOG (Natural): " + Math.log(20));
        System.out.println("LOG10: " + Math.log10(1000));
        System.out.println("EXP (e^3): " + Math.exp(3));

        // ==================================================
        // 6️⃣ RANDOM METHOD
        // Math.random() → 0.0 to 1.0
        // ==================================================
        double randomDouble = Math.random();
        int randomInt = (int)(Math.random() * 50);

        System.out.println("Random Double: " + randomDouble);
        System.out.println("Random Int (0-49): " + randomInt);

        // ==================================================
        // 7️⃣ CONSTANTS
        // ==================================================
        System.out.println("PI Value: " + Math.PI);
        System.out.println("E Value: " + Math.E);

        // ==================================================
        // 8️⃣ EXACT CALCULATION METHODS (Overflow Safe)
        // ==================================================
        System.out.println("AddExact: " + Math.addExact(100, 200));
        System.out.println("SubtractExact: " + Math.subtractExact(200, 50));
        System.out.println("MultiplyExact: " + Math.multiplyExact(10, 5));
        System.out.println("IncrementExact: " + Math.incrementExact(25));
        System.out.println("DecrementExact: " + Math.decrementExact(25));
        System.out.println("NegateExact: " + Math.negateExact(25));

    }
}

