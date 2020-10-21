package practicing;
public class MysteryReturn {

	public static void main(String[] args) {

		int x = 1;

		int y = 2;

		int z = 3;

		System.out.print("Statement 1 : ");

		z = mystery(x, z, y);

		System.out.print("Statement 2 : ");

		System.out.println(x+" "+y+" "+z);

		System.out.print("Statement 3 : ");

		z = mystery(z, z, y);

		System.out.print("Statement 4 : ");

		System.out.println(x+" "+y+" "+z);

		System.out.print("Statement 5 : ");

		z = mystery(y, y, z);

		System.out.print("Statement 6 : ");

		System.out.println(x+" "+y+" "+z);

	}

	public static int mystery(int z,int x,int y) {

		z--;

		x = 2*y+z;

		y = x-1;

		System.out.println(y+" "+z);

		return x;

	}

}