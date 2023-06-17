/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class al
implements p {
    private int a;
    private String b;
    private net.minecraft.u.d.a c;
    private int d;
    private int e;

    public al() {
    }

    public al(int n2, String string, net.minecraft.u.d.a a2) {
        this(n2, string, a2, 0);
    }

    public al(int n2, String string, net.minecraft.u.d.a a2, int n3) {
        this.a = n2;
        this.b = string;
        this.c = a2;
        this.d = n3;
    }

    public al(int n2, String string, net.minecraft.u.d.a a2, int n3, int n4) {
        this(n2, string, a2, n3);
        this.e = n4;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.F();
        this.b = a2.e(32);
        this.c = a2.d();
        this.d = a2.F();
        if (this.b.equals("EntityHorse")) {
            this.e = a2.K();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.B(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.B(this.d);
        if (this.b.equals("EntityHorse")) {
            a2.E(this.e);
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public net.minecraft.u.d.a c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        return this.d > 0;
    }
}

