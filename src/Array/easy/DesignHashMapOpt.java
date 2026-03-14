class ListNode {
    int key, val;
    ListNode next;

    public ListNode(int key, int val, ListNode next) {
        this.key = key;
        this.val = val;
        this.next = next;
    }

    public ListNode() {
        this.key = -1;
        this.val = -1;
        this.next = null;
    }
}

class MyHashMap {

    ListNode[] map;
    int size = 1000;

    public MyHashMap() {
        map = new ListNode[size];

        for (int i = 0; i < size; i++) {
            map[i] = new ListNode(); // dummy head
        }
    }

    public int hash(int key) {
        return key % size;
    }

    public void put(int key, int value) {
        ListNode curr = map[hash(key)];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next.val = value;
                return;
            }
            curr = curr.next;
        }

        curr.next = new ListNode(key, value, null);
    }

    public int get(int key) {
        ListNode curr = map[hash(key)];

        while (curr.next != null) {
            if (curr.next.key == key) {
                return curr.next.val;
            }
            curr = curr.next;
        }

        return -1;
    }

    public void remove(int key) {
        ListNode curr = map[hash(key)];

        while (curr.next != null) {
            if (curr.next.key == key) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }
    }
}