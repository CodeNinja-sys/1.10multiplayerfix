/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import net.minecraft.client.k.b.k;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

class v
extends r {
    private final r f;
    final /* synthetic */ k a;

    public v(k k2, r r2, int n2) {
        this.a = k2;
        super(r2.b, n2, 0, 0);
        this.f = r2;
    }

    @Override
    public void a(b b2, cu cu2) {
        this.f.a(b2, cu2);
    }

    @Override
    public boolean a(cu cu2) {
        return this.f.a(cu2);
    }

    @Override
    public cu b() {
        return this.f.b();
    }

    @Override
    public boolean c() {
        return this.f.c();
    }

    @Override
    public void d(cu cu2) {
        this.f.d(cu2);
    }

    @Override
    public void d() {
        this.f.d();
    }

    @Override
    public int a() {
        return this.f.a();
    }

    @Override
    public int e(cu cu2) {
        return this.f.e(cu2);
    }

    @Override
    public String e() {
        return this.f.e();
    }

    @Override
    public cu a(int n2) {
        return this.f.a(n2);
    }

    @Override
    public boolean a(y y2, int n2) {
        return this.f.a(y2, n2);
    }

    @Override
    public boolean f() {
        return this.f.f();
    }

    @Override
    public boolean a(b b2) {
        return this.f.a(b2);
    }

    @Override
    public void a(cu cu2, cu cu3) {
        super.a(cu2, cu3);
    }

    static /* synthetic */ r a(v v2) {
        return v2.f;
    }
}

