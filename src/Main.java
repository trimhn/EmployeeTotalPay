import java.util.Scanner;

public class Main {
    public static void main (String[]args){
            // declare the variables
            String customerName;
            double purchaseAmount;
            int taxCode;
            double taxAmount;
            double totalPurchaseValue;

//            System.out.println("Customer name:" + );
            {
                //  get input value
                Scanner keyboard = new Scanner(System.in);

                System.out.println("Enter the customer name ");
                customerName = keyboard.nextLine();
                System.out.println("enter the tax code");
                taxCode = keyboard.nextInt();
                System.out.println("Enter the purchse amount");
                purchaseAmount=keyboard.nextDouble();

                System.out.println("customerName:  " + customerName);

                if (taxCode == 0) {
                    //System.out.println( customerName);
                    System.out.println("Tax Exempt");
                    System.out.println("Total pay= " + purchaseAmount);
                }
                else if
                (taxCode ==1){
                    //System.out.println("customerName:  " + customerName);
                    System.out.println(customerName + ": will pay State tax.");
                    System.out.println("Total pay= " + (purchaseAmount + (0.03 * purchaseAmount)));
                    System.out.println("Tax Amount= " + (0.03 * purchaseAmount));
                }
                else if
                (taxCode==2){
                    //System.out.println("customerName" + customerName);
                    System.out.println(customerName + ": will pay State and Federal tax.");
                    System.out.println("Total pay= " + (purchaseAmount + (0.05 * purchaseAmount)));
                    System.out.println("Tax Amount= " + (0.05 * purchaseAmount));
                }
                else if (taxCode==3){
                    //System.out.println("customerName" + customerName);
                    System.out.println(customerName + ": will pay Special tax.");
                    System.out.println("Total pay= " + (purchaseAmount + (0.07 * purchaseAmount)));
                    System.out.println("Tax Amount= " + (0.07 * purchaseAmount));
                }


            }
        }
    }


