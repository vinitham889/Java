package lesson;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="Vinitha";
		String lname = "Mani";
		String fullName = name.concat(lname);
		System.out.print("full name:"+fullName);
//		removing whitespace in string
//		System.out.println(name.replaceAll("\\s",""));
		System.out.println();
		System.out.println("The Orginal String is:\n"+name);
		System.out.println("Reverse String is:");
		for(int i=name.length()-1;i>=0;i--)
		{
			name.charAt(i);
			System.out.print(name.charAt(i));
		}		

	}

}
