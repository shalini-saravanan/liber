package panel;

import java.awt.Color;


import java.awt.Label;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;

import main.LiberManagementSystem;

import java.awt.event.ActionEvent;
public class ReturnBookPanel implements PanelService{

	private Panel panel;
	private Label label;
	private Button button;
	private TextField textField;
	public ReturnBookPanel(LiberManagementSystem liberManagementSystem) {
		//StudentRepository obj=new StudentRepository();
		panel = new Panel(); 
		panel.setBackground(Color.decode("#E26868"));
		panel.setBounds(20, 20, 960, 940);
		panel.setLayout(null);

		if(liberManagementSystem.getFlag()) {
			label = new Label("Enter your Roll.no:");
			label.setBounds(20, 80, 100, 20);
		
			textField=new TextField();
			textField.setBounds(200,80,200,20);
		
			button=new Button("Enter");
			button.setBounds(50,120,60,20);
			button.addActionListener(new ActionListener() {    
			    public void actionPerformed (ActionEvent e) {  
			    	
			    	panel.add(new FinePanel(textField.getText()).getPanel());
			    	
	    	    }    
	    	});  
	
			panel.add(label);
			panel.add(textField);
			panel.add(button);
		}
		else {
			Label label = new Label("Please Log in to access the features!");
			label.setBounds(20, 50, 300, 50);
			panel.add(label);
		}
		
	}

	@Override
	public Panel getPanel() {
		return this.panel;
	}

}
