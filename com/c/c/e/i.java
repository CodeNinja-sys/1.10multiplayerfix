/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.d.d;
import net.minecraft.s.b;
import net.minecraft.s.h;
import net.minecraft.s.n;
import net.minecraft.s.p;

public class i
extends d {
    private final h b;
    private final com.c.c.b.n c;

    public i(n n2, com.c.c.b.n n3) {
        this.c = n3;
        this.b = new h(n2);
    }

    @Override
    public void run() {
        this.b(n.f("mco.connect.connecting"));
        p p2 = p.a(this.c.a);
        this.b.a(p2.a(), p2.b());
    }

    @Override
    public void d() {
        this.b.a();
        net.minecraft.s.b.n();
    }

    @Override
    public void a() {
        this.b.b();
    }
}

