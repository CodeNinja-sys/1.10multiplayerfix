/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.fd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class gj
extends cn {
    public static final e a = net.minecraft.g.b.e.a("variant", fd.class);
    public static final int b = fd.a.b();
    public static final int c = fd.b.b();
    public static final int d = fd.c.b();
    public static final int e = fd.d.b();

    public gj() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)fd.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public int k(b b2) {
        return ((fd)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (fd fd2 : fd.values()) {
            list.add(new cu(cg2, 1, fd2.b()));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)fd.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((fd)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

