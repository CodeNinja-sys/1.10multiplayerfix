/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c.a;

import java.util.Random;
import net.minecraft.g.cn;
import net.minecraft.q.g.c.dc;
import net.minecraft.u.b.b;
import net.minecraft.u.b.m;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class i {
    private bi a = bi.a;
    private bq b = bq.a;
    private boolean c = false;
    private cn d;
    private m e;
    private dc f;
    private boolean g = true;
    private float h = 1.0f;
    private Random i;
    private Long j;

    public i a() {
        i i2 = new i();
        i2.a = this.a;
        i2.b = this.b;
        i2.c = this.c;
        i2.d = this.d;
        i2.e = this.e;
        i2.f = this.f;
        i2.g = this.g;
        i2.h = this.h;
        i2.i = this.i;
        i2.j = this.j;
        return i2;
    }

    public i a(bi bi2) {
        this.a = bi2;
        return this;
    }

    public i a(bq bq2) {
        this.b = bq2;
        return this;
    }

    public i a(boolean bl2) {
        this.c = bl2;
        return this;
    }

    public i a(cn cn2) {
        this.d = cn2;
        return this;
    }

    public i a(m m2) {
        this.e = m2;
        return this;
    }

    public i a(dc dc2) {
        this.f = dc2;
        return this;
    }

    public i a(Long l2) {
        this.j = l2;
        return this;
    }

    public i a(Random random) {
        this.i = random;
        return this;
    }

    public i a(float f2) {
        this.h = f2;
        return this;
    }

    public bi b() {
        return this.a;
    }

    public i b(boolean bl2) {
        this.g = bl2;
        return this;
    }

    public bq c() {
        return this.b;
    }

    public Random a(b b2) {
        if (this.i != null) {
            return this.i;
        }
        if (this.j != null) {
            return this.j == 0L ? new Random(System.currentTimeMillis()) : new Random(this.j);
        }
        if (b2 == null) {
            return new Random(System.currentTimeMillis());
        }
        int n2 = b2.cy_();
        int n3 = b2.l();
        return new Random((long)(n2 * n2 * 4987142 + n2 * 5947611) + (long)(n3 * n3) * 4392871L + (long)(n3 * 389711) ^ 0x3AD8025FL);
    }

    public float d() {
        return this.h;
    }

    public boolean e() {
        return this.c;
    }

    public cn f() {
        return this.d;
    }

    public dc g() {
        if (this.f == null && this.e != null) {
            this.i();
        }
        return this.f;
    }

    public boolean h() {
        return this.g;
    }

    void i() {
        this.f = this.b(this.e);
    }

    private dc b(m m2) {
        if (m2 == null) {
            return null;
        }
        int n2 = m2.a * 16;
        int n3 = m2.b * 16;
        return new dc(n2, 0, n3, n2 + 16 - 1, 255, n3 + 16 - 1);
    }
}

