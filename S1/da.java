//
//public class Main {
//    public static String FizzBuzz(int number) {
//        if (number % 3 == 0 && number % 5 == 0) {
//            return "FizzBuzz";
//        } else if (number % 3 == 0) {
//            return "Fizz";
//        } else if (number % 5 == 0) {
//            return "Buzz";
//        } else {
//            return String.valueOf(number);
//        }
//    }
//
//    public static void main(String[] args) {
//            System.out.println(FizzBuzz(20));
//    }
//}
//
//
////o fct care sa returneze fizz daca e multiplu de 3 si buzz pt un nr multiplu de 5,
//// daca nr e multiplu de 3 si 5, afiseaza fizzbuzz, daca nu e multiplu nici de 3 nici de 5, returneaza nr



public class Produs {

    public float calculateDiscountedPrice(double discountAmount, float initialPrice)
    {
        return (float)(initialPrice-(discountAmount*initialPrice));
    }

    public float ApplyDiscount(int discountType, float initialPrice, int percentage) {
        float appliedPercentage = (percentage > 10) ? (float) 15 / 100 : (float) percentage / 100;
        switch (discountType) {
            case 1:
                return initialPrice;
            case 2:
                return 0.1F;
            //return calculateDiscountedPrice(0.1,initialPrice)  - appliedPercentage * calculateDiscountedPrice(0.1,initialPrice));
            case 3:
                return 0.25F;
            //return calculateDiscountedPrice(0.25, initialPrice)- appliedPercentage * calculateDiscountedPrice(0.25, initialPrice));
            case 4:
                return 0.35F;
            //return calculateDiscountedPrice(0.35,initialPrice) - appliedPercentage * calculateDiscountedPrice(0.35,initialPrice));
            default:
                break;
        }
        return 0;
    }
}