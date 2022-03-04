package com.engim.lezione7.listeeclassiastratte;

public class Node extends List {
    private List next;
    private int value;

    public Node(List next, int value) {
        this.next = next;
        this.value = value;
    }

    public List getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }



    @Override
    public int get(int index) {
        if(index == 0)
            return this.value;
        else
            return this.next.get(index-1);
    }

    @Override
    public String toString() {
        return "" + value +
                ' '+ this.next.toString();
    }

    @Override
    public List add(int index, int value) {
        if (index == 0){
            this.next = new Node(this.next, this.value);
            this.value = value;
        }
        else {
            this.next = this.next.add(index-1,value);
        }
        return this;
    }

    @Override
    public int length() {
        return 1 + this.next.length();
    }

    @Override
    public List indexRemove(int i) {
        if (i == 0){
            return this.next;
        } else {
            this.next = this.next.indexRemove(i-1);
            return this;
        }
    }

    @Override
    public List remove(int n) {
        next = next.remove(n);
        if (this.value == n){
            return this.next;
            } else {
            return this;
        }




    }
}