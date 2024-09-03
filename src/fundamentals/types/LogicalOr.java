package fundamentals.types;

public class LogicalOr {
    public static void main(String[] args) {

        /*
        User is allowed to access content if he is logged in from any of the these
        platforms - Email / Google / Facebook
         */

        boolean isLoggedInFromEmail = false;
        boolean isLoggedInFromGoogle = false;
        boolean isLoggedInFromFacebook = false;

        boolean allowAccess = isLoggedInFromEmail || isLoggedInFromGoogle || isLoggedInFromFacebook;
        System.out.println("Is access allowed?: " + allowAccess);

        /*
        Customer is eligible for loan if he / she
        has high income or has good credit score
         */

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;

        boolean isEligible = hasHighIncome | hasGoodCredit;
        System.out.println("Is eligible for loan?: " + isEligible);
    }
}
