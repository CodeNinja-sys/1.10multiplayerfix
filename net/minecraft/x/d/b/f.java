/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.q.ab;
import net.minecraft.q.am;
import net.minecraft.q.l;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class f
implements p {
    private int a;
    private l b;
    private am c;
    private ab d;

    public f() {
    }

    public f(int n2, l l2, ab ab2, am am2) {
        this.a = n2;
        this.b = l2;
        this.c = am2;
        this.d = ab2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.K();
        this.b = l.a(a2.F());
        this.c = am.a(a2.F());
        this.d = ab.a(a2.e(16));
        if (this.d == null) {
            this.d = ab.b;
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.E(this.a);
        a2.B(this.b.a());
        a2.B(this.c.a());
        a2.a(this.d.a());
    }

    public int a() {
        return this.a;
    }

    public l b() {
        return this.b;
    }

    public am c() {
        return this.c;
    }

    public ab d() {
        return this.d;
    }
}

