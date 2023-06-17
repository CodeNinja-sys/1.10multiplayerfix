/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.f.h;
import net.minecraft.x.a;

public class l
implements h {
    @Override
    public int a(b b2) {
        int n2 = cn.w.a(b2);
        return n2 == -1 ? 0 : n2;
    }

    @Override
    public b a(int n2) {
        b b2 = (b)cn.w.a(n2);
        return b2 == null ? p.a.v() : b2;
    }

    @Override
    public void a(a a2) {
        a2.e();
    }

    @Override
    public void b(a a2) {
        a2.d(0);
    }

    @Override
    public int a() {
        return a.a(0);
    }
}

