/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ado;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

final class ade
extends ado
implements Deque {
    private static final long a = 0L;

    ade(Deque deque, Object object) {
        super(deque, object);
    }

    Deque a() {
        return (Deque)super.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addFirst(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            this.a().addFirst(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void addLast(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            this.a().addLast(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean offerFirst(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().offerFirst(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean offerLast(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().offerLast(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object removeFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().removeFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object removeLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().removeLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object pollFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object pollLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pollLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object getFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object getLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().getLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object peekFirst() {
        Object object = this.h;
        synchronized (object) {
            return this.a().peekFirst();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object peekLast() {
        Object object = this.h;
        synchronized (object) {
            return this.a().peekLast();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeFirstOccurrence(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().removeFirstOccurrence(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean removeLastOccurrence(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            return this.a().removeLastOccurrence(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void push(Object object) {
        Object object2 = this.h;
        synchronized (object2) {
            this.a().push(object);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Object pop() {
        Object object = this.h;
        synchronized (object) {
            return this.a().pop();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Iterator descendingIterator() {
        Object object = this.h;
        synchronized (object) {
            return this.a().descendingIterator();
        }
    }

    @Override
    /* synthetic */ Queue c() {
        return this.a();
    }

    @Override
    /* synthetic */ Collection b() {
        return this.a();
    }

    @Override
    /* synthetic */ Object e() {
        return this.a();
    }
}

