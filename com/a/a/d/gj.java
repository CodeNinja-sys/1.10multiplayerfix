/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.hh;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

public abstract class gj
extends hh
implements Deque {
    protected gj() {
    }

    protected abstract Deque d();

    public void addFirst(Object object) {
        this.d().addFirst(object);
    }

    public void addLast(Object object) {
        this.d().addLast(object);
    }

    public Iterator descendingIterator() {
        return this.d().descendingIterator();
    }

    public Object getFirst() {
        return this.d().getFirst();
    }

    public Object getLast() {
        return this.d().getLast();
    }

    public boolean offerFirst(Object object) {
        return this.d().offerFirst(object);
    }

    public boolean offerLast(Object object) {
        return this.d().offerLast(object);
    }

    public Object peekFirst() {
        return this.d().peekFirst();
    }

    public Object peekLast() {
        return this.d().peekLast();
    }

    public Object pollFirst() {
        return this.d().pollFirst();
    }

    public Object pollLast() {
        return this.d().pollLast();
    }

    public Object pop() {
        return this.d().pop();
    }

    public void push(Object object) {
        this.d().push(object);
    }

    public Object removeFirst() {
        return this.d().removeFirst();
    }

    public Object removeLast() {
        return this.d().removeLast();
    }

    @Override
    public boolean removeFirstOccurrence(Object object) {
        return this.d().removeFirstOccurrence(object);
    }

    @Override
    public boolean removeLastOccurrence(Object object) {
        return this.d().removeLastOccurrence(object);
    }

    @Override
    protected /* synthetic */ Queue c() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Collection b() {
        return this.d();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.d();
    }
}

