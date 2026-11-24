interface PaymentGateway{
    abstract void makePayment();
}
class GooglePay implements PaymentGateway{
    @Override
         public void makePayment(){
        System.out.println( "Payment completed using Google Pay");
    }
}
class PhonePe implements PaymentGateway{
    @Override
         public void makePayment(){
         System.out.println( "Payment completed using PhonePe");
    }
}
class Main25{
    public static void main(String[] args) {
        GooglePay gp = new GooglePay();
        gp.makePayment();

        PhonePe pp = new PhonePe();
        pp.makePayment();
    }
}