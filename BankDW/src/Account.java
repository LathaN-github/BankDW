
public class Account {
	private int Number;
	private double Balance;
	private String Name;
	private String Email;
	private int PhoneNumber;
	
	public Account(int Number,double Balance,String Name,String Email,int PhoneNumber) {
		this.Number = Number;
		this.Balance = Balance;
		this.Name = Name;
		this.Email = Email;
		this.PhoneNumber = PhoneNumber;
	}
	
	public void DepositMoney(double DepositedMoney) {
		this.Balance+= DepositedMoney;
		System.out.println("Deposit is sucessfull,new Balance is " + this.Balance);
	}
	public void WithDraw(double WithDrawalMoney) {
		if(this.Balance - WithDrawalMoney < 0) {
			System.out.println("WithDraw unsucessfull only"+ this.Balance+ " is left");
		}else {
			this.Balance-= WithDrawalMoney;
			System.out.println("WithDraw sucessfull,current Balance is " +this.Balance);
		}
	}
	
	public int getNumber() {
		return Number;
	}
	public int setNumber(int number) {
		return Number = number;
	}

	public double getBalance() {
		return Balance;
	}
	public double setBalance(double balance) {
		return Balance = balance;
	}

	public String getName() {
		return Name;
	}
	public String setName(String name) {
		return Name = name;
	}

	public String getEmail() {
		return Email;
	}
	public String setEmail(String email) {
		return Email = email;
	}

	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public int setPhoneNumber(int phoneNumber) {
		return PhoneNumber = phoneNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
