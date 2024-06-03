package warehouse;

/*
 * Use this class to test the betterAddProduct method.
 */ 
public class BetterAddProduct {
    public static void main(String[] args) {
        StdIn.setFile("betteraddproduct.in");
        StdOut.setFile("betterAddProduct.out");

	// Use this file to test addProduct
        int n = StdIn.readInt();
        StdIn.readLine();
        String s = "";
        Warehouse test = new Warehouse();
        for (int i = 0; i < n; i++) {
            s = StdIn.readLine();
            test.betterAddProduct(Integer.parseInt(s.split(" ")[1]) , s.split(" ")[2], Integer.parseInt(s.split(" ")[3]), Integer.parseInt(s.split(" ")[0]), Integer.parseInt(s.split(" ")[4]));
        }
        StdOut.println(test);
        
        // Use this file to test betterAddProduct
    }
}
