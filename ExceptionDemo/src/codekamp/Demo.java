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


    public static void main(String[] args) {

//        Demo.transferMoney();

        Demo.promotion();

    }

    public static void promotion() {

        //code to shortlist target customers

        try {
            Demo.sendSms("+919999000011", "You have been preapproved for home loan of ...");
        } catch (NumberInvalidException e) {
            System.out.println("Remove from list");
        } catch (OutOfBalanceException e) {

        }

        System.out.println("Hello world!");

        Demo.sendSms("dfdsf","SDFdsf");

//        if (output == "Number is invalid") {
//            System.out.println("Remove from list");
//        }
    }

    public static void accountStatement() {
        try {
            Demo.sendSms("+919999000011", "Rs. 9900 credited to your account");
        } catch (Exception e) {
            System.out.println("send email");
        }

//        if (output != null) {
//            System.out.println("send email");
//        }
    }

    public static void transferMoney() {
        try {
            Demo.sendSms("+919999000011", "221100 is your OTP for ...");
        } catch (OutOfBalanceException e) {
            System.out.println("Show IVRS option");
        } catch (NumberInvalidException e) {
            System.out.println("You need to attach a vaild mobile number before you can use net banking");
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

        System.out.println("sending sms to " + number);
    }

    public static int divide(int divior, int divident) throws DivisionByZeroException {

        if (divior == 0) {
            throw new DivisionByZeroException();
        }

        return divident / divior;

    }
}
