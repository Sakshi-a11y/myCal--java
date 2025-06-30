import java.util.Scanner;
class ATM 
{
    float balance;
    int pin=5674;
public void checkPin()
{
    System.out.println("enter your pin");
    Scanner sc=new Scanner(System.in);
    int enteredpin=sc.nextInt();
    if(pin==enteredpin)
    {
        menu();
    }
    else
    {
        System.out.println("enter valid pin");
    }
}
public void menu()
{
    System.out.println("enter your chocie");
    System.out.println("1.check account balance");
    System.out.println("2.withdraw money");
    System.out.println("3.deposit money");
    System.out.println("4.exit");
    Scanner sc=new Scanner(System.in);
    int opt=sc.nextInt();
    if(opt==1)
    {
        checkBalance();
        
    }
    else if(opt==2)
    {
        withdrawMoney();
        
    }
    else if(opt==3)
    {
        depositMoney();
        
    }
    else if(opt==4)
    {
        return;
    }
    else
    {
        System.out.println("enter a valid chocie");
    }
}    
    public void checkBalance()
    {
       
        System.out.println("balance="+balance);
        menu();
    
    }
    public void withdrawMoney()
    {
        System.out.println("enter amount");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount>balance)
        {
            System.out.println("insufficent fund");
        }
        else
        {
            balance=balance-amount;
            System.out.println("withdraw money succesful");
            menu();
        }
    }
        public void depositMoney()
        {
            System.out.println("enter amount");
             Scanner sc=new Scanner(System.in);
            int amount=sc.nextInt();
            balance=balance+amount;
            System.out.println("deposit money succesful");
            menu();
        }
            
        
    }
            
public class Main
{
	public static void main(String[] args) {
	ATM obj=new ATM();
	obj.checkPin();
	}
}
