package warehouse;

/*
 * Use this class to test to addProduct method.
 */
public class AddProduct {
    public static void main(String[] args) {
        StdIn.setFile("addproduct.in");
        StdOut.setFile("addProduct.out");

	// Use this file to test addProduct
        int n = StdIn.readInt();
        StdIn.readLine();
        String s = "";
        Warehouse test = new Warehouse();
        for (int i = 0; i < n; i++) {
            s = StdIn.readLine();
            test.addProduct(Integer.parseInt(s.split(" ")[1]) , s.split(" ")[2], Integer.parseInt(s.split(" ")[3]), Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[4]));
        }
        StdOut.println(test);

        
    }
}
