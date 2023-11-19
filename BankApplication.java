import java.util.ArrayList;
import java.util.Scanner;

interface SBI {
	//bank app functionalities..
	//abstract methods
	long getBalance();
	void withdraw(long cashAmount);
	void deposit(long cashAmount);
	void AccountDetails();
	boolean searchAcc(String UserAcc_no);

}
 class Acc1 implements SBI{
	 //type 1 : Acc1
	 //abstract methods of interface implemented
	 String name;
	 String acc_no;
	 String acc_type;
	 long balanceAmt;
	 Acc1(String name,String acc_no,String acc_type,long balanceAmt){
		 this.name=name;
		 this.acc_no=acc_no;
		 this.acc_type=acc_type;
		 this.balanceAmt=balanceAmt;
	 }
	 
	@Override
	public long getBalance() {
		return balanceAmt;
	}

	@Override
	public void withdraw(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		if(balanceAmt >= cashAmount) {
			balanceAmt=balanceAmt-cashAmount;
		System.out.println("Your Bank Balance after withdraw "+balanceAmt);
		}else {
			System.out.println("Transaction Failed : Insufficient of Balance");
		}
	}

	@Override
	public void deposit(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		balanceAmt=balanceAmt+cashAmount;
		System.out.println("Your Bank Balance after Deposit "+balanceAmt);
	}

	@Override
	public void AccountDetails() {
		System.out.println("-*-*-*-*-Bank Account of Acc1-*-*-*-*-");
		System.out.println("Account Holder's Name : "+name);
		System.out.println("Account Type : "+acc_type);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Your Bank Balance : "+balanceAmt);
	}

	
	@Override
	public boolean searchAcc(String UserAcc_no) {
		if(acc_no.equals(UserAcc_no)) {
			AccountDetails();
			return true;
		}

		return false;
	}

	
}
 class Acc2 implements SBI{
	 //type 2 : Acc2
	 //abstract methods of interface implemented
	 String name;
	 String acc_no;
	 String acc_type;
	 long balanceAmt;
	 Acc2(String name,String acc_no,String acc_type,long balanceAmt){
		 this.name=name;
		 this.acc_no=acc_no;
		 this.acc_type=acc_type;
		 this.balanceAmt=balanceAmt;
	 }
	 
	@Override
	public long getBalance() {
		return balanceAmt;
	}

	@Override
	public void withdraw(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		if(balanceAmt >= cashAmount) {
			balanceAmt=balanceAmt-cashAmount;
		System.out.println("Your Bank Balance after withdraw "+balanceAmt);
		}else {
			System.out.println("Transaction Failed : Insufficient of Balance");
		}
	}

	@Override
	public void deposit(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		balanceAmt=balanceAmt+cashAmount;
		System.out.println("Your Bank Balance after Deposit "+balanceAmt);
	}

	@Override
	public void AccountDetails() {
		System.out.println("-*-*-*-*-Bank Account of Acc2-*-*-*-*-");
		System.out.println("Account Holder's Name : "+name);
		System.out.println("Account Type : "+acc_type);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Your Bank Balance : "+balanceAmt);
	}

	
	@Override
	public boolean searchAcc(String UserAcc_no) {
		if(acc_no.equals(UserAcc_no)) {
			AccountDetails();
			return true;
		}
		return false;
	}

 }
 class Acc3 implements SBI{
	 //type 3 : Acc3
	 //abstract methods of interface implemented
	 String name;
	 String acc_no;
	 String acc_type;
	 long balanceAmt;
	 Acc3(String name,String acc_no,String acc_type,long balanceAmt){
		 this.name=name;
		 this.acc_no=acc_no;
		 this.acc_type=acc_type;
		 this.balanceAmt=balanceAmt;
	 }
	 
	@Override
	public long getBalance() {
		return balanceAmt;
	}

	@Override
	public void withdraw(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		if(balanceAmt >= cashAmount) {
			balanceAmt=balanceAmt-cashAmount;
		System.out.println("Your Bank Balance after withdraw "+balanceAmt);
		}else {
			System.out.println("Transaction Failed : Insufficient of Balance");
		}
	}

	@Override
	public void deposit(long cashAmount) {
		System.out.println("Your Bank Balance "+balanceAmt);
		balanceAmt=balanceAmt+cashAmount;
		System.out.println("Your Bank Balance after Deposit "+balanceAmt);
	}

	@Override
	public void AccountDetails() {
		System.out.println("-*-*-*-*-Bank Account of Acc3-*-*-*-*-");
		System.out.println("Account Holder's Name : "+name);
		System.out.println("Account Type : "+acc_type);
		System.out.println("Account Number : "+acc_no);
		System.out.println("Your Bank Balance : "+balanceAmt);
	}


	@Override
	public boolean searchAcc(String UserAcc_no) {
		if(acc_no.equals(UserAcc_no)) {
			AccountDetails();
			return true;
		}
		return false;

	}

 }
 

