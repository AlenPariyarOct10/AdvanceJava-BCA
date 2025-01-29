/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package advancejava;
import javax.swing.*;
/**
 *
 * @author oct10
 */
public class CalculatorEx {
    
    public static void main(String [] args)
    {
       JFrame jf = new JFrame("Test Project");
       JLabel lbl = new JLabel("Alen Pariyar");
       
       jf.setVisible(true);
       jf.add(lbl);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setSize(300,300);
       jf.setLayout(null);
       
       lbl.setBounds(130,150, 100,100);
    }
    
}
