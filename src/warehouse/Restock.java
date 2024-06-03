package warehouse;

public class Restock {
    public static void main(String[] args) {
        StdIn.setFile("restock.in");
        StdOut.setFile("Restock.out");

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
                test.restockProduct(Integer.parseInt(s.split(" ")[1]), Integer.parseInt(s.split(" ")[2]));
        }

        StdOut.print(test);
	// Uset his file to test restock
    }
}
