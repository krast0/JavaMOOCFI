
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
        // register initially has 1000 euros of money
    }

    public void addMoneyToCard(PaymentCard paymentCard,double amount){
        if(amount > 0){
            paymentCard.addMoney(amount);
            this.money += amount;
        }
    }

    public double eatAffordably(double payment) {
        double affordableMeal = 2.50;
        if(payment < affordableMeal){ return payment; }
        affordableMeals+=1;
        this.money += affordableMeal;
        return payment - affordableMeal;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public double eatHeartily(double payment) {

        double heartlyMeal = 4.30;
        if(payment < heartlyMeal){return payment; }
        // a hearty meal costs 4.30 euros
        heartyMeals+=1;
        this.money += 4.30;

        // increase the amount of cash by the price of a hearty mean and return the change


        return payment - heartlyMeal;
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }

    public boolean eatAffordably(PaymentCard paymentCard){
        double affordableMeal = 2.50;
        if(paymentCard.balance() >= affordableMeal){
            paymentCard.takeMoney(affordableMeal);
            affordableMeals+=1;
            return true;
        }
        return false;
    }
    public boolean eatHeartily(PaymentCard paymentCard){
        double heartlyMeal = 4.30;
        if(paymentCard.balance() >= heartlyMeal){
            paymentCard.takeMoney(heartlyMeal);
            heartyMeals+=1;
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
