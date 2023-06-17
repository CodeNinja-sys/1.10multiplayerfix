/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.client.g.ci;
import net.minecraft.s.e;
import net.minecraft.s.t;

public class v {
    public static ci a = ci.a();
    public static final v b = new v();

    public void a() {
        a.b();
    }

    public v a(double d2, double d3, double d4) {
        a.c().b(d2, d3, d4);
        return this;
    }

    public void a(float f2, float f3, float f4, float f5) {
        a.c().a(f2, f3, f4, f5);
    }

    public void a(short s2, short s3) {
        a.c().a((int)s2, s3);
    }

    public void a(float f2, float f3, float f4) {
        a.c().c(f2, f3, f4);
    }

    public void a(int n2, t t2) {
        a.c().a(n2, t2.a());
    }

    public void b() {
        a.c().d();
    }

    public void b(double d2, double d3, double d4) {
        a.c().c(d2, d3, d4);
    }

    public e a(int n2, int n3, int n4, int n5) {
        return new e(a.c().b(n2, n3, n4, n5));
    }

    public v a(double d2, double d3) {
        a.c().a(d2, d3);
        return this;
    }
}

