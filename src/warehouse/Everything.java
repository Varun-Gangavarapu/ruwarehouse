package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile("everything.in");
        StdOut.setFile("Everything.out");

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
            else if (s.split(" ")[0].equals("restock"))
                test.restockProduct(Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[2]));
            else if (s.split(" ")[0].equals("purchase"))
                test.purchaseProduct(Integer.parseInt(s.split(" ")[2]), Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[3]));
            else if (s.split(" ")[0].equals("delete"))
                test.deleteProduct(Integer.parseInt(s.split(" ")[1]));

            
        }

        StdOut.print(test);

	// Use this file to test all methods
    }
}
