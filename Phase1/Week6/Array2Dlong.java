import javax.swing.table.DefaultTableModel;

public class Array2Dlong {
    public static void main(String[] args) {
        // Create a DefaultTableModel with one column
        DefaultTableModel model = new DefaultTableModel(new String[]{"Numbers"}, 0);
        
        // Add numbers from 1 to 20 to the model
        for (int i = 1; i <= 20; i++) {
            model.addRow(new Object[]{i});
        }
        
        // Print all elements in the model
        for (int i = 0; i< model.getRowCount(); i++) {
            System.out.println(model.getValueAt(i, 0));
        }

    }
}