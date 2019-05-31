/*
 * WIP XI Computer Programing 
 */

package II.DataTypes;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Double {
    public static void main(String[] args) {
        double sakuraWallet = 100;
        double wasabiWallet = 300;
        
        double bigLeySnack = 20;
        
        System.out.println("sakura buy 1 ley (20 thb)");
        sakuraWallet = sakuraWallet - bigLeySnack;
        
        System.out.println("sakuraWallet : " + sakuraWallet);
        
        System.out.println("wasabi give sakura 25.38 thb");
        wasabiWallet -= 50.70;
        //wasabiWallet = wasabiWallet - 50.70;
        sakuraWallet += 50.70;
        //sakuraWallet = sakuraWallet + 50.70;
        
        System.out.println("wasabiWallet : " + wasabiWallet);
        System.out.println("sakuraWallet : " + sakuraWallet);
    }
}
