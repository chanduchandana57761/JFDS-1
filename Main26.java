interface Alert{
    void sendAlert(String message);
}
class EmailAlert implements Alert{
    @Override
    public void sendAlert(String message){
        System.out.println( "Email Alert: " + message);
    }
}
class MobileAlert implements Alert{
    @Override
    public void sendAlert(String message){
        System.out.println( "Mobile Alert: " + message);
    }
}
class Main26{
    public static void main(String[] args) {
        EmailAlert ea = new EmailAlert();
        ea.sendAlert("Your order has been shipped");

        MobileAlert ma = new MobileAlert();
        ma.sendAlert("Your order has been delivered");
    }
}