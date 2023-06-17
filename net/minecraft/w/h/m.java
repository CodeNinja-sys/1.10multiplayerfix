/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.b.cm;
import net.minecraft.w.h.ad;
import net.minecraft.w.h.am;
import net.minecraft.w.h.e;
import net.minecraft.w.n;

class m
implements cm {
    final /* synthetic */ e a;

    m(e e2) {
        this.a = e2;
    }

    public boolean a(n n2) {
        return n2 instanceof ad || n2 instanceof am;
    }

    @Override
    public /* synthetic */ boolean a(Object object) {
        return this.a((n)object);
    }
}

