 package CoreTech;

public class Staticnonstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticnonstatic ob=new Staticnonstatic();
		ob.profit(3000,1000, "june");
	}

	public  void multiplication() {
int income=100000;
int expense=60000;
int profit=income-expense;
System.out.println(profit);
	
	
}
public  void profit(int income,int expense,String month) {
int profit=income-expense;
System.out.println("income for month "+month+"="+profit);}

 static int profitwithreturn(int income,int expense,String month) {
int profit=income-expense;
System.out.println("income for month "+month+"="+profit);
return profit;

 }

 





}
