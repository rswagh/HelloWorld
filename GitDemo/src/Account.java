
public class Account {
	int balance;
	public Account(int balance){
		this.balance = balance;
	}
	public int getBalance(){
		return balance;
	}
	public void deposit(int amt){
		balance= balance+amt;
	}
	 public void withdraw(int amt){
		 balance = balance -amt;
		 
	 }

}
