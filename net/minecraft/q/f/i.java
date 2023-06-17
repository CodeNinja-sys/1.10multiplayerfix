/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f;

import com.a.a.b.cm;
import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.q.au;
import net.minecraft.q.f.a;
import net.minecraft.q.k;
import net.minecraft.w.n;

public class i
extends net.minecraft.q.f.k {
    public i(k k2, int n2, int n3) {
        super(k2, n2, n3);
    }

    @Override
    public boolean a(int n2, int n3) {
        return n2 == this.b && n3 == this.c;
    }

    @Override
    public int b(int n2, int n3) {
        return 0;
    }

    @Override
    public void a() {
    }

    @Override
    public void b() {
    }

    @Override
    public b a(net.minecraft.u.b.b b2) {
        return p.a.v();
    }

    @Override
    public int b(net.minecraft.u.b.b b2) {
        return 255;
    }

    @Override
    public int a(au au2, net.minecraft.u.b.b b2) {
        return au2.c;
    }

    @Override
    public void a(au au2, net.minecraft.u.b.b b2, int n2) {
    }

    @Override
    public int a(net.minecraft.u.b.b b2, int n2) {
        return 0;
    }

    @Override
    public void a(n n2) {
    }

    @Override
    public void b(n n2) {
    }

    @Override
    public void a(n n2, int n3) {
    }

    @Override
    public boolean c(net.minecraft.u.b.b b2) {
        return false;
    }

    @Override
    public ap a(net.minecraft.u.b.b b2, a a2) {
        return null;
    }

    @Override
    public void a(ap ap2) {
    }

    @Override
    public void a(net.minecraft.u.b.b b2, ap ap2) {
    }

    @Override
    public void d(net.minecraft.u.b.b b2) {
    }

    @Override
    public void c() {
    }

    @Override
    public void d() {
    }

    @Override
    public void e() {
    }

    @Override
    public void a(n n2, net.minecraft.u.b.a a2, List list, cm cm2) {
    }

    @Override
    public void a(Class class_, net.minecraft.u.b.a a2, List list, cm cm2) {
    }

    @Override
    public boolean a(boolean bl2) {
        return false;
    }

    @Override
    public Random a(long l2) {
        return new Random(this.q().A() + (long)(this.b * this.b * 4987142) + (long)(this.b * 5947611) + (long)(this.c * this.c) * 4392871L + (long)(this.c * 389711) ^ l2);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public boolean c(int n2, int n3) {
        return true;
    }
}

