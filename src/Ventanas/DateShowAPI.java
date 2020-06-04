/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class DateShowAPI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("the title");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
         
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        JLabel l = new JLabel(date);
         
        frame.getContentPane().add(l);
         
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
 
    }
}