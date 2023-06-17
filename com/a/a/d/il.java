/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.hy;
import com.a.a.d.ia;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class il
implements Iterator {
    int b = 0;
    ia c = null;
    ia d = null;
    int e = hy.a(this.f);
    final /* synthetic */ hy f;

    il(hy hy2) {
        this.f = hy2;
    }

    private void a() {
        if (hy.a(this.f) != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public boolean hasNext() {
        this.a();
        if (this.c != null) {
            return true;
        }
        while (this.b < hy.b(this.f).length) {
            if (hy.b(this.f)[this.b] != null) {
                this.c = hy.b(this.f)[this.b++];
                return true;
            }
            ++this.b;
        }
        return false;
    }

    public Object next() {
        this.a();
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        ia ia2 = this.c;
        this.c = ia2.c;
        this.d = ia2;
        return this.b(ia2);
    }

    @Override
    public void remove() {
        this.a();
        cl.a(this.d != null);
        hy.a(this.f, this.d);
        this.e = hy.a(this.f);
        this.d = null;
    }

    abstract Object b(ia var1);
}

