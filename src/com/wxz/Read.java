package com.wxz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Read {
	 public void Readtxt(File f){
	        FileReader fr;
	        BufferedReader br;	 
	        StringBuffer sb = new StringBuffer();
	        
	        try {
				fr = new FileReader(f);
	            br = new BufferedReader(fr);// ��ʼ�������ַ���
	            sb.append(br.readLine().toString());// ���ж��ļ�
	            System.out.println("�ļ������ǣ�" + sb);
	            br.close();
	            fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

	 }
}
