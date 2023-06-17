/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.dq;
import net.minecraft.g.hy;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class gd
extends dq {
    public static final net.minecraft.g.b.e b = net.minecraft.g.b.e.a("variant", hy.class);

    public gd() {
        this.z(this.O.b().a(b, (Comparable)((Object)hy.a)));
    }

    @Override
    public int k(b b2) {
        return ((hy)((Object)b2.a(b))).c();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (hy hy2 : hy.values()) {
            list.add(new cu(cg2, 1, hy2.c()));
        }
    }

    @Override
    public e g(b b2) {
        return ((hy)((Object)b2.a(b))).d();
    }

    @Override
    public b a(int n2) {
        return this.v().a(b, (Comparable)((Object)hy.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((hy)((Object)b2.a(b))).c();
    }

    @Override
    protected i a() {
        return new i(this, b);
    }

    @Override
    public int l(b b2) {
        hy hy2 = (hy)((Object)b2.a(b));
        return hy2.b();
    }
}

