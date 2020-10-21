package practicing;



class LinkedList {

Node head;

class Node {

String data;

Node next;

Node(String d) {

data = d;

next = null;

}

}

void insertInOrder(String data) {

Node new_node = newNode(data);

Node current;

if (head == null || head.data.compareTo(new_node.data) >= 0) {

new_node.next = head;

head = new_node;

} else {

current = head;

while (current.next != null && current.next.data.compareTo(new_node.data) < 0)

current = current.next;

new_node.next = current.next;

current.next = new_node;

}

}

Node newNode(String data) {

Node x = new Node(data);

return x;

}

void printList() {

Node temp = head;

while (temp != null) {

System.out.print(temp.data + " ");

temp = temp.next;

}

}

}
