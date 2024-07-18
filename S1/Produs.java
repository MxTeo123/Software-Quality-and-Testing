public class Produs {

    //Asta era varianta initiala, greu de citit
//    public float Compute(int t, float s, int period)
//    {
//        float result = 0;
//        float value = (period > 10) ? (float)15/100 : (float)period/100;
//        if (t == 1)
//        {
//            result = s;
//        }
//        else if (t == 2)
//        {
//            result = (s - (0.1f * s)) - value * (s - (0.1f * s));
//        }
//        else if (t == 3)
//        {
//            result = (s - (0.25f * s)) - value * (s - (0.25f * s));
//        }
//        else if (t == 4)
//        {
//            result = (s - (0.35f * s)) - value * (s - (0.35f * s));
//        }
//        return result;
//    }

    //Noua varianta mai buna
    public float calculateDiscountedPrice(double discountAmount, float initialPrice){
        return (float) (initialPrice - (discountAmount * initialPrice));
    }

    public float applyDiscount(int discountType, float initialPrice, int percentage)
    {
        float appliedPercentage = (percentage > 10) ? (float)15/100 : (float)percentage/100;

        switch(discountType) {
            case 1:
                return initialPrice;
            case 2:
                return calculateDiscountedPrice(0.1, initialPrice) - appliedPercentage * calculateDiscountedPrice(0.1, initialPrice);
            case 3:
                return calculateDiscountedPrice(0.25, initialPrice) - appliedPercentage * calculateDiscountedPrice(0.25, initialPrice);
            case 4:
                return calculateDiscountedPrice(0.35, initialPrice) - appliedPercentage * calculateDiscountedPrice(0.35, initialPrice);
            default:
                return 0;
        }
    }


    public static void main(String[] args) {
        Produs a = new Produs();
        System.out.println(a.applyDiscount(3, 100, 50));

    }
}
