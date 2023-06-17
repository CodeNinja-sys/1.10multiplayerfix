/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.g.cn;
import net.minecraft.u.b.b;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bf
implements p {
    private b a;
    private int b;
    private int c;
    private cn d;

    public bf() {
    }

    public bf(b b2, cn cn2, int n2, int n3) {
        this.a = b2;
        this.b = n2;
        this.c = n3;
        this.d = cn2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.c();
        this.b = a2.F();
        this.c = a2.F();
        this.d = cn.d(a2.e() & 0xFFF);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.B(this.b);
        a2.B(this.c);
        a2.d(cn.c(this.d) & 0xFFF);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public b a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public cn d() {
        return this.d;
    }
}

