import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simulator sim=new Simulator();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入动物个数：");
		int k=sc.nextInt();
		Animal animals[]=new Animal[k];
		System.out.println("1---Dog    2---Cat");
		
		for(int i=0;i<animals.length;i++) {
			System.out.println("请输入类型：");
			int t=sc.nextInt();
			if(t==1) {
				System.out.println("请输入Dog的名字：");
				String name=sc.next();
				animals[i]=new Dog(name);
			}
			else if(t==2) {
				System.out.println("请输入Cat的名字：");
				String name=sc.next();
				animals[i]=new Cat(name);
			}
			else {
				System.out.println("目前无该类型动物");
				i--;
			}
		}
		
		for(int i=0;i<animals.length;i++) {
			System.out.print(animals[i].getAnimalName());
			animals[i].cry();
		}
		
		
	}

}
