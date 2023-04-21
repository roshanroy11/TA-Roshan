package ist242;

import javax.swing.*;
import java.awt.event.*;

public class ProductView extends JFrame {
    final private JTextField productid;
    final private JTextField productName;
    final private JTextField productType;
    final private JButton getProductButton;
    final private ProductModel model;

    // constructor for the GUI
    ProductView(ProductModel model){
        this.model = model;
        this.productid = new JTextField(20);
        this.productName = new JTextField(20);
        this.productType = new JTextField(20);
        this.getProductButton = new JButton("Get Product");
        JPanel content = new JPanel();
        content.add(productid);
        content.add(productName);
        content.add(getProductButton);

        this.setContentPane(content);
        this.pack();
        this.setTitle("Used Store Front");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void addProductButtonListener (ActionListener al){
        getProductButton.addActionListener(al);
    }

    public void setCurrentProduct(Product newProduct){
        productName.setText(newProduct.getProductName());
    }
    public int getProductAction(){
        return Integer.parseInt(productid.getText());
    }

}
