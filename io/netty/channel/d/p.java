/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import java.nio.channels.SelectionKey;
import java.util.AbstractSet;
import java.util.Iterator;

final class p
extends AbstractSet {
    private SelectionKey[] a = new SelectionKey[1024];
    private int b;
    private SelectionKey[] c = (SelectionKey[])this.a.clone();
    private int d;
    private boolean e = true;

    p() {
    }

    public boolean a(SelectionKey selectionKey) {
        if (selectionKey == null) {
            return false;
        }
        if (this.e) {
            int n2 = this.b;
            this.a[n2++] = selectionKey;
            this.b = n2;
            if (n2 == this.a.length) {
                this.b();
            }
        } else {
            int n3 = this.d;
            this.c[n3++] = selectionKey;
            this.d = n3;
            if (n3 == this.c.length) {
                this.c();
            }
        }
        return true;
    }

    private void b() {
        SelectionKey[] arrselectionKey = new SelectionKey[this.a.length << 1];
        System.arraycopy(this.a, 0, arrselectionKey, 0, this.b);
        this.a = arrselectionKey;
    }

    private void c() {
        SelectionKey[] arrselectionKey = new SelectionKey[this.c.length << 1];
        System.arraycopy(this.c, 0, arrselectionKey, 0, this.d);
        this.c = arrselectionKey;
    }

    SelectionKey[] a() {
        if (this.e) {
            this.e = false;
            this.a[this.b] = null;
            this.d = 0;
            return this.a;
        }
        this.e = true;
        this.c[this.d] = null;
        this.b = 0;
        return this.c;
    }

    @Override
    public int size() {
        if (this.e) {
            return this.b;
        }
        return this.d;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public /* synthetic */ boolean add(Object object) {
        return this.a((SelectionKey)object);
    }
}

