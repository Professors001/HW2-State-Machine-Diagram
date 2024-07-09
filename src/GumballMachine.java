public class GumballMachine {
    private int gumballCount;
    private boolean hasQuarters;

    public GumballMachine(int gumballCount) {
        this.gumballCount = gumballCount;
        hasQuarters = false;
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + gumballCount + " Gumballs");
        if (gumballCount > 0) {
            System.out.println("Machine is waiting for quarter");
        } else {
            System.out.println("Machine is sold out");
        }
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void insertCoin() {

        if(hasQuarters) {
            System.out.println("You can't insert another quarter");
            return;
        }
        if(gumballCount <= 0) {
            System.out.println("You can't insert another quarter, the machine is sold out");
            return;
        }
        System.out.println("You inserted a quarter");
        hasQuarters = true;
    }

    public void ejectCoin() {
        if(hasQuarters) {
            hasQuarters = false;
            System.out.println("Quarters returned");
            return;
        }
        System.out.println("You haven't inserted a quarter");
    }

    public void turnsCrank() {
        if(gumballCount <= 0) {
            System.out.println("You turned, but there are no gumballs");
            return;
        }
        if(hasQuarters) {
            System.out.println("You turned...");
            System.out.println("A gumball comes rolling out the slot");
            hasQuarters = false;
            gumballCount--;
            if(gumballCount == 0) {
                System.out.println("Oops, Out of gumballs!");
            }
            return;
        }
        System.out.println("You turned but there's no quarter");
        return;
    }
}
