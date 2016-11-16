package pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Item implements Itemable{
	int intelligence;
	int agility;
	int strength;
	String Name = "";
	int[] Characteristics = { intelligence, agility, strength };
	int item_id;

	public  void setCharacteristics(int item_id)throws Exception{
		this.item_id=item_id;
		Class.forName("org.sqlite.JDBC");
		Connection bd;
		bd=DriverManager.getConnection("jdbc:sqlite:D:/��� ��� java/itea �����/db/ItemBase.db");
		Statement st = bd.createStatement();
		String query="SELECT * FROM itembase WHERE item_id='"+item_id+"'";
		ResultSet rs=st.executeQuery(query);
		rs.next();
		Characteristics[0]=rs.getInt(3);
		Characteristics[1]=rs.getInt(4);
		Characteristics[2]=rs.getInt(5);
		Name=rs.getString(2);
		rs.close();
		st.close();
		bd.close();
		
	}

	public int[] getCharacteristics() {
		return Characteristics;
	}

	public String getName() {
		return Name;
	}

}
