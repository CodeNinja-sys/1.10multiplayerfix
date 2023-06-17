/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.k;
import net.minecraft.w.n;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class bh
implements p {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected byte e;
    protected byte f;
    protected boolean g;
    protected boolean h;

    public bh() {
    }

    public bh(int n2) {
        this.a = n2;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public String toString() {
        return "Entity_" + super.toString();
    }

    public n a(k k2) {
        return k2.a(this.a);
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public byte d() {
        return this.e;
    }

    public byte e() {
        return this.f;
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.g;
    }
}

