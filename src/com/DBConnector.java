package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConnector {
	private String host;
	private String username;
	private String password;
	private String port;
	private String dbname;
	private String url;

	String DBDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	DBConnector(){
	//	host = "locahost";
		host ="SN-201504190851";
		username ="sa";
		password = "1";
		port = "1433";
		dbname = "master";
	}
	DBConnector(String host, String username, String password, String port, String dbname){
		this.host = host;
		this.username = username;
		this.password = password;
		this.port = port;
		this.dbname = dbname;
	}
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean testConnection() {
		String ConnStr = "jdbc:sqlserver://" + host + ":" + port + ";DatabaseName=" + dbname;
		ResultSet rs = null;

		Connection conn = null;
		System.out.println("测试开始\n测试地址："+ConnStr);
		try {
			Class.forName(DBDriver).newInstance();
			conn = DriverManager.getConnection(ConnStr, username, password);
			if(conn != null){
				JOptionPane.showMessageDialog(null, "数据库连接成功。\n连接地址："+ConnStr,"测试结果",1,null);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "数据库连接失败。\n失败原因："+e.getMessage(),"测试结果",0,null);
			System.out.println(e.getMessage());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "数据库连接失败。\n失败原因："+e.getMessage(),"测试结果",0,null);
			System.out.println(e.getMessage());
		}
		System.out.println("测试结束");
		return false;
	}
	public static void main(String[] args){
		System.out.println("测试开始");
		DBConnector myTest = new DBConnector();
		myTest.testConnection();
		System.out.println("测试结束");
	}

}
