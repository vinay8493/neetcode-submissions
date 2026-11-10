class LRUCache {
    static class Node{
        int val;
        int key;
        Node next;
        Node prev;

        Node(int key, int val){
            this.val = val;
            this.key = key;
        }
    }
    Map<Integer, Node> map;
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
       this.capacity = capacity;
       map = new HashMap<>();
       tail = new Node(-1,-1);
       head = new Node(-1,-1);
       head.next = tail;
       tail.prev = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node != null){
            node = removeNode(node);
            addFront(node);
            return node.val;
        }
        return -1;  
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node = removeNode(node);
            node.val = value;
            addFront(node);
        }else{
            Node node = new Node(key,value);
            if(map.size() < capacity){
                addFront(node);
            }else{
                map.remove(removeTail().key);
                addFront(node);
                
            }
            map.put(key, node);
        }
      
    }

    private void addFront(Node node){
        Node headNext = head.next;
        head.next = node;
        node.next = headNext;
        headNext.prev = node;
        node.prev = head;
    }

    private Node removeTail(){
        Node removedNode = tail.prev;
        Node newTail = tail.prev.prev;
        tail.prev = newTail;
        newTail.next = tail;
        return removedNode;
    }

    private Node removeNode(Node node){
        Node nodeNext = node.next;
        Node nodePrev = node.prev;
        nodePrev.next = nodeNext;
        nodeNext.prev = nodePrev;
        return node;
    }

}