public class BankApplication {
	public static SBI createAcc(ArrayList<SBI>sbi) {
		 String name;
		 String acc_no;
		 String acc_type;
		 long balanceAmt;
		 int choice;
		 //code for banking functions of customer1 
		 SBI cus1;
		 
		 System.out.println("1.Acc1 2.Acc2 3.Acc");//this is for only to choose entry balance
		 System.out.println("Entry Amount \n Acc1 : 1000 \n Acc2 : 2000 \n Acc3 : 3000");
		 System.out.println("Choose your Bank Account");
		 
		 //getting input from the user
		 Scanner sc=new Scanner(System.in);
		 choice=sc.nextInt();
			System.out.println("Enter Your Name : ");
			name=sc.next();
			System.out.println("Enter Account Type : ");
			acc_type=sc.next();
			System.out.println("Enter Account Number : ");
			acc_no=sc.next();
			System.out.println("Enter the Balance : ");
			balanceAmt=sc.nextLong();
			
			boolean presence=false;
			for(int i=0;i<sbi.size();i++) {
				presence=sbi.get(i).searchAcc(acc_no);
				if(presence) {
					System.out.println("Account already exists !");
				}
			}
			if(!presence) {
				switch(choice) {
				case 1:if(balanceAmt<1000) {
					System.out.println("Please make sure your minimum balance is Rs.1000");
				}else {
					cus1=new Acc1(name,acc_no,acc_type,balanceAmt);
					System.out.println("~~~~~ Account created ~~~~~");
					return cus1;
				}
				
				break;
				case 2:if(balanceAmt<2000) {
					System.out.println("Please make sure your minimum balance is Rs.2000");
				}else {
					cus1=new Acc2(name,acc_no,acc_type,balanceAmt);
					System.out.println("~~~~~ Account created ~~~~~");
					return cus1;
				}
				break;
				case 3:if(balanceAmt<3000) {
					System.out.println("Please make sure your minimum balance is Rs.3000");
				}else {
					cus1=new Acc3(name,acc_no,acc_type,balanceAmt);
					System.out.println("~~~~~ Account created ~~~~~");
					return cus1;
				}
				break;
				default: System.out.println("Incorrect choice");
				
			}
			}
			return null;
	}
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Array List for add options of Banking Application
		ArrayList<SBI>sbi=new ArrayList<>();
		System.out.println("No Account found.Create one");
		SBI cus1=createAcc(sbi);
		if(cus1 !=null) {
			sbi.add(cus1);
		}
		int ch;
		do {
			System.out.println("#Banking Application");
			System.out.println("1.Create an Account \n 2.Display all account details \n "
					+ "3.Search by Account Number \n 4.Deposit the Cash \n"
					+ " 5.Withdraw the Cash \n 6.Remove Account \n 7.Exit ");
			System.out.println("Enter the choice : ");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1:SBI cus=createAcc(sbi);
			if(cus!=null) {
				sbi.add(cus1);
			}
			break;
			case 2:
				if(sbi.isEmpty()) {
					System.out.println("No Accounts Found");
				}
				for(int i=0;i<sbi.size();i++) {
					sbi.get(i).AccountDetails();
				}
				break;
			case 3:
				System.out.println("Enter the Account Number that you want to search");
				String AccountNum=sc.next();
				boolean presence=false;
				for(int i=0;i<sbi.size();i++) {
					presence=sbi.get(i).searchAcc(AccountNum);
					if(presence) {
						break;
					}
				}
				if(!presence) {
					System.out.println("Search Failed  \n Account not found!!! ");
				}
				break;
			case 4:
				System.out.println("Enter the Account Number : ");
				AccountNum=sc.next();
				presence=false;
				for(int i=0;i<sbi.size();i++) {
					presence=sbi.get(i).searchAcc(AccountNum);
					if(presence) {
						System.out.println("Enter the Amount to deposit");
					long amount=sc.nextLong();
					sbi.get(i).deposit(amount);
					break;
					}
				}
				if(!presence) {
					System.out.println("Search Failed  \n Account not found!!! ");
				}
				break;
			case 5:
				System.out.println("Enter the Account Number : ");
				AccountNum=sc.next();
				presence=false;
				for(int i=0;i<sbi.size();i++) {
					presence=sbi.get(i).searchAcc(AccountNum);
					if(presence) {
						System.out.println("Enter the Amount to withdraw");
					long amount=sc.nextLong();
					sbi.get(i).withdraw(amount);
					break;
					}
				}
				if(!presence) {
					System.out.println("Search Failed  \n Account not found!!! ");
				}
				break;
			case 6:
				System.out.println("Enter the Account Number : ");
				String temp=sc.next();
				presence=false;
				for(int i=0;i<sbi.size();i++) {
					presence=sbi.get(i).searchAcc(temp);
					if(presence) {
						sbi.remove(i);
						System.out.println(" ~ Account Deleted Successfully ~ ");
					break;
					}
				}
				if(!presence) {
					System.out.println("Search Failed  \n Account not found!!! ");
				}
				break;
			case 7:
				System.out.println("You are exited !");
				break;
			default: System.out.println("Enter the Correct Choice");
			break;
				
			}
			
		}
		while(ch!=7);
	}
}



	
