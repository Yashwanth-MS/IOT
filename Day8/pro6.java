package day8;

class pro6 {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;
        third.next = first;
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);

        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;
        Node temp = first;

        while (temp.next != first) {
            temp = temp.next;
        }

        temp.next = fourth;

        temp = fourth;

        while (temp.next != fourth) {
            temp = temp.next;
        }
        temp.next = first;
        Node current = first;

        for (int i = 0; i < 6; i++) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("(back to first)");
    }
}
