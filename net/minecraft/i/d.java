/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.i.g;
import net.minecraft.i.h;
import net.minecraft.q.n;
import net.minecraft.u.ax;
import net.minecraft.w.f;

public abstract class d {
    protected n a;
    protected f b;
    protected final ax c = new ax();
    protected int d;
    protected int e;
    protected int f;
    protected boolean g;
    protected boolean h;
    protected boolean i;

    public void a(n n2, f f2) {
        this.a = n2;
        this.b = f2;
        this.c.a();
        this.d = net.minecraft.u.b.n.d(f2.bl + 1.0f);
        this.e = net.minecraft.u.b.n.d(f2.bm + 1.0f);
        this.f = net.minecraft.u.b.n.d(f2.bl + 1.0f);
    }

    public void a() {
        this.a = null;
        this.b = null;
    }

    protected g a(int n2, int n3, int n4) {
        int n5 = net.minecraft.i.g.b(n2, n3, n4);
        g g2 = (g)this.c.a(n5);
        if (g2 == null) {
            g2 = new g(n2, n3, n4);
            this.c.a(n5, g2);
        }
        return g2;
    }

    public abstract g b();

    public abstract g a(double var1, double var3, double var5);

    public abstract int a(g[] var1, g var2, g var3, float var4);

    public abstract h a(n var1, int var2, int var3, int var4, f var5, int var6, int var7, int var8, boolean var9, boolean var10);

    public abstract h a(n var1, int var2, int var3, int var4);

    public void a(boolean bl2) {
        this.g = bl2;
    }

    public void b(boolean bl2) {
        this.h = bl2;
    }

    public void c(boolean bl2) {
        this.i = bl2;
    }

    public boolean c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public boolean e() {
        return this.i;
    }
}

