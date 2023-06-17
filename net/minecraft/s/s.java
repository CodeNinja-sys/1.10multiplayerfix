/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.client.g.bd;
import net.minecraft.client.r;
import net.minecraft.s.f;
import net.minecraft.u.b.n;

public class s
extends f {
    public float c = 1.0f;
    public boolean d;
    private final float a;
    private final float e;
    private int f;

    public s(int n2, int n3, int n4, int n5, int n6, int n7) {
        this(n2, n3, n4, n5, n7, 0, 1.0f, n6);
    }

    public s(int n2, int n3, int n4, int n5, int n6, int n7, float f2, float f3) {
        super(n2, n3, n4, n5, 20, "");
        this.a = f2;
        this.e = f3;
        this.c = this.b(n7);
        this.b().i = this.a();
    }

    public String a() {
        return "";
    }

    public float b(float f2) {
        return n.a((this.d(f2) - this.a) / (this.e - this.a), 0.0f, 1.0f);
    }

    public float c(float f2) {
        return this.d(this.a + (this.e - this.a) * n.a(f2, 0.0f, 1.0f));
    }

    public float d(float f2) {
        f2 = this.e(f2);
        return n.a(f2, this.a, this.e);
    }

    protected float e(float f2) {
        if (this.f > 0) {
            f2 = this.f * Math.round(f2 / (float)this.f);
        }
        return f2;
    }

    @Override
    public int c(boolean bl2) {
        return 0;
    }

    @Override
    public void d(int n2, int n3) {
        if (this.b().l) {
            if (this.d) {
                this.c = (float)(n2 - (this.b().g + 4)) / (float)(this.b().c() - 8);
                this.c = n.a(this.c, 0.0f, 1.0f);
                float f2 = this.c(this.c);
                this.a(f2);
                this.c = this.b(f2);
                this.b().i = this.a();
            }
            r.z().N().a(b);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a(this.b().g + (int)(this.c * (float)(this.b().c() - 8)), this.b().h, 0, 66, 4, 20);
            this.a(this.b().g + (int)(this.c * (float)(this.b().c() - 8)) + 4, this.b().h, 196, 66, 4, 20);
        }
    }

    @Override
    public void b(int n2, int n3) {
        this.c = (float)(n2 - (this.b().g + 4)) / (float)(this.b().c() - 8);
        this.c = n.a(this.c, 0.0f, 1.0f);
        this.a(this.c(this.c));
        this.b().i = this.a();
        this.d = true;
    }

    public void a(float f2) {
    }

    @Override
    public void c(int n2, int n3) {
        this.d = false;
    }
}

