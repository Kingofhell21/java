package amber;

abstract class Passingvalues {
	Passingvalues(){
		System.out.println("lets see the addition");
	}

	abstract float add1(float a,float b);
	abstract int add2(int x,int y,int z);
	
	}
	class Getvalues extends Passingvalues{
		float add1(float a,float b) {
		
			float add = a+b;
			return add;
		}
		int add2(int x,int y,int z) {
			int sum=x+y+z;
			return sum;
		}
		
	}
	class Abstractexp{
		public static void Passingvalues (String[]args) {
			Getvalues sc=new Getvalues();			
			System.out.println("sum of three num" +sc.add2(4, 3, 5));
			System.out.println("sum of two num" + sc.add1(44.23f, 3332.11f));
		}

}
