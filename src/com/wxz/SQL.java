package com.wxz;
import java.sql.*; 
public class SQL {
	 public static void main(String args[]) { 
		SQL A=new SQL();
		A.find();
		  } 
	 
	 
	 public void find(){
		   try { 
			      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������    
			      //Class.forName("org.gjt.mm.mysql.Driver"); 
			     System.out.println("Success loading Mysql Driver!"); 
			    } 
			    catch (Exception e) { 
			      System.out.print("Error loading Mysql Driver!"); 
			      e.printStackTrace(); 
			    } 
			    try { 
			      Connection connect = DriverManager.getConnection( 
			          "jdbc:mysql://localhost:3306/test","root","wwxz960909"); 
			           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û��������� 
			 
			      System.out.println("Success connect Mysql server!"); 
			      Statement stmt = connect.createStatement(); 
			      ResultSet rs = stmt.executeQuery("select * from user"); 
			                                                              //user Ϊ�������� 
			      while (rs.next()) { 
			        System.out.println(rs.getString("name")); 
			      } 
			    } 
			    catch (Exception e) { 
			      System.out.print("get data error!"); 
			      e.printStackTrace(); 
			    } 
	 }
	 
	 public void write(){
		 try {
	          Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
	          //Class.forName("org.gjt.mm.mysql.Driver");
	         System.out.println("Success loading Mysql Driver!");
	        }
	        catch (Exception e) {
	          System.out.print("Error loading Mysql Driver!");
	          e.printStackTrace();
	        }
	  try {
	      Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test","root","wwxz960909");
	     
	       int num=100;
	       PreparedStatement Statement=connect.prepareStatement("INSERT INTO user VALUES(?,?)");
	       for(int i=0;i<num;i++)        //�����100�ε�ѭ�������������һ������Ϣ��
	      {
	           Statement.setString(1,"chongshi"+i);
	           Statement.setString(2,"bo"+i);
	           Statement.executeUpdate();
	   }

	  // } catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	   // System.out.println("An error has occurred:"+e.toString());
	  //  e.printStackTrace();
	   }catch(SQLException e)
	   {
	   }
	 }
}
