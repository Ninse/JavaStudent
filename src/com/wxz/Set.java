package com.wxz;

import java.io.File;
import java.util.Scanner;

public class Set extends Student{
	public void  Setclass(){
		System.out.println("������Ҫ���õĿγ���Ŀ");
		Scanner sc=new Scanner(System.in);
		int classnum=sc.nextInt();
		
		File f=new File("classnum.txt");
		
		Write A=new Write();
		A.Writetxt(f, classnum);
		
		Read B=new Read();
		B.Readtxt(f);
	}
}
