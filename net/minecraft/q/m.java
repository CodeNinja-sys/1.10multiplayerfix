/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.a.i;
import net.minecraft.q.b.x;
import net.minecraft.q.d.b;
import net.minecraft.q.e;
import net.minecraft.q.f.o;
import net.minecraft.q.v;
import net.minecraft.q.w;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;

public class m
extends e {
    private b g;

    @Override
    public void c() {
        this.c = new x(i.k);
        this.e = true;
        net.minecraft.e.e e2 = this.b.F().a(w.c);
        this.g = this.b instanceof v ? new b((v)this.b, e2.o("DragonFight")) : null;
    }

    @Override
    public o d() {
        return new net.minecraft.q.g.m(this.b, this.b.F().r(), this.b.A());
    }

    @Override
    public float a(long l2, float f2) {
        return 0.0f;
    }

    @Override
    public float[] a(float f2, float f3) {
        return null;
    }

    @Override
    public s b(float f2, float f3) {
        int n2 = 0xA080A0;
        float f4 = n.b(f2 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f4 = n.a(f4, 0.0f, 1.0f);
        float f5 = 0.627451f;
        float f6 = 0.5019608f;
        float f7 = 0.627451f;
        return new s(f5 *= f4 * 0.0f + 0.15f, f6 *= f4 * 0.0f + 0.15f, f7 *= f4 * 0.0f + 0.15f);
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public float g() {
        return 8.0f;
    }

    @Override
    public boolean b(int n2, int n3) {
        return this.b.b(new net.minecraft.u.b.b(n2, 0, n3)).d().c();
    }

    @Override
    public net.minecraft.u.b.b i() {
        return new net.minecraft.u.b.b(100, 50, 0);
    }

    @Override
    public int j() {
        return 50;
    }

    @Override
    public boolean c(int n2, int n3) {
        return false;
    }

    @Override
    public w a() {
        return w.c;
    }

    @Override
    public void q() {
        net.minecraft.e.e e2 = new net.minecraft.e.e();
        if (this.g != null) {
            e2.a("DragonFight", this.g.a());
        }
        this.b.F().a(w.c, e2);
    }

    @Override
    public void r() {
        if (this.g != null) {
            this.g.b();
        }
    }

    public b s() {
        return this.g;
    }
}

