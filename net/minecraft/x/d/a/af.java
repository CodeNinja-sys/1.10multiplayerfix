/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.h.ae;
import net.minecraft.m.cu;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class af
implements p {
    private int a;
    private int b;
    private int c;
    private short d;
    private cu e;
    private ae f;

    public af() {
    }

    public af(int n2, int n3, int n4, ae ae2, cu cu2, short s2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.e = cu2 != null ? cu2.j() : null;
        this.d = s2;
        this.f = ae2;
    }

    public void a(b b2) {
        b2.a(this);
    }

    @Override
    public void a(a a2) {
        this.a = a2.E();
        this.b = a2.G();
        this.c = a2.E();
        this.d = a2.G();
        this.f = (ae)a2.a(ae.class);
        this.e = a2.i();
    }

    @Override
    public void b(a a2) {
        a2.B(this.a);
        a2.C(this.b);
        a2.B(this.c);
        a2.C(this.d);
        a2.a(this.f);
        a2.a(this.e);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public short d() {
        return this.d;
    }

    public cu e() {
        return this.e;
    }

    public ae f() {
        return this.f;
    }
}

