package com;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {
	JFrame frame = new JFrame("数据库连接测试工具v1.0 By bkd");
	JPanel pMain = new JPanel();
	JLabel lHost = new JLabel("服务器地址：");
	JLabel lPort = new JLabel("端口号：");
	JLabel lUsername = new JLabel("用户名：");
	JLabel lPassword = new JLabel("密码：");
	JLabel lDbname = new JLabel("数据库：");

	JTextField tHost = new JTextField("127.0.0.1");
	JTextField tUsername = new JTextField("sa");
	JTextField tPassword = new JTextField("");
	JTextField tPort = new JTextField("1433");
	JTextField tDbname = new JTextField("master");
	JTextField tUrl = new JTextField();

	JLabel lNull = new JLabel("邮箱：bkdwei@bkdwei.com");

	JButton runTest = new JButton("测试");

	public void composit() {

		frame.setSize(500, 400);
		frame.setLocation(600, 200);
		frame.add(pMain);
		pMain.setLayout(new GridLayout(6, 2));
		pMain.add(lHost);
		pMain.add(tHost);
		pMain.add(lPort);
		pMain.add(tPort);
		pMain.add(lUsername);
		pMain.add(tUsername);
		pMain.add(lPassword);
		pMain.add(tPassword);
		pMain.add(lDbname);
		pMain.add(tDbname);
		pMain.add(lNull);
		pMain.add(runTest);

		runTest.addActionListener(new testEL(this));
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("版本：v1.0，作者邮箱：bkdwei@bkdwei.com");
		UI ui = new UI();
		ui.composit();
	}

}
