package com.company.single_linked;

public class SingleLinkedList<T> {
    /**
     * The head of the list
     */
    private SingleLinkedNode<T> my_head;

    /**
     * The tail of the list
     */
    private SingleLinkedNode<T> my_tail;

    /**
     * The size of the list.
     */
    private long size ;

    /**
     * Create a empty singlary linked list.
     */
    public SingleLinkedList(){
        my_tail = null;
        my_head = null;
        size = 0;
    }

    /**
     * Insert a node at the end of the list.
     * @param data Data to be inserted
     */
    public void insertNode(T data){
        SingleLinkedNode<T> createdNode = new SingleLinkedNode<T>(data);
        if(my_tail == null){
            my_head = createdNode;
            my_tail = createdNode;
        }else{
            my_tail.setNext(createdNode);
            my_tail = createdNode;
        }
        size++;
    }

    /**
     * Insert a node at the end of the list.
     * @param the_node Node to be inserted
     */
    public void insertNode(SingleLinkedNode the_node){
        SingleLinkedNode createdNode = the_node;
        if(my_tail == null){
            my_head = createdNode;
            my_tail = createdNode;
        }else{
            my_tail.setNext(createdNode);
            my_tail = createdNode;
        }
        size++;
    }

    /**
     * Removes the last elment in the list
     * @return Removed Node
     */
    public SingleLinkedNode<T> removeTail(){
        if(my_head == null){
            return null;
        }
        SingleLinkedNode head = my_head;
        while(head.getNext() != my_tail){
            head = head.getNext();
        }
        SingleLinkedNode removed = my_tail;
        head.setNext(null);
        return removed;
    }

    /**
     * Removes the first elment in the list
     * @return Removed Node
     */
    public SingleLinkedNode<T>  removeHead(){
        if(my_head == null){
            return null;
        }
        SingleLinkedNode head = my_head;
        my_head = head.getNext();
        return head;
    }

    /**
     * Reverses the order of the list.
     */
    public void reverse(){
        SingleLinkedNode<T> revHead = null;
        SingleLinkedNode<T>  pointer = my_head;
        my_tail = revHead;
        while(pointer != null){
            SingleLinkedNode temp = pointer.getNext();
            pointer.setNext(revHead);
            revHead = pointer;
            pointer = temp;
        }
        my_head = revHead;
    }

    /**
     *
     * @return Formats list in the form [ n, n+1]
     */
    public String  toString(){
        StringBuilder sb = new StringBuilder();
        SingleLinkedNode pointer = my_head;
        sb.append("[");
        if(pointer != null){
            sb.append(pointer.getData().toString());
            pointer = pointer.getNext();
        }
        while(pointer != null){
            sb.append(", ");
            String data = pointer.getData().toString();
            sb.append(data);
            pointer = pointer.getNext();

        }
        sb.append("]");
        return sb.toString();
    }



}
