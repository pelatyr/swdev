package homework;
public class Main {
	public static void main(String[] args) {
		
		Bankaccount[] ba = new Bankaccount[5];
		
		ba[0] = new Bankaccount();{
			ba[0].setaccountNumber("384-281-876");
			ba[0].setaccountName("A");
			ba[0].setBalance(100);
			ba[0].setdeposit(500);
			ba[0].setwithdraw(0);
			ba[0].setinterestRate(3);
			ba[0].getBalance();
		}
		ba[1] = new Bankaccount();{
			ba[1].setBalance(0);
			ba[1].setaccountNumber("098-456-213");
			ba[1].setaccountName("B");
			ba[1].setdeposit(200);
			ba[1].setdeposit(5000);
			ba[1].setwithdraw(300);
			ba[1].setinterestRate(0);
			ba[1].getBalance();
		}
		ba[2] = new Bankaccount();{
			ba[2].setBalance(300);
			ba[2].setaccountNumber("423-167-089");
			ba[2].setaccountName("C");
			ba[2].setdeposit(500);
			ba[2].setwithdraw(100);
			ba[2].setinterestRate(1.5);
			ba[2].getBalance();
		}
	
		ba[3] = new Bankaccount();{
			ba[3].setBalance(1000);
			ba[3].setaccountNumber("164-956-280");
			ba[3].setaccountName("D");
			ba[3].setdeposit(500);
			ba[3].setwithdraw(0);
			ba[3].setinterestRate(0);
			ba[3].getBalance();
		}
		ba[4] = new Bankaccount();{
			ba[4].setBalance(100);
			ba[4].setaccountNumber("281-271-465");
			ba[4].setaccountName("E");
			ba[4].setdeposit(500);
			ba[4].setdeposit(600);
			ba[4].setwithdraw(0);
			ba[4].setinterestRate(0);
			ba[4].getBalance();
		}
		System.out.println(ba[0].getterAcc());
		System.out.println("===================================================================================================================");
		System.out.println(ba[1].getterAcc());
		System.out.println("===================================================================================================================");
		System.out.println(ba[2].getterAcc());
		System.out.println("===================================================================================================================");
		System.out.println(ba[3].getterAcc());
		System.out.println("===================================================================================================================");
		System.out.println(ba[4].getterAcc());
		System.out.println("===================================================================================================================");
		
		double n = ba[0].getBalance(); 
		 
		 for (int i = 0; i < ba.length; i++) {
			 if(n < ba[i].getBalance()) {
		           n = ba[i].getBalance();
			 }
		 }	
		 
		 for (int i = 0; i < ba.length; i++) {
			 if(n==ba[i].getBalance()) {
				 System.out.printf("The person with highest account balance is %s ($%.2f)\n",ba[i].accountName,n);
			 }
		 }
		 
		 for (int i = 0; i < ba.length; i++) {
			 if(n > ba[i].getBalance()) {
		           n = ba[i].getBalance();
			 }
		 }
		 
		 for (int i = 0; i < ba.length; i++) {
			 if(n==ba[i].getBalance()) {
				 System.out.printf("The person with lowest account balance is %s ($%.2f)\n",ba[i].accountName,n);
			 }
		 }
		 String Deposit = "D",Withdraw = "W";
		 int[] Dtimes,Wtimes;
		 Dtimes = new int[10];
		 Wtimes = new int[10];
	        for (int j = 0; j < ba.length ;j++) {
	        	for (int i = 0; i < ba[i].getTransactions().length(); i++) {
		            if (ba[i].getTransactions().substring(i).startsWith(Deposit)) {
		                Dtimes[j] ++;
		                Wtimes[j] --;
		                if(Wtimes[j] == -1) {
		                	Wtimes[j]++;
		                }
		            }
		            else {
		            	Dtimes[j] --;
		            	Wtimes[j] ++;
		            	if(Dtimes[j] == -1) {
		            		Dtimes[j]++;
		            }
		        }
	        }
	        }
         	
	        for (int i = 0; i < ba.length; i++) {
	        	if(Dtimes[i]>Wtimes[i]) {
	        		System.out.println(ba[i].accountName + " : Longest repeating activity : Deposit (" + Dtimes[i] +"times)" );
	        	}
	        	else if(Dtimes[i]<Wtimes[i]) {
	        		System.out.println(ba[i].accountName + " : Longest repeating activity : Withdraw (" + Wtimes[i] +"times)" );
	        	}	
	        }
	}
	
}
