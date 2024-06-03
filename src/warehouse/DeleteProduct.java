package warehouse;

/*
 * Use this class to test the deleteProduct method.
 */ 
public class DeleteProduct {
    public static void main(String[] args) {
        StdIn.setFile("deleteproduct.in");
        StdOut.setFile("deleteproduct.out");

        int n = StdIn.readInt();
        StdIn.readLine();
        String s = "";
        Warehouse test = new Warehouse();
        for (int i = 0; i < n; i++) {
            s = StdIn.readLine();
            if (s.split(" ")[0].equals("add")) {
                test.addProduct(Integer.parseInt(s.split(" ")[2]) , s.split(" ")[3], Integer.parseInt(s.split(" ")[4]), Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[5]));
                continue;
            }
                test.deleteProduct(Integer.parseInt(s.split(" ")[1]));
        }

        StdOut.print(test);

	// Use this file to test deleteProduct
    }
}
