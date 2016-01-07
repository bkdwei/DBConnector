package com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class testEL implements ActionListener {
	DBConnector myTest = null;
	UI ui = null;

	public testEL() {
		System.out.println("请先配置连接参数再进行测试！");
		this.myTest = new DBConnector();
	}
	public testEL(UI ui){
		
		this.ui = ui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.myTest = new DBConnector(ui.tHost.getText(), ui.tUsername.getText(),ui. tPassword.getText(), ui.tPort.getText(), ui.tDbname.getText());
		myTest.testConnection();
	}

}
