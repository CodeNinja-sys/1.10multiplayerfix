/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ae;
import net.minecraft.client.k.bk;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;

public class bf
extends ch {
    private float b = 1.0f;
    public boolean a;
    private final String c;
    private final float n;
    private final float o;
    private final bk p;
    private ae q;

    public bf(bk bk2, int n2, int n3, int n4, String string, float f2, float f3, float f4, ae ae2) {
        super(n2, n3, n4, 150, 20, "");
        this.c = string;
        this.n = f2;
        this.o = f3;
        this.b = (f4 - f2) / (f3 - f2);
        this.q = ae2;
        this.p = bk2;
        this.i = this.d();
    }

    public float a() {
        return this.n + (this.o - this.n) * this.b;
    }

    public void a(float f2, boolean bl2) {
        this.b = (f2 - this.n) / (this.o - this.n);
        this.i = this.d();
        if (bl2) {
            this.p.a(this.j, this.a());
        }
    }

    public float b() {
        return this.b;
    }

    private String d() {
        return this.q == null ? String.valueOf(u.a(this.c, new Object[0])) + ": " + this.a() : this.q.a(this.j, u.a(this.c, new Object[0]), this.a());
    }

    @Override
    protected int b(boolean bl2) {
        return 0;
    }

    @Override
    protected void b(r r2, int n2, int n3) {
        if (this.l) {
            if (this.a) {
                this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
                if (this.b < 0.0f) {
                    this.b = 0.0f;
                }
                if (this.b > 1.0f) {
                    this.b = 1.0f;
                }
                this.i = this.d();
                this.p.a(this.j, this.a());
            }
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a_(this.g + (int)(this.b * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
            this.a_(this.g + (int)(this.b * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
        }
    }

    public void a(float f2) {
        this.b = f2;
        this.i = this.d();
        this.p.a(this.j, this.a());
    }

    @Override
    public boolean a(r r2, int n2, int n3) {
        if (super.a(r2, n2, n3)) {
            this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            if (this.b < 0.0f) {
                this.b = 0.0f;
            }
            if (this.b > 1.0f) {
                this.b = 1.0f;
            }
            this.i = this.d();
            this.p.a(this.j, this.a());
            this.a = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(int n2, int n3) {
        this.a = false;
    }
}

