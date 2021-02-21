import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Lottery {

    final List<Customer> customerList = new ArrayList<>();
    public List<Customer> winningCustomers = new ArrayList<>();
    final List<Integer> lotteryDigits = new ArrayList<>();

    final int maxvalue = 1;
    final int minValue = 9;
    final int numberOfLotteryDigits = 6;
    private int matchingDigits = 0;

    public void buyTickets(int id, String name, int age, int num1,
                           int num2, int num3, int num4, int num5, int num6 ){

        Customer customer = new Customer(id, name, age, num1, num2, num3, num4, num5, num6);
        this.customerList.add(customer);

    }

    public void pickLottery(){

        /*
         *  adds the random lottery ticket digits to the arraylist.
         */
        for(int i = 0; i <= numberOfLotteryDigits; i++){
            this.lotteryDigits.add( (int) (Math.random()* (this.maxvalue - this.minValue)) + minValue);
        }

        System.out.println(lotteryDigits.toString());

        for(Customer customer: customerList ){

            ArrayList<String> tempList = new ArrayList<>();

            for(int i : lotteryDigits){
                tempList.add(i+"");
            }

            if(tempList.contains(customer.num1+ "")){
                int index = tempList.indexOf( customer.num1 + "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }
            if(tempList.contains(customer.num2+ "")){
                int index = tempList.indexOf(customer.num2+ "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }
            if(tempList.contains(customer.num3+ "")){
                int index = tempList.indexOf(customer.num3+ "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }
            if(tempList.contains(customer.num4+ "")){
                int index = tempList.indexOf(customer.num4+ "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }
            if(tempList.contains(customer.num5+ "")){
                int index = tempList.indexOf(customer.num5+ "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }
            if(tempList.contains(customer.num6 + "")){
                int index = tempList.indexOf(customer.num6+ "");
                tempList.set(index, "0");
                this.matchingDigits = this.matchingDigits + 1;
            }

            switch (this.matchingDigits){
                case 4:
                    System.out.println(customer.name +
//                            " - " + this.lotteryDigits + this.matchingDigits +
//                            "temp list -> " + tempList +
                            " --> Congrats on winning 1000");
                    this.winningCustomers.add(customer);
                    this.matchingDigits = 0;
                    break;

                case 5:
                    System.out.println(customer.name +
//                            " - " + this.lotteryDigits + this.matchingDigits +
//                            "temp list -> " + tempList +
                            " --> Congrats on winning 10000");
                    this.winningCustomers.add(customer);
                    this.matchingDigits = 0;
                    break;

                case 6:
                    System.out.println(customer.name +
//                            " - " + this.lotteryDigits + this.matchingDigits +
//                            "temp list -> " + tempList +
                            " --> Congrats on winning 100000");
                    this.winningCustomers.add(customer);
                    this.matchingDigits = 0;
                    break;

                default:
//                    System.out.println(customer.toString() +
//                            " - " + this.lotteryDigits + this.matchingDigits +
//                            "temp list -> " + tempList +
//                            " --> Better luck next time");
                    this.matchingDigits = 0;
                    break;
            }

        }

        this.orderCustomers();


    }

    /**
     * Using simple bubble sort mechanism to sort based on age (To reduce complexity).
     */
    private void orderCustomers() {

//        System.out.println("UnSorted customers list based on Name" + this.winningCustomers);
         int listLength = this.winningCustomers.size();
         Customer tempValue;

         for(int i = 0; i < listLength; i++){
             for(int j = 1; j < listLength-i; j++){
                 if(winningCustomers.get(j-1).age > winningCustomers.get(j).age){
                     tempValue = winningCustomers.get(j-1);
                     winningCustomers.set(j-1, winningCustomers.get(j));
                     winningCustomers.set(j, tempValue);
                 }
             }
         }
        System.out.println("");
        System.out.println("Sorted customers list based on Name");
        if(this.winningCustomers.isEmpty()){
            System.out.println("No one won the lottery this time...");
        } else {
            for(Customer customer: this.winningCustomers){
                System.out.println("Customer Name: "+customer.name + ", Age: "+ customer.age);
            }
        }


    }


}
