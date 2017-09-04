package codekamp;

/**
 * Created by cerebro on 04/09/17.
 */
public class Demo {

    // 1. some methods are always successful while others can fail at times

    // 2. if a function fail, we need to take some alternate path
    // 3. this alternate path depends on two things:
     // what were we trying to do with that function or from where was the function called
    //  why it failed


    public static void main(String[] args) {

        String result = Demo.sendSms("+919999991111", "Your OTP is 112233");



    }


    public static String sendSms(String number, String message) {

        return "Number out of service";
    }

    public static Dog getFavoriteDog(int userId) {

    }
}
