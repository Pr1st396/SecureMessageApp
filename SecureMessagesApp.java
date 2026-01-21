package securemessagesapp;

import za.ac.tut.ui.SecureMessageFrame; 

public class SecureMessagesApp {
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new SecureMessageFrame().setVisible(true);
            }
        });
    }
}