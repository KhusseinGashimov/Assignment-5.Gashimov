public class Main {

    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(13, "Value 13");
        bst.put(11, "Value 11");
        bst.put(24, "Value 24");
        bst.put(111, "Value 111");
        bst.put(45, "Value 45");
        bst.put(789, "Value 789");
        bst.put(43, "Value 43");
        bst.put(675, "Value 675");
        bst.put(1123, "Value 1123");

        System.out.println("Key 111: " + bst.get(111));

        bst.delete(789);

        System.out.println("Size: " + bst.size());

        System.out.println("Keys in ascending order:");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }

    }
}