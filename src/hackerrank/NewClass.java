import java.util.*;
public class NewClass {
	static int min(int a,int b,int c)
	{
		int m=a;
		if(m>b)m=b;
		if(m>c)
			m=c;
		return m;
	}

	static int call(int l,int b,String[] a)
	{
		int k=0;
		if(a.length<l)
			k=-1;
		else
		{
			if(a[0].length()<b)
				k=-1;
			else
			{
				char hel[][]=new char[l][b];
				for(int i=0;i<l;i++)
				{
					StringTokenizer st=new StringTokenizer(a[i],"#");
					int j=0;
					while(st.hasMoreTokens())
					{
						hel[i][j]=st.nextToken().charAt(0);
						j++;
					}
				}
				int s[][]=new int[l][b];
				int maxofs,maxofi,maxofj;
				for(int i=0;i<l;i++)
				{
					if(hel[i][0]=='x')
					s[i][0]=0;
					else
						s[i][0]=1;
				}
				for(int j=0;j<l;j++)
				{
					{
						if(hel[0][j]=='x')
						s[0][j]=0;
						else
							s[0][j]=1;
					}
				}
				for(int i=1;i<l;i++)
				{
					for(int j=1;j<b;j++)
					{
						if(hel[i][j]!='x')
                          s[i][j] =min(s[i][j-1], s[i-1][j], s[i-1][j-1]) + 1;
						else
							s[i][j]=0;
							
					}
				}
				maxofs=s[0][0];maxofi=0;maxofj=0;
				for(int i=0;i<l;i++)
				{
					for(int j=0;j<b;j++)
					{
						if(maxofs<s[i][j])
						{
							maxofs=s[i][j];
							maxofi=i;
							maxofj=j;
						}
					}
				}
				k=maxofj;
				
			}
		}
		
	return k;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int l=s.nextInt();
int b=s.nextInt();
int l1=s.nextInt();
String a[]=new String[l1];
for(int i=0;i<l1;i++)
	a[i]=s.next();
int k=call(l,b,a);
System.out.println(k);

	}

}