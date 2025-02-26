package application2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// ===================================== Data base ချိတ်တိုင်း ဒီလိုဘဲရေးချိတ် ========================================

public class DBConnection {
	public static Connection connect() throws SQLException // object ဆောက်မှာမဟုက်ဘူး။ ဒါကြောင့် static ထည့်
	{
		Connection con = null; // connection လေးတစ်ခုလုပ်မယ်။
		String db_name = "lms"; // ဒါက database နာမည်
		String username = "root"; // ဒါက database username
		String password = "1234"; // ဒါက database password
		
		try {
			Class.forName("com.mysql.jdbc.Driver"); //ဒါက mysQl driver လုပ် try catch ထဲထည့်
			// ဒါရေးရင် excetption တပ်မယ် throw declaration လုပ်။ ဒါကကိုယ်ဖွင့်မယ့် server အတွက် username and password
			// အောင်မြင်သွားရင် ဒီ connectionကို ပြန်မယ်
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db_name,username,password); 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con; // return connection
	}
}
















