package codekamp;

/**
 * Created by cerebro on 04/09/17.
 */
public class Demo {

    public static final boolean NUMBER_VALID = false;
    public static final boolean HAS_BALANCE = true;

    public static Demo d1 = new Demo();

    // 1. some methods are always successful while others can fail at times

    // 2. if a function fail, we need to take some alternate path
    // 3. this alternate path depends on two things:
    // what were we trying to do with that function or from where was the function called
    //  why it failed


    public static void main(String[] args) throws OutOfBalanceException {

//        Demo.transferMoney();


        Demo.accountStatement();


        try {
            Demo.transferMoney();
        } catch (UnableToSendOTPException e) {

        }


        try {
            Demo.divide(0, 99);
        } catch (DivisionByZeroException e) {
            e.getMessage();
        }


        Demo.doSomething();


    }

    public static void promotion() {

        //code to shortlist target customers

        try {
            System.out.println("try starts");
            Demo.sendSms("+919999000011", "You have been preapproved for home loan of ...");
            Demo.divide(10, 30);
            System.out.println("try ends");

        } catch (NumberInvalidException e) {
            System.out.println("Remove from list");
        } catch (OutOfBalanceException e) {

        } catch (DivisionByZeroException e) {

        } finally {

        }

        System.out.println("Hello world!");

//        if (output == "Number is invalid") {
//            System.out.println("Remove from list");
//        }
    }

    public static void accountStatement() throws OutOfBalanceException {

        try {
            Demo.sendSms("+919999000011", "Rs. 9900 credited to your account");
        } catch (NumberInvalidException e) {
            // some backup plan
        }

    }

    public static void transferMoney() throws UnableToSendOTPException {
        try {
            Demo.sendSms("+919999000011", "221100 is your OTP for ...");
        } catch (OutOfBalanceException e) {
            throw new UnableToSendOTPException("GSM module out of balance");
        } catch (NumberInvalidException e) {
            throw new UnableToSendOTPException("User's mobile number not valid");
        }

//        if (output == null) {
//            System.out.println("sms sent. show user UI to enter OTP");
//        } else if (output == "Number is invalid") {
//            System.out.println("You need to attach a vaild mobile number before you can use net banking");
//        } else if (output == "Out of balance") {
//            System.out.println("Show IVRS option");
//        }
    }

    public static void sendSms(String number, String msg) throws NumberInvalidException, OutOfBalanceException {
        if (!NUMBER_VALID) {
            throw new NumberInvalidException();
        }

        if(!HAS_BALANCE) {
            throw new OutOfBalanceException();
        }

        System.out.println("sending sms to " + number);
    }

    public static int divide(int divior, int divident) throws DivisionByZeroException {

        if (divior == 0) {
            throw new DivisionByZeroException("Mathmatics doesn't allow it");
        }

        return divident / divior;

    }

    public static void doSomething() {
        System.out.println("I will throw a runtime exception");

        throw new RuntimeException();
    }
}
