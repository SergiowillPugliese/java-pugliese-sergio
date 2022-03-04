package com.engim.lezione7.listeeclassiastratte;

public abstract class List {

    public abstract int get(int index);
    public abstract List add(int index, int value);
    public abstract List remove(int n);
    public abstract int length();
    public abstract List indexRemove(int i);

}
