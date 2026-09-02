package day11;

class Node {

    Node[] child = new Node[26];

}

public class pro10 {

    Node root = new Node();

    void insert(String word) {

        Node current = root;

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            int position = letter - 'a';

            if (current.child[position] == null) {

                current.child[position] = new Node();
            }

            current = current.child[position];
        }
    }

    public static void main(String[] args) {

        pro10 t = new pro10();

        t.insert("cat");

        System.out.println("cat inserted");
    }
}