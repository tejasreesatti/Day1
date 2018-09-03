import java.util.* ;
public class duplicate {
	public static void main(String[] args)  {
		System.out.println("Enter the sentence");
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		String words[]=inp.split("");
		String words1[]=new String[words.length];
		String fin="";
		int count=1;
		words1[0]=words[0];
		int flag=0;
		for(int i=1; i<words.length;i++)
		{
			for(int j= 0; j <count;j++)
			{
				if(words1[j].compareTo(words[i])==0)
				{
					flag=1;
				}
			}
			if(flag != 1)
			{
				words1[count]=words[i];
				count++;
			}
			flag=0;
		
	}
		for(int k = 0; k < count; k++)
		{
			fin += words1[k];
		}
		System.out.println(fin);
		sc.close();
}

}
