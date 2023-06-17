/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

public class r {
    private final int a;
    public final y b;
    public int c;
    public int d;
    public int e;

    public r(y y2, int n2, int n3, int n4) {
        this.b = y2;
        this.a = n2;
        this.d = n3;
        this.e = n4;
    }

    public void a(cu cu2, cu cu3) {
        int n2;
        if (cu2 != null && cu3 != null && cu2.a() == cu3.a() && (n2 = cu3.b - cu2.b) > 0) {
            this.a(cu2, n2);
        }
    }

    protected void a(cu cu2, int n2) {
    }

    protected void c(cu cu2) {
    }

    public void a(b b2, cu cu2) {
        this.d();
    }

    public boolean a(cu cu2) {
        return true;
    }

    public cu b() {
        return this.b.a(this.a);
    }

    public boolean c() {
        return this.b() != null;
    }

    public void d(cu cu2) {
        this.b.a(this.a, cu2);
        this.d();
    }

    public void d() {
        this.b.C();
    }

    public int a() {
        return this.b.g();
    }

    public int e(cu cu2) {
        return this.a();
    }

    public String e() {
        return null;
    }

    public cu a(int n2) {
        return this.b.a(this.a, n2);
    }

    public boolean a(y y2, int n2) {
        return y2 == this.b && n2 == this.a;
    }

    public boolean a(b b2) {
        return true;
    }

    public boolean f() {
        return true;
    }
}

