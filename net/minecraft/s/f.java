/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.client.k.b;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.u.bp;

public class f {
    protected static final bp b = new bp("textures/gui/widgets.png");
    private final b a;

    public f(int n2, int n3, int n4, String string) {
        this.a = new b(this, n2, n3, n4, string);
    }

    public f(int n2, int n3, int n4, int n5, int n6, String string) {
        this.a = new b(this, n2, n3, n4, string, n5, n6);
    }

    public ch b() {
        return this.a;
    }

    public int c() {
        return this.a.a();
    }

    public boolean d() {
        return this.a.b();
    }

    public void b(boolean bl2) {
        this.a.a(bl2);
    }

    public void a(String string) {
        this.a.a(string);
    }

    public int e() {
        return this.a.c();
    }

    public int f() {
        return this.a.f();
    }

    public int g() {
        return this.a.d();
    }

    public void a(int n2, int n3) {
        this.a.c(r.z(), n2, n3);
    }

    public void b(int n2, int n3) {
    }

    public void c(int n2, int n3) {
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.a_(n2, n3, n4, n5, n6, n7);
    }

    public void d(int n2, int n3) {
    }

    public int c(boolean bl2) {
        return this.a.c(bl2);
    }
}

