/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.av;
import net.minecraft.client.r;
import net.minecraft.s.o;

public class s
extends av {
    private final o a;

    public s(o o2, int n2, int n3, int n4, int n5, int n6) {
        super(net.minecraft.client.r.z(), n2, n3, n4, n5, n6);
        this.a = o2;
    }

    @Override
    protected int a() {
        return this.a.a();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        this.a.a(n2, bl2, n3, n4);
    }

    @Override
    protected boolean a(int n2) {
        return this.a.a(n2);
    }

    @Override
    protected void d() {
        this.a.d();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a(n2, n3, n4, n5, n6, n7);
    }

    public int b() {
        return this.d;
    }

    public int e() {
        return this.l;
    }

    public int f() {
        return this.k;
    }

    @Override
    protected int c() {
        return this.a.b();
    }

    @Override
    protected int j() {
        return this.a.c();
    }

    @Override
    public void cr_() {
        super.cr_();
    }
}

