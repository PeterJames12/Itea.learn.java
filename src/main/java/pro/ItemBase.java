package pro;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ItemBase {
	public static void main(String[] args) throws Exception {
	Class.forName("org.sqlite.JDBC");
	Connection bd;
	bd=DriverManager.getConnection("jdbc:sqlite:D:/��� ��� java/itea �����/db/ItemBase.db");
	Statement st = bd.createStatement();
	//st.execute("CREATE TABLE itembase(item_id INT ,item_name VARCHAR(255),intelligence INT,agility INT,strength INT)");
	//st.execute("INSERT INTO itembase(item_id,item_name,intelligence,agility,strength) VALUES(1,'BootsOfPower',10,7,4),(2,'BootsOfSpeed',12,8,3)");
	
	ResultSet rs= st.executeQuery("SELECT * FROM itembase");
	//System.out.println(rs.getRow());
	while(rs.next()){
		//System.out.println(rs.getRow());
		System.out.print(rs.getInt(1)+"---");
		System.out.println(rs.getString(2)+"---"+rs.getInt(3)+"---"+rs.getInt(4)+"---"+rs.getInt(5));
		
	}
	
	

}}
