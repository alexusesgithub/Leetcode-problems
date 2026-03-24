class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head, tail;
    int cnt;

    public MyLinkedList() {
        head = null;
        tail = null;
        cnt = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= cnt) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        Node nn = new Node(val);

        if (head == null) {
            head = tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }

        cnt++;
    }

    public void addAtTail(int val) {
        Node nn = new Node(val);

        if (head == null) {
            head = tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }

        cnt++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > cnt) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == cnt) {
            addAtTail(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node nn = new Node(val);
        nn.next = temp.next;
        temp.next = nn;

        cnt++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= cnt) return;

        if (index == 0) {
            head = head.next;

            if (cnt == 1) {
                tail = null;
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next;
        }

        cnt--;
    }
}