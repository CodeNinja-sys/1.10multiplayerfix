/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.a.p;
import net.minecraft.q.ab;
import net.minecraft.q.b.i;
import net.minecraft.q.b.q;
import net.minecraft.q.b.x;
import net.minecraft.q.c.d;
import net.minecraft.q.f.o;
import net.minecraft.q.g.g;
import net.minecraft.q.g.s;
import net.minecraft.q.k;
import net.minecraft.q.w;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

public abstract class e {
    public static final float[] a = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    protected k b;
    private ab g;
    private String h;
    protected i c;
    protected boolean d;
    protected boolean e;
    protected final float[] f = new float[16];
    private final float[] i = new float[4];

    public final void a(k k2) {
        this.b = k2;
        this.g = k2.F().t();
        this.h = k2.F().u();
        this.c();
        this.b();
    }

    protected void b() {
        float f2 = 0.0f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 1.0f + 0.0f;
        }
    }

    protected void c() {
        ab ab2 = this.b.F().t();
        if (ab2 == ab.c) {
            net.minecraft.q.g.k k2 = net.minecraft.q.g.k.a(this.b.F().u());
            this.c = new x(q.a(k2.a(), net.minecraft.a.i.b));
        } else {
            this.c = ab2 == ab.g ? new x(net.minecraft.a.i.c) : new i(this.b.F());
        }
    }

    public o d() {
        return this.g == ab.c ? new s(this.b, this.b.A(), this.b.F().r(), this.h) : (this.g == ab.g ? new g(this.b) : (this.g == ab.f ? new net.minecraft.q.g.o(this.b, this.b.A(), this.b.F().r(), this.h) : new net.minecraft.q.g.o(this.b, this.b.A(), this.b.F().r(), this.h)));
    }

    public boolean b(int n2, int n3) {
        b b2 = new b(n2, 0, n3);
        return this.b.a(b2).i() ? true : this.b.b(b2).c() == p.c;
    }

    public float a(long l2, float f2) {
        int n2 = (int)(l2 % 24000L);
        float f3 = ((float)n2 + f2) / 24000.0f - 0.25f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        float f4 = 1.0f - (float)((Math.cos((double)f3 * Math.PI) + 1.0) / 2.0);
        f3 += (f4 - f3) / 3.0f;
        return f3;
    }

    public int a(long l2) {
        return (int)(l2 / 24000L % 8L + 8L) % 8;
    }

    public boolean e() {
        return true;
    }

    public float[] a(float f2, float f3) {
        float f4 = 0.4f;
        float f5 = n.b(f2 * ((float)Math.PI * 2)) - 0.0f;
        float f6 = -0.0f;
        if (f5 >= -0.4f && f5 <= 0.4f) {
            float f7 = (f5 - -0.0f) / 0.4f * 0.5f + 0.5f;
            float f8 = 1.0f - (1.0f - n.a(f7 * (float)Math.PI)) * 0.99f;
            f8 *= f8;
            this.i[0] = f7 * 0.3f + 0.7f;
            this.i[1] = f7 * f7 * 0.7f + 0.2f;
            this.i[2] = f7 * f7 * 0.0f + 0.2f;
            this.i[3] = f8;
            return this.i;
        }
        return null;
    }

    public net.minecraft.u.b.s b(float f2, float f3) {
        float f4 = n.b(f2 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f4 = n.a(f4, 0.0f, 1.0f);
        float f5 = 0.7529412f;
        float f6 = 0.84705883f;
        float f7 = 1.0f;
        return new net.minecraft.u.b.s(f5 *= f4 * 0.94f + 0.06f, f6 *= f4 * 0.94f + 0.06f, f7 *= f4 * 0.91f + 0.09f);
    }

    public boolean f() {
        return true;
    }

    public float g() {
        return 128.0f;
    }

    public boolean h() {
        return true;
    }

    public b i() {
        return null;
    }

    public int j() {
        return this.g == ab.c ? 4 : this.b.x() + 1;
    }

    public double k() {
        return this.g == ab.c ? 1.0 : 0.03125;
    }

    public boolean c(int n2, int n3) {
        return false;
    }

    public i l() {
        return this.c;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.e;
    }

    public float[] o() {
        return this.f;
    }

    public d p() {
        return new d();
    }

    public void a(net.minecraft.w.a.g g2) {
    }

    public void b(net.minecraft.w.a.g g2) {
    }

    public abstract w a();

    public void q() {
    }

    public void r() {
    }

    public boolean a(int n2, int n3) {
        return true;
    }
}

