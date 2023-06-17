/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.q.a.x;

public class l
implements Comparable {
    private final x a;

    public l(x x2) {
        this.a = x2;
    }

    public int a() {
        return this.a.f().a();
    }

    public String b() {
        return this.a.a();
    }

    public boolean c() {
        return this.a.h();
    }

    public boolean d() {
        return this.a.g();
    }

    public boolean e() {
        return this.a.d();
    }

    public String f() {
        return this.a.b();
    }

    public long g() {
        return this.a.e();
    }

    public int a(x x2) {
        return this.a.a(x2);
    }

    public long h() {
        return this.a.c();
    }

    public int a(l l2) {
        return this.a.e() < l2.g() ? 1 : (this.a.e() > l2.g() ? -1 : this.a.a().compareTo(l2.b()));
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((l)object);
    }
}

