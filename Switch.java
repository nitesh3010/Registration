package StudentRegistration;
import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

public class Switch extends showAllProfile{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Switch sw=new Switch();
		

		Scanner sc1=new Scanner(System.in);
		System.out.println("welcome to the website, enter your info");
		System.out.println("1 registration");
		System.out.println("2 show profile");
		System.out.println("3 update");
		System.out.println("4 delete");
		System.out.println("5 show all profile");
		System.out.println("6 Exist");
		
		int registration = sc1.nextInt();
		
		boolean flag = true;
		
		while(flag = true) {
			
		
		
		switch(registration) {
		case 1:
			
			flag = true;
			
			Scanner sc=new Scanner(System.in);
			
			  
			System.out.println("name");
			String Name=sc.next();
			
			System.out.println("address");
			String add=sc.next();
			
			System.out.println("phone no.");
			long contact=sc.nextLong();
			
			System.out.println("Email id");
			String email=sc.next();
			
			System.out.println("password");
			String pass=sc.next();
			
			Registration reg=new Registration();
		
			reg.setName(Name);
			reg.setAddress(add);
			reg.setPhone(contact);
			reg.setEmail_id(email);
			reg.setPassword(pass);
			  System.out.println("");
			  System.out.println("");			  
			    System.out.println(reg.getName());
				System.out.println(reg.getAddress());
				System.out.println(reg.getPhone());
				System.out.println(reg.getEmail_id());
				System.out.println(reg.getPassword());
				  String N=reg.getName();
				  String A=reg.getAddress();
				  long C=reg.getPhone();
				  String E=reg.getEmail_id();
				  String P=reg.getPassword();
			 
			 
				 try {
					   Class.forName("com.mysql.jdbc.Driver");  
					   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naruto","root","Naruto@1010");  
					   Statement stmt=con.createStatement(); 
					   System.out.println("Connection Established");
					   
					   // Execute a query              
					          String sql = "INSERT INTO Student2 VALUES ('"+N+"','"+A+"','"+C+"','"+E+"','"+P+"')";
					          stmt.executeUpdate(sql);
					          System.out.println("Inserted records into the table...");      
					       } catch (SQLException | ClassNotFoundException e) {
					          e.printStackTrace();
					       } 				
		
				 break;
				
		case 2:
			
			flag = true;
			System.out.println("");
			
			System.out.println("Show Profile");
			System.out.println("login");
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter email_id");
			String C_email=sc2.next();
			System.out.println("Enter password");
			String C_pass=sc2.next();
			
					 
			showProfile show=new showProfile();
			
			String CE=show.setC_email_id(C_email);
			String CP=show.setC_password(C_pass);
				System.out.println("");	
				 //	System.out.println(show.getC_email_id());
				 //	System.out.println(show.getC_password());
				 //		String CE=show.getC_email_id();
				 //		String CP=show.getC_password();		
					
						String SE=show.show_email();
						String SP=show.show_pass();
						
						if((SE == CE) && (SP == CP)) {
							 try {
								   Class.forName("com.mysql.jdbc.Driver");  
								   Connection con=DriverManager.getConnection(  
								   "jdbc:mysql://localhost:3306/naruto","root","Naruto@1010");  
								   //Statement stmt=con.createStatement(); 
								   
								   System.out.println("Connection Established");
								   String sql_search = "select * from Student2 where EMAIL = ? and PASSWORD = ?";
								   PreparedStatement ps = con.prepareStatement(sql_search);
								   ps.setString(1, SE);
								   ps.setString(2, SP);
								   ResultSet rs = ps.executeQuery();
								   if (rs.next()) {
								    System.out.println(rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getLong("PHONE")+" "+rs.getString("EMAIL")+" "+rs.getString("PASSWORD"));
								   }
								   else {
									   System.out.println("Data not found");
								   }
						}  catch (Exception e) {
							   e.printStackTrace();
							  }
						}
							 else {
								    System.out.println("Data not Searched...");
								   }
								 
					break;
					
		case 3:
			flag=true;
			
			System.out.println("");
			
			
			System.out.println("Update Profile");
			System.out.println("choose");
			Scanner sc3=new Scanner(System.in);
			System.out.println("Enter email_id");
			String U_email=sc3.next();
			System.out.println("Enter password");
			String U_pass=sc3.next();
			
						
			updateProfile update=new updateProfile();
			
			String UE=update.setU_email_id(U_email);
			String UP=update.setU_password(U_pass);
				System.out.println("");	
				//	String ue=update.update_email();
				//	String up=update.update_pass();
						
				//	if((ue != UE) && (up != UP)) {
						System.out.println("update profile");
						System.out.println("");
							System.out.println("Enter new name");
							String N_name=sc3.next();
							System.out.println("Enter new address");
							String N_add=sc3.next();
							System.out.println("Enter new phone");
							long N_contact=sc3.nextLong();
							System.out.println("Enter new email");
							String N_email=sc3.next();
							System.out.println("Enter new password");
							String N_pass=sc3.next();
								System.out.println("");
									String NN=update.setName(N_name);
									String NA=update.setAddress(N_add);
									long NC=update.setPhone(N_contact);
									String NE=update.setEmail_id(N_email);
									String NP=update.setPassword(N_pass);
												
						 try {
							   Class.forName("com.mysql.jdbc.Driver");  
							   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naruto","root","Naruto@1010");  
							    //Statement stmt2=con.createStatement();  
							   System.out.println("Connection Established");
							   
							   String sql_update = "update Student2 set NAME=?, ADDRESS=?, PHONE=?, EMAIL=?, PASSWORD=? where EMAIL=? and PASSWORD=?";
							   PreparedStatement ps = con.prepareStatement(sql_update);
							 
							   ps.setString(1, NN);
							   ps.setString(2, NA);
							   ps.setLong(3, NC);
							   ps.setString(4, NE);
							   ps.setString(5, NP);
							   ps.setString(6, UE);
							   ps.setString(7, UP);
							   
							   int i = ps.executeUpdate();
							   if (i > 0) {
								    System.out.println("Data Updated...");
								   } else {
								    System.out.println("Data not Updated...");
								   }
							  } catch (Exception e) {
							   e.printStackTrace();
							  }			
				//	}
				//	else {
				//		System.out.println("invalid email or password");
				//	}
			
			
			break;
			
		case 4:
			flag=true;
			
			System.out.println("");
			System.out.println("Update Profile");
			System.out.println("choose");
			Scanner sc4=new Scanner(System.in);
			System.out.println("Enter email_id");
			String D_email=sc4.next();
			System.out.println("Enter password");
			String D_pass=sc4.next();
			
			deleteProfile delete=new deleteProfile();
			
			String DE=delete.setD_email_id(D_email);
			String DP=delete.setD_password(D_pass);
							
			
			 try {
				   Class.forName("com.mysql.jdbc.Driver");  
				   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/naruto","root","Naruto@1010");  
				    //Statement stmt=con.createStatement();  
				   System.out.println("Connection Established");
				   
				   String sql_delete = "delete from Student2 where EMAIL = ? and PASSWORD = ?";
				   PreparedStatement ps = con.prepareStatement(sql_delete);
				   ps.setString(1, DE);
				   ps.setString(2, DP);
				   int i = ps.executeUpdate();
				   if (i > 0) {
				    System.out.println("Data Deleted...");
				   } else {
				    System.out.println("Data not Deleted...");
				   }
				  } catch (ClassNotFoundException e) {
				   e.printStackTrace();
				  } catch (SQLException se) {
				   se.printStackTrace();
				  }
			 
			break;
			
		case 5:
			flag = true;
			System.out.println("");
			System.out.println("show all profile");
			System.out.println("");
			showAllProfile ShowP=new showAllProfile();
			String DN=ShowP.D_name();
			String DA=ShowP.D_add();
			long DC=ShowP.D_phone();
			String De=ShowP.D_email();
			String Dp=ShowP.D_pass();

			try {
		       //  HashMap hm = new HashMap<>();
		         Class.forName("com.mysql.jdbc.Driver");
		         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/naruto", "root", "Naruto@1010");
		         Statement statement = (Statement) con.createStatement();
		         String sql;
		         sql = "select *from Student2";
		         ResultSet rs = statement.executeQuery(sql);
		         while (rs.next()) {
		         System.out.println(rs.getString("NAME")+" "+rs.getString("ADDRESS")+" "+rs.getLong("PHONE")+" "+rs.getString("EMAIL")+" "+rs.getString("PASSWORD"));
		      }
		     // System.out.println(hm);
			}
			 catch (ClassNotFoundException e) {
							   e.printStackTrace();
							  }
			 catch (SQLException se) {
							   se.printStackTrace();
							  }				
			
			
			
			break;
			
		case 6:
			flag = false;
			System.out.println("Exist");
			break;
		
			default:
				System.out.println("Register please");
		}
		
		}
	
	}


}

