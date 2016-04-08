package com.wxz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;




public class SQL {


	public void find(){
		try{
			//����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�ɹ�����MySQL������");
		}catch(ClassNotFoundException e1){
			System.out.println("�Ҳ���MySQL����!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������
			System.out.println("Success connect Mysql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets");
			//user Ϊ��������
			while (rs.next()) {
				System.out.println(rs.getString("class1"));
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}

	public int judge(){
		int b=0;
		try{
			//����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("�ж������Ҳ���MySQL����!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets");
			//user Ϊ��������
			if(rs.next()) {
				b=1;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return b;
	}

	public int getclassnum(){
		int b=0;
		try{
			//����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("�ж������Ҳ���MySQL����!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets ");
			while (rs.next()) {
				b=rs.getInt("classnum");
				break;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return b;
	}

	public String getclassname(String number){
		//number="class1";
		String name="NULL";
		try{
			//����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");

		}catch(ClassNotFoundException e1){
			System.out.println("�ж������Ҳ���MySQL����!");
			e1.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");
			//����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������

			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from sets ");
			while (rs.next()) {
				name=rs.getString(number);
				break;
			}
		}
		catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
		return name;
	}

	 public void write(){
		 try {
	          Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������   
	          //Class.forName("org.gjt.mm.mysql.Driver");
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

	public void writeset(int classnum,String class1){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,1,?,null,null,null,null)");

				Statement.setString(1,class1);
				Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,2,?,?l,null,null,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,3,?,?,?,null,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3,String class4){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,4,?,?,?,?,null)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.setString(4,class4);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void writeset(int classnum,String class1,String class2,String class3,String class4,String class5){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO sets VALUES(1,5,?,?,?,?,?)");

			Statement.setString(1,class1);
			Statement.setString(2,class2);
			Statement.setString(3,class3);
			Statement.setString(4,class4);
			Statement.setString(5,class5);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}

	public void mark(String name,int class1){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,null,null,null,null);");
			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,null,null,null);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,null,null);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3,int class4){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,?,null);");
			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.setInt(5,class4);

			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
	public void mark(String name,int class1,int class2,int class3,int class4,int class5){
		try {
			Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������
			//Class.forName("org.gjt.mm.mysql.Driver");
		}
		catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection( "jdbc:mysql://localhost:3306/student?characterEncoding=utf8&useSSL=true","root","wwxz960909");

			int num=100;
			PreparedStatement Statement=connect.prepareStatement("INSERT INTO data(name,class1,class2,class3,class4,class5) values(?,?,?,?,?,?);");

			Statement.setString(1,name);
			Statement.setInt(2,class1);
			Statement.setInt(3,class2);
			Statement.setInt(4,class3);
			Statement.setInt(5,class4);
			Statement.setInt(6,class5);
			Statement.executeUpdate();


			// } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			// System.out.println("An error has occurred:"+e.toString());
			//  e.printStackTrace();
		}catch(SQLException e)
		{
		}
	}
}
