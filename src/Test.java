public class Test {

    public static void main(String[] args) {

        Lottery lottery = new Lottery();

        lottery.buyTickets(1,"Dummy1", 50,2,3, 4, 4, 4, 4);
        lottery.buyTickets(2,"Dummy2", 65,3,4, 4, 5, 4, 4);
        lottery.buyTickets(3,"Dummy5", 70,2,3, 4, 4, 6, 7);
        lottery.buyTickets(4,"Dummy4", 45,2,3, 4, 4, 6, 7);
        lottery.buyTickets(5,"Dummy3", 60,2,3, 4, 4, 6, 7);
        lottery.pickLottery();

    }


}
