package com.company.single_linked;

public class SingleLinkedNode<T> {

    /**
     * Data to be stored in the node.
     */
    private T my_data;

    /**
     * Next node.
     */
    private SingleLinkedNode my_next;

    /**
     *
     * @param the_data Data to be stored by Node.
     */
    public SingleLinkedNode( T the_data) {
        this(the_data, null);
    }


    /**
     *
     * @param the_data Data to be stored by Node.
     * @param the_next The next node in the list.
     */
    public SingleLinkedNode(T the_data, SingleLinkedNode the_next){
        my_data = the_data;
        my_next = the_next;
    }

    /**
     *
     * @return The data stored in this node.
     */
    public  T getData() {
        return my_data;
    }

    /**
     *
     * @param the_node The node to set as next.
     */
    public void setNext(SingleLinkedNode the_node){
        my_next = the_node;
    }

    /**
     *
     * @return The next node
     */
    public SingleLinkedNode getNext()
    {
        return my_next;
    }
}
