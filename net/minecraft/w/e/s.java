/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.a.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.av;
import net.minecraft.w.e.e;
import net.minecraft.w.l;

class s
extends bm {
    private final av a;
    private int b;

    public s(av av2) {
        this.a = av2;
        this.b(2);
    }

    @Override
    public boolean e() {
        l l2 = this.a.W();
        return l2 == null ? false : (!l2.br() ? false : !(l2 instanceof b) || !((b)l2).J.a);
    }

    @Override
    public void b() {
        this.b = 300;
        super.b();
    }

    @Override
    public boolean a() {
        l l2 = this.a.W();
        return l2 == null ? false : (!l2.br() ? false : (l2 instanceof b && ((b)l2).J.a ? false : --this.b > 0));
    }

    @Override
    public void d() {
        this.a.a(this.a.W(), 10.0f, 10.0f);
        ((e)this.a.L()).a(this.a.ba, this.a.v());
    }
}

