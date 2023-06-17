/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.br;
import com.a.a.c.bs;
import com.a.a.c.cr;
import com.a.a.c.cs;
import java.util.AbstractQueue;
import java.util.Iterator;

final class cq
extends AbstractQueue {
    final bs a = new cr(this);

    cq() {
    }

    public boolean a(bs bs2) {
        ao.c(bs2.j(), bs2.i());
        ao.c(this.a.j(), bs2);
        ao.c(bs2, this.a);
        return true;
    }

    public bs a() {
        bs bs2 = this.a.i();
        return bs2 == this.a ? null : bs2;
    }

    public bs b() {
        bs bs2 = this.a.i();
        if (bs2 == this.a) {
            return null;
        }
        this.remove(bs2);
        return bs2;
    }

    @Override
    public boolean remove(Object object) {
        bs bs2 = (bs)object;
        bs bs3 = bs2.j();
        bs bs4 = bs2.i();
        ao.c(bs3, bs4);
        ao.c(bs2);
        return bs4 != br.a;
    }

    @Override
    public boolean contains(Object object) {
        bs bs2 = (bs)object;
        return bs2.i() != br.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.i() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (bs bs2 = this.a.i(); bs2 != this.a; bs2 = bs2.i()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        bs bs2 = this.a.i();
        while (bs2 != this.a) {
            bs bs3 = bs2.i();
            ao.c(bs2);
            bs2 = bs3;
        }
        this.a.c(this.a);
        this.a.d(this.a);
    }

    @Override
    public Iterator iterator() {
        return new cs(this, this.a());
    }

    @Override
    public /* synthetic */ Object peek() {
        return this.a();
    }

    @Override
    public /* synthetic */ Object poll() {
        return this.b();
    }

    @Override
    public /* synthetic */ boolean offer(Object object) {
        return this.a((bs)object);
    }
}

