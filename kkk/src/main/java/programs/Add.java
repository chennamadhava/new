package programs;

public class Add {

	public int add() {
		int a,b,c;
		a=10;b=20;c=a+b;
		System.out.println("the value of c is:"+c);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add ad=new Add();
		ad.add();
	}

}
