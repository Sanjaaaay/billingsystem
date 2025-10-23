import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BillingSystem extends JFrame implements ActionListener {

    JCheckBox cbLaptop, cbPhone, cbTablet;
    JButton btnBill;
    JLabel lblResult;

    public BillingSystem() {
        setTitle("Billing System");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        cbLaptop = new JCheckBox("Laptop - ₹60000");
        cbPhone = new JCheckBox("Phone - ₹30000");
        cbTablet = new JCheckBox("Tablet - ₹20000");

        btnBill = new JButton("Generate Bill");
        lblResult = new JLabel("");

        add(cbLaptop);
        add(cbPhone);
        add(cbTablet);
        add(btnBill);
        add(lblResult);

        btnBill.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        String msg = "Selected Items:\n";

        if (cbLaptop.isSelected()) {
            total += 60000;
            msg += "Laptop\n";
        }
        if (cbPhone.isSelected()) {
            total += 30000;
            msg += "Phone\n";
        }
        if (cbTablet.isSelected()) {
            total += 20000;
            msg += "Tablet\n";
        }

        msg += "---------------------\nTotal: ₹" + total;
        JOptionPane.showMessageDialog(this, msg);
    }

    public static void main(String[] args) {
        new BillingSystem();
    }
}
