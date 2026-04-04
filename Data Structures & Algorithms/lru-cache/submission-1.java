class LRUCache {

    class Node{
        int key,value;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }
    
        int capacity = 0;
        HashMap<Integer,Node> lookup;
        Node head,tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        lookup = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!lookup.containsKey(key)) return -1;
        Node node = lookup.get(key);
        remove(node);
        insert(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(lookup.containsKey(key)){
            remove(lookup.get(key));
            lookup.remove(key);
        }

        if(lookup.size() == capacity){
            Node lru = tail.prev;
            remove(lru);
            lookup.remove(lru.key);
        }
        Node newNode = new Node(key,value);
        insert(newNode);
        lookup.put(key,newNode);
    }

    private void remove(Node node){
        node.prev.next  = node.next;
        node.next.prev = node.prev;

    }

    private void insert(Node node){
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }
}
