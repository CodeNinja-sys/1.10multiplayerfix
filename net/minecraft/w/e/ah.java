/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.bm;
import net.minecraft.w.e.as;

class ah
extends bm {
    private int b;
    final /* synthetic */ as a;

    private ah(as as2) {
        this.a = as2;
    }

    @Override
    public boolean e() {
        return this.a.W() == null && as.a(this.a).nextInt(40) == 0;
    }

    @Override
    public boolean a() {
        return this.a.W() == null && this.b > 0;
    }

    @Override
    public void b() {
        this.b = 20 * (1 + as.a(this.a).nextInt(3));
        this.a.b(30);
    }

    @Override
    public void c() {
        if (this.a.W() == null) {
            this.a.b(0);
        }
    }

    @Override
    public void d() {
        --this.b;
    }

    /* synthetic */ ah(as as2, ah ah2) {
        this(as2);
    }
}

