//wap to find the input in the array
import javax.swing.JOptionPane;
public class FindingArrayElement {
    public static void main(String[] args){
        int[] a={4,6,8,12,4,23,423,2352,323,22,31};
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to find"));
        for(int i=0; i<11; i++){
            if( num == a[i]){
                JOptionPane.showMessageDialog(null, "Entered number "+num+" is in the array in the  "+ (i+1)+"th position.");
                break;
            }
        }
    }
}