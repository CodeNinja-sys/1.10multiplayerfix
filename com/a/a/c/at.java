/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ao;
import com.a.a.c.au;
import com.a.a.c.av;
import com.a.a.c.br;
import com.a.a.c.bs;
import java.util.AbstractQueue;
import java.util.Iterator;

final class at
extends AbstractQueue {
    final bs a = new au(this);

    at() {
    }

    public boolean a(bs bs2) {
        ao.b(bs2.g(), bs2.f());
        ao.b(this.a.g(), bs2);
        ao.b(bs2, this.a);
        return true;
    }

    public bs a() {
        bs bs2 = this.a.f();
        return bs2 == this.a ? null : bs2;
    }

    public bs b() {
        bs bs2 = this.a.f();
        if (bs2 == this.a) {
            return null;
        }
        this.remove(bs2);
        return bs2;
    }

    @Override
    public boolean remove(Object object) {
        bs bs2 = (bs)object;
        bs bs3 = bs2.g();
        bs bs4 = bs2.f();
        ao.b(bs3, bs4);
        ao.b(bs2);
        return bs4 != br.a;
    }

    @Override
    public boolean contains(Object object) {
        bs bs2 = (bs)object;
        return bs2.f() != br.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.f() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (bs bs2 = this.a.f(); bs2 != this.a; bs2 = bs2.f()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        bs bs2 = this.a.f();
        while (bs2 != this.a) {
            bs bs3 = bs2.f();
            ao.b(bs2);
            bs2 = bs3;
        }
        this.a.a(this.a);
        this.a.b(this.a);
    }

    @Override
    public Iterator iterator() {
        return new av(this, this.a());
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

