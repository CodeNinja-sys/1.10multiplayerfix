/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.a.i;
import net.minecraft.q.b.x;
import net.minecraft.q.c.d;
import net.minecraft.q.e;
import net.minecraft.q.f.o;
import net.minecraft.q.g.r;
import net.minecraft.q.p;
import net.minecraft.q.w;
import net.minecraft.u.b.s;

public class af
extends e {
    @Override
    public void c() {
        this.c = new x(i.j);
        this.d = true;
        this.e = true;
    }

    @Override
    public s b(float f2, float f3) {
        return new s(0.2f, 0.03f, 0.03f);
    }

    @Override
    protected void b() {
        float f2 = 0.1f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 0.9f + 0.1f;
        }
    }

    @Override
    public o d() {
        return new r(this.b, this.b.F().r(), this.b.A());
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean b(int n2, int n3) {
        return false;
    }

    @Override
    public float a(long l2, float f2) {
        return 0.5f;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean c(int n2, int n3) {
        return true;
    }

    @Override
    public d p() {
        return new p(this);
    }

    @Override
    public w a() {
        return w.b;
    }
}

