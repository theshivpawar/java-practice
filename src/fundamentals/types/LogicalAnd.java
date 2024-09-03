package fundamentals.types;

public class LogicalAnd {
    public static void main(String[] args) {

        int temperature = 22;

        boolean isWarm = temperature >= 21 && temperature <= 30;
        System.out.println("Is warm?: " + isWarm);

        /*
        User is allowed to make a purchase only when
        - Logged In
        - Email is Verified
        - Card Info is Valid
        If any one condition is missing, stop the purchase.
         */

        boolean isLoggedIn = false;
        boolean isEmailVerified = true;
        boolean isCardInfoValid = true;

        boolean canMakePurchase = isLoggedIn && isEmailVerified && isCardInfoValid;
        System.out.println("Can user make purchase?: " + canMakePurchase);

        // Find if n1 is greater than n2 and n3
        int n1 = 4;
        int n2 = 3;
        int n3 = 2;

        boolean isGreater = (n1 >= n2) && (n1 >= n3);
        System.out.println("Is n1 greater than or equal to n2 and n3?: " + isGreater);

    }
}