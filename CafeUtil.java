import java.util.ArrayList;

class CafeUtil {
    public Integer getStreakGoal() {
        Integer total = 0;
        for(int i=0; i <11; i++){
            total+= i;
        };
        

        return total;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for (double price: prices){
            sum += price;
            System.out.print(sum);
        }

        return sum;

        
    }

    public void displayMenu(ArrayList<String> menuItems){
        int i = 0;
        for(String item : menuItems){
            System.out.println(i +". " + item); i++;
        }

        
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("please enter your name");
        String userName = System.console().readLine();
        System.out.println("hello, " + userName);
        System.out.println("There are " + i + "people in front of you");

    }

        


    
}
        