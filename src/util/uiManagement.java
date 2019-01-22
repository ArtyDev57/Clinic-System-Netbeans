/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
/**
 *
 * @author arty
 */
public class uiManagement {
    
    public void setUI(){
        UIManager.put("OptionPane.messageFont", new Font("Phetsarath OT", Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonFont", new Font("Phetsarath OT", Font.PLAIN, 14));
        UIManager.put("OptionPane.yesButtonText", "ແມ່ນ");
        UIManager.put("OptionPane.noButtonText", "ບໍ່ແມ່ນ");
        UIManager.put("OptionPane.okButtonText", "ຕົກລົງ");
        UIManager.put("OptionPane.cancelButtonText", "ຍົກເລີກ");
    }
}
