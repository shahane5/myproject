package com.arrays;
//  wap to fond second highest no of array
public class SortingAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,55,50};
int temp=0;
for(int i=0;i<=a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}System.out.println("sorted array is");
for(int x=0;x<a.length;x++) {
	System.out.println(a[x]);
}
System.out.println("length is "+ (a.length));
System.out.println("Second highest number is "+ a[a.length-2]);

}
}
