/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.ba;
import net.minecraft.w.e.n;
import net.minecraft.w.l;
import net.minecraft.w.t;

class y
extends ba {
    final /* synthetic */ n a;

    public y(n n2) {
        this.a = n2;
        super((t)n2, false, new Class[0]);
    }

    @Override
    public void b() {
        super.b();
        if (this.a.ba()) {
            this.g();
            this.c();
        }
    }

    @Override
    protected void a(t t2, l l2) {
        if (t2 instanceof n && !((n)t2).ba()) {
            super.a(t2, l2);
        }
    }
}

