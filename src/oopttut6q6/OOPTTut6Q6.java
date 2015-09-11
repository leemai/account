


public class OOPTTut6Q6 {

  
    public static void main(String[] args) {
       Account [] acc = {new OverdraftAccount(123,"Adam", 1000, "Premium"),
                          new OverdraftAccount(124,"Brian", 30, "Gold"),
                          new OverdraftAccount(125,"Christian", -100, "Silver"),
                          new FixedDepositAccount(126,"David", 100, 3)};
       for (int i=0; i< acc.length; i++)
       	System.out.println(acc[i]+ "\n");
       	
    }
}
