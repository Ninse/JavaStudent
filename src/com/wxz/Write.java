package com.wxz;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public void Writetxt(File f,String txt){
        FileWriter fw;
        BufferedWriter bw;
        
        try {
			fw = new FileWriter(f);// ��ʼ�������
			bw = new BufferedWriter(fw);// ��ʼ������ַ���
			bw.write(txt);
			bw.close();
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
     
    	
    }
    
    public void Writetxt(File f,int txt){
        FileWriter fw;
        BufferedWriter bw;
        
        try {
			fw = new FileWriter(f);// ��ʼ�������
			bw = new BufferedWriter(fw);// ��ʼ������ַ���
			bw.write(txt);
			bw.close();
			fw.close();
			System.out.println("�������");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
     
    	
    }
}
