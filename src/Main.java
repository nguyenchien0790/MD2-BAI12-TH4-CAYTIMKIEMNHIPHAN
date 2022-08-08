public class Main {
    public static void main(String[] args) {
        BTS<String> tree = new BTS<>();
        tree.insert("Ab");
        tree.insert("Abc");
        tree.insert("Abcd");
        tree.insert("Abcde");
        tree.insert("Abcdef");
        tree.insert("Abcdefg");
        tree.insert("Abcdefgh");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of node is: " +tree.getSize());

    }
}
