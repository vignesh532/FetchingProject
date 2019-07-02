package org.biz;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int original = sc.nextInt();
int remainder=0,reverse=0;

while(original>0) {
	remainder=original%10;
	reverse=(reverse*10)+remainder;
	original=original/10;
}

if (original==reverse)
{
System.out.println("The number is palindrome");
}
else {
	System.out.println("The number is not palindrome");
}
}

}