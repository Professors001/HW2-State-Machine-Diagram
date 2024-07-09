public class Main {
    public static void main(String[] args) {
        GumballMachine gm1 = new GumballMachine(5);
        System.out.println();
        gm1.insertCoin();
        gm1.turnsCrank();

        System.out.println();
        GumballMachine gm2 = new GumballMachine(gm1.getGumballCount());
        System.out.println();
        gm2.insertCoin();
        gm2.ejectCoin();
        gm2.turnsCrank();

        System.out.println();
        GumballMachine gm3 = new GumballMachine(gm2.getGumballCount());
        System.out.println();
        gm3.insertCoin();
        gm3.turnsCrank();
        gm3.insertCoin();
        gm3.turnsCrank();
        gm3.ejectCoin();

        System.out.println();
        GumballMachine gm4 = new GumballMachine(gm3.getGumballCount());
        System.out.println();
        gm4.insertCoin();
        gm4.insertCoin();
        gm4.turnsCrank();
        gm4.insertCoin();
        gm4.turnsCrank();
        gm4.insertCoin();
        gm4.turnsCrank();

        System.out.println();
        GumballMachine gm5 = new GumballMachine(gm4.getGumballCount());

    }
}