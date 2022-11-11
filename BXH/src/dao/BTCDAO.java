package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.BTC;

public class BTCDAO extends DAO{
	
	public BTCDAO() {
		super();
	}
	
	public boolean checkLogin(BTC btc) {
		boolean result = false;
		String sql = "SELECT name, role FROM tblbtc WHERE username = ? AND password = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, btc.getUsername());
			ps.setString(2, btc.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				btc.setName(rs.getString("name"));
				btc.setRole(rs.getString("role"));
				result = true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
