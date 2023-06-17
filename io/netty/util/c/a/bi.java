/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.av;
import io.netty.util.c.a.f;
import io.netty.util.c.a.g;
import java.util.concurrent.atomic.AtomicReference;

final class bi
extends g {
    final f h;
    final AtomicReference i;

    bi(g g2, int n2, int n3, int n4, av[] arrav, f f2, AtomicReference atomicReference) {
        super(g2, n2, n3, n4, arrav);
        this.h = f2;
        this.i = atomicReference;
    }

    @Override
    public final Object c() {
        return this.i.get();
    }

    @Override
    public final void b() {
        AtomicReference atomicReference;
        f f2 = this.h;
        if (f2 != null && (atomicReference = this.i) != null) {
            int n2;
            int n3;
            int n4 = this.d;
            while (this.g > 0 && (n3 = (n2 = this.e) + n4 >>> 1) > n4) {
                if (atomicReference.get() != null) {
                    return;
                }
                this.b(1);
                this.e = n3;
                new bi(this, this.g >>>= 1, this.e, n2, this.a, f2, atomicReference).r();
            }
            while (atomicReference.get() == null) {
                av av2 = this.a();
                if (av2 == null) {
                    this.j();
                    break;
                }
                Object object = f2.a(av2.c, av2.d);
                if (object == null) continue;
                if (!atomicReference.compareAndSet(null, object)) break;
                this.m();
                break;
            }
        }
    }
}

