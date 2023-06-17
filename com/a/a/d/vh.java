/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.vc;
import com.a.a.d.vd;
import com.a.a.d.vg;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

class vh
implements Iterator {
    private int b = -1;
    private int c = vc.c(this.a);
    private Queue d;
    private List e;
    private Object f;
    private boolean g;
    final /* synthetic */ vc a;

    private vh(vc vc2) {
        this.a = vc2;
    }

    @Override
    public boolean hasNext() {
        this.a();
        return this.a(this.b + 1) < this.a.size() || this.d != null && !this.d.isEmpty();
    }

    public Object next() {
        this.a();
        int n2 = this.a(this.b + 1);
        if (n2 < this.a.size()) {
            this.b = n2;
            this.g = true;
            return this.a.c(this.b);
        }
        if (this.d != null) {
            this.b = this.a.size();
            this.f = this.d.poll();
            if (this.f != null) {
                this.g = true;
                return this.f;
            }
        }
        throw new NoSuchElementException("iterator moved past last element in queue.");
    }

    @Override
    public void remove() {
        cl.a(this.g);
        this.a();
        this.g = false;
        ++this.c;
        if (this.b < this.a.size()) {
            vg vg2 = this.a.d(this.b);
            if (vg2 != null) {
                if (this.d == null) {
                    this.d = new ArrayDeque();
                    this.e = new ArrayList(3);
                }
                this.d.add(vg2.a);
                this.e.add(vg2.b);
            }
            --this.b;
        } else {
            com.a.a.b.cl.b(this.a(this.f));
            this.f = null;
        }
    }

    private boolean a(Iterable iterable, Object object) {
        for (Object t2 : iterable) {
            if (t2 != object) continue;
            return true;
        }
        return false;
    }

    boolean a(Object object) {
        for (int i2 = 0; i2 < vc.b(this.a); ++i2) {
            if (vc.a(this.a)[i2] != object) continue;
            this.a.d(i2);
            return true;
        }
        return false;
    }

    void a() {
        if (vc.c(this.a) != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    private int a(int n2) {
        if (this.e != null) {
            while (n2 < this.a.size() && this.a(this.e, this.a.c(n2))) {
                ++n2;
            }
        }
        return n2;
    }

    /* synthetic */ vh(vc vc2, vd vd2) {
        this(vc2);
    }
}

