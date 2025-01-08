package Week1.Day2;

public class FibanocciSeries {

	public static void main(String[] args) {
		int count=8;
		int n1=0,n2=1,n3,i;
		{
		System.out.println(n1+ "\n" +n2);//printing 0 and 1
		}
		for (i=2;i<count;i++)//loops starts from 2
			
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		

	}

}
