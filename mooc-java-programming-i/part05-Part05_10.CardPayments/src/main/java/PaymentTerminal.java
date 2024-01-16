public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double doPayment(double payment, double price) {
        if (payment >= price){
            this.money += price;             
            return payment - price;
        }
        return payment;
    }
    
    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = doPayment(payment, 2.50); 
        if ( change < payment){
            this.affordableMeals += 1; 
        }
        return change;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        double change = doPayment(payment, 4.30); 
        if ( change < payment){
            this.heartyMeals += 1; 
        }
        return change;
    }

    public boolean doPaymentCard(double price, PaymentCard card) {
        if (card.balance() >= price){
            card.takeMoney(price);
            return true;
        }
        return false;
    }
    
    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        boolean res = doPaymentCard(2.50, card); 
        if (res) {
            this.affordableMeals += 1; 
        }
        return res;
                
    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by the price, and the method returns true
        // otherwise false is returned
        
        boolean res = doPaymentCard(4.30, card); 
        if (res) {
            this.heartyMeals += 1; 
        }
        return res;
    }    
    
    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum; 
            
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
