/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.qy;
import com.a.a.d.rt;
import com.a.a.d.ru;
import com.a.a.d.ry;
import com.a.a.d.rz;
import java.util.AbstractQueue;
import java.util.Iterator;

final class rs
extends AbstractQueue {
    final rz a = new rt(this);

    rs() {
    }

    public boolean a(rz rz2) {
        qy.b(rz2.g(), rz2.f());
        qy.b(this.a.g(), rz2);
        qy.b(rz2, this.a);
        return true;
    }

    public rz a() {
        rz rz2 = this.a.f();
        return rz2 == this.a ? null : rz2;
    }

    public rz b() {
        rz rz2 = this.a.f();
        if (rz2 == this.a) {
            return null;
        }
        this.remove(rz2);
        return rz2;
    }

    @Override
    public boolean remove(Object object) {
        rz rz2 = (rz)object;
        rz rz3 = rz2.g();
        rz rz4 = rz2.f();
        qy.b(rz3, rz4);
        qy.e(rz2);
        return rz4 != ry.a;
    }

    @Override
    public boolean contains(Object object) {
        rz rz2 = (rz)object;
        return rz2.f() != ry.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.f() == this.a;
    }

    @Override
    public int size() {
        int n2 = 0;
        for (rz rz2 = this.a.f(); rz2 != this.a; rz2 = rz2.f()) {
            ++n2;
        }
        return n2;
    }

    @Override
    public void clear() {
        rz rz2 = this.a.f();
        while (rz2 != this.a) {
            rz rz3 = rz2.f();
            qy.e(rz2);
            rz2 = rz3;
        }
        this.a.a(this.a);
        this.a.b(this.a);
    }

    @Override
    public Iterator iterator() {
        return new ru(this, this.a());
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

