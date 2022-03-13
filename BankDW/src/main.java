
public class main {

	public static void main(String[] args) {
		int Number;
		double Balance;
		String Name;
		String Email;
		int PhoneNumber;
		Account LathasAccount = new Account(Number=678,Balance=0.0,Name="yut",Email="tyu@tyu.com",PhoneNumber=7680);
		/*LathasAccount.DepositMoney(1000);
		LathasAccount.WithDraw(500);*/
		LathasAccount.DepositMoney(500);
		LathasAccount.WithDraw(200);
		
	}

}
