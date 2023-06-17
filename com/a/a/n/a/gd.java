/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.dx;
import com.a.a.n.a.gc;
import com.a.a.n.a.ge;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicReferenceArray;

class gd
extends gc {
    final AtomicReferenceArray a;
    final dx b;
    final int c;
    final ReferenceQueue e = new ReferenceQueue();

    gd(int n2, dx dx2) {
        super(n2);
        this.c = this.d == -1 ? Integer.MAX_VALUE : this.d + 1;
        this.a = new AtomicReferenceArray(this.c);
        this.b = dx2;
    }

    @Override
    public Object a(int n2) {
        ge ge2;
        Object var3_3;
        if (this.c != Integer.MAX_VALUE) {
            cl.a(n2, this.a());
        }
        Object v0 = var3_3 = (ge2 = (ge)this.a.get(n2)) == null ? null : ge2.get();
        if (var3_3 != null) {
            return var3_3;
        }
        Object object = this.b.a();
        ge ge3 = new ge(object, n2, this.e);
        while (!this.a.compareAndSet(n2, ge2, ge3)) {
            ge2 = (ge)this.a.get(n2);
            var3_3 = ge2 == null ? null : ge2.get();
            if (var3_3 == null) continue;
            return var3_3;
        }
        this.b();
        return object;
    }

    private void b() {
        Reference reference;
        while ((reference = this.e.poll()) != null) {
            ge ge2 = (ge)reference;
            this.a.compareAndSet(ge2.a, ge2, null);
        }
    }

    @Override
    public int a() {
        return this.c;
    }
}

