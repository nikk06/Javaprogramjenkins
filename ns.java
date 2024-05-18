import java.util.*;
class ns 
{
	public static void main(String[] args) 
	{
		 //rotate array by group 
		 int n[]={1,2,3,4,5,6,7,8,9};
		 //o/p=321654987
		 int k=3;
		 int c=k,slow=0,fast=0;
		 int a=n.length;
		 fast=a-1;
		 while(slow<fast)
		 {
             for(int i=k-1;i>=slow;i--)
			 {
                System.out.println(n[i]);
			 }
			 slow=k;
			 k=k+c;
		 }
	}
}
/* 
public static void main(String []args){
	int n[]={1,2,3,4,5,6,7,8,9};
	int slow=0,fast=0,i,k=3;
	int c=k;
	int s=n.length;
		slow=0;
		fast=s-1;
	while(slow<fast)
	{
		for(i=k-1;i>=slow;i--)
		{
			System.out.println(n[i]);
		}
		slow=k;
		k=k+c;
	}
 }
 */