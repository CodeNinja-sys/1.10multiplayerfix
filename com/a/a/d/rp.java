/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rq;
import com.a.a.d.rr;
import com.a.a.d.ry;
import com.a.a.d.rz;
import java.util.AbstractQueue;
import java.util.Iterator;

final class rp
extends AbstractQueue {
    final rz a = new rq(this);

    rp() {
    }

    public boolean a(rz rz2) {
        qy.c(rz2.i(), rz2.h());
        qy.c(this.a.i(), rz2);
        qy.c(rz2, this.a);
        return true;
    }

    public rz a() {
        rz rz2 = this.a.h();
        return rz2 == this.a ? null : rz2;
    }

    public rz b() {
        rz rz2 = this.a.h();
        if (rz2 == this.a) {
            return null;
        }
        this.remove(rz2);
        return rz2;
    }

    @Override
    public boolean remove(Object object) {
        rz rz2 = (rz)object;
        rz rz3 = rz2.i();
        rz rz4 = rz2.h();
        qy.c(rz3, rz4);
        qy.f(rz2);
        return rz4 != ry.a;
    }

    @Override
    public boolean contains(Object object) {
        rz rz2 = (rz)object;
        return rz2.h() != ry.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.h() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (rz rz2 = this.a.h(); rz2 != this.a; rz2 = rz2.h()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        rz rz2 = this.a.h();
        while (rz2 != this.a) {
            rz rz3 = rz2.h();
            qy.f(rz2);
            rz2 = rz3;
        }
        this.a.c(this.a);
        this.a.d(this.a);
    }

    @Override
    public Iterator iterator() {
        return new rr(this, this.a());
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
        return this.a((rz)object);
    }
}

