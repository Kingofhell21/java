package amber;
interface CarLoan
{
int carloanamt=300000;
float getCarLoanInterest();
}

interface GoldLoan
{
	int goldloanamt=100000;
	float getGoldLoanInterest();
}

abstract class Bank
{
abstract float getInterest(); //it wont allow definition
static void display()
{
	System.out.println("display method");
}
}

class SBI extends Bank implements CarLoan
{
float getInterest() //we redefined the abstract method.
{
return 7.5f;
}
public float getCarLoanInterest()
{
	return 6.9f;
}
}

class Canara extends Bank implements GoldLoan
{
float getInterest()
{
return 7.9f;
}
public float getGoldLoanInterest()
{
	return 3.5f;
}
}
class RBI extends Bank implements CarLoan,GoldLoan
{
	float getInterest()
	{
		return 9.8f;
	}
	public float getCarLoanInterest()
	{
	return 5.5f;
	}
	public float getGoldLoanInterest()
	{
		return 9.5f;
	}
}
public class Interface_ex {

	public static void main(String[] args) {
		SBI s=new SBI();
		Canara c=new Canara();
		RBI r=new RBI();
		System.out.println("Interest for SBI "+s.getInterest());
		System.out.println("Car Loan Interest for SBI "+s.getCarLoanInterest());
		System.out.println("Interest for Canara "+c.getInterest());
		System.out.println("Gold Loan Interest for Canara "+c.getGoldLoanInterest());
		System.out.println("Interest for RBI "+r.getInterest());
		System.out.println("Gold Loan Interest for RBI "+r.getGoldLoanInterest());
		System.out.println("Car Loan Interest for RBI "+r.getCarLoanInterest());

	}

}