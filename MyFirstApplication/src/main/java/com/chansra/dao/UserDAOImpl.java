package com.chansra.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chandra.db.DbUtility;
import com.chansra.bean.Users;

public class UserDAOImpl implements UserDAO {

	Connection con = DbUtility.getConnection();
	PreparedStatement ps = null;
	String msg = null;
	ResultSet rs = null;

	@Override
	public String register(Users user) {
		try {
			ps = con.prepareStatement("INSERT INTO USERS(username,password,type) VALUES(?,?,?)");
			// ps.setInt(1, 1);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassWord());
			ps.setString(3, user.getType());
			int n = ps.executeUpdate();
			if (n != 0) {
				msg = "Successfully user registered....";
			} else {
				msg = "Sorry Notable to Inserted....";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return msg;
	}

	public String login(String userName, String passWord) {
		String type = null;
		try {
			ps = con.prepareStatement("SELECT TYPE FROM USERS WHERE USERNAME=? AND PASSWORD=?");
			ps.setString(1, userName);
			ps.setString(2, passWord);
			rs = ps.executeQuery();
			if (rs.next()) {
				type = rs.getString("type");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	}

	@Override
	public String forgot(String userName, String type) {
		String password = null;
		try {
			ps = con.prepareStatement("SELECT password FROM USERS WHERE USERNAME=? AND TYPE=?");
			ps.setString(1, userName);
			ps.setString(2, type);
			rs = ps.executeQuery();
			if (rs.next()) {
				password = rs.getString("password");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}

}
