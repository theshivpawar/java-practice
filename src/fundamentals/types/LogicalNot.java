package fundamentals.types;

public class LogicalNot {
    public static void main(String[] args) {

        /*
        Customer is eligible for loan if he / she
        has high income or has good credit score,
        but he must not have criminal record
         */

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println("Is eligible for loan?: " + isEligible);


        // Implementation without not

        boolean notHaveCriminalRecord = true;

        isEligible = (hasHighIncome || hasGoodCredit) && notHaveCriminalRecord;
        System.out.println("Is eligible for loan?: " + isEligible);
    }
}
