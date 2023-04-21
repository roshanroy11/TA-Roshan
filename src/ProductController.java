package ist242;
import java.awt.event.*;

public class ProductController {
    private ProductModel model;
    private ProductView view;

    ProductController(ProductModel model, ProductView view) {
        this.model = model;
        this.view = view;
        // override of the Button Listener
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent ev) {
                view.setCurrentProduct(model.getProduct(view.getProductAction()));
            }
        }
        view.addProductButtonListener(new ButtonListener());
    }
}
