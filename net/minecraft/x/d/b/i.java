/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.j.j;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class i
implements p {
    private int a;
    private String b;

    public i() {
    }

    public i(int n2, j j2) {
        this.a = n2;
        this.b = j2 == null ? "" : j2.b();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.E();
        this.b = a2.e(16);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.a(this.b);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

