/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.w.a.e;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class y
implements p {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;

    public y() {
    }

    public y(e e2) {
        this.a(e2.a);
        this.b(e2.b);
        this.c(e2.c);
        this.d(e2.d);
        this.a(e2.a());
        this.b(e2.b());
    }

    @Override
    public void a(a a2) {
        byte by2 = a2.E();
        this.a((by2 & 1) > 0);
        this.b((by2 & 2) > 0);
        this.c((by2 & 4) > 0);
        this.d((by2 & 8) > 0);
        this.a(a2.O());
        this.b(a2.O());
    }

    @Override
    public void b(a a2) {
        byte by2 = 0;
        if (this.a()) {
            by2 = (byte)(by2 | true ? 1 : 0);
        }
        if (this.b()) {
            by2 = (byte)(by2 | 2);
        }
        if (this.c()) {
            by2 = (byte)(by2 | 4);
        }
        if (this.d()) {
            by2 = (byte)(by2 | 8);
        }
        a2.B(by2);
        a2.a(this.e);
        a2.a(this.f);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public boolean a() {
        return this.a;
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean b() {
        return this.b;
    }

    public void b(boolean bl2) {
        this.b = bl2;
    }

    public boolean c() {
        return this.c;
    }

    public void c(boolean bl2) {
        this.c = bl2;
    }

    public boolean d() {
        return this.d;
    }

    public void d(boolean bl2) {
        this.d = bl2;
    }

    public void a(float f2) {
        this.e = f2;
    }

    public void b(float f2) {
        this.f = f2;
    }
}

