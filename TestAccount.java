class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a, String n, float amt){
		acc_no=a;
		name =n;
		amount=amt;		
	}
	void deposit(float amt){
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	void withdrawn(float amt){
		if(amount<amt){
			System.out.println("Insufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdrawn");
		}
	}
	void checkBalance(){
		System.out.println("Balance is: "+amount);
	}
	void display(){System.out.println(acc_no+" "+name+" "+amount);}
}
public class TestAccount {

	public static void main(String[] args) {
	Account a =  new Account();
	a.insert(823245, "Kishor", 1000);
	a.display();
	a.checkBalance();
	a.deposit(40000);
	a.checkBalance();
	a.withdrawn(15000);
	a.checkBalance();

	}

}
