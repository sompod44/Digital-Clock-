/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitallClock;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Sompod_Programmer
 */
public class WorkingClass extends JFrame {
    
    public WorkingClass(){
        Container containpane = getContentPane();
        containpane.add(new LoadPanel());
        setTitle("\"Digital clock\" Devoloped by sompod. ");
        setBounds(300, 100, 405, 200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new WorkingClass();
    }
}
