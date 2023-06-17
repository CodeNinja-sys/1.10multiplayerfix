/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import java.util.Iterator;
import net.minecraft.c.b.a;
import net.minecraft.c.b.j;
import net.minecraft.q.f.k;

class z
extends com.a.a.d.j {
    final /* synthetic */ j a;
    private final /* synthetic */ Iterator b;

    z(j j2, Iterator iterator) {
        this.a = j2;
        this.b = iterator;
    }

    protected k d() {
        while (this.b.hasNext()) {
            a a2 = (a)this.b.next();
            k k2 = a2.f();
            if (k2 == null) continue;
            if (!k2.v() && k2.u()) {
                return k2;
            }
            if (!k2.j()) {
                return k2;
            }
            if (!a2.a(128.0, j.d())) continue;
            return k2;
        }
        return (k)this.b();
    }

    @Override
    protected /* synthetic */ Object a() {
        return this.d();
    }
}

