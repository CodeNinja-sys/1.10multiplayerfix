/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.e;
import net.minecraft.client.g.bd;
import net.minecraft.client.k.ch;
import net.minecraft.client.r;
import net.minecraft.u.b.n;

public class d
extends ch {
    private float b = 1.0f;
    public boolean a;
    private final e c;
    private final float n;
    private final float o;

    public d(int n2, int n3, int n4, e e2) {
        this(n2, n3, n4, e2, 0.0f, 1.0f);
    }

    public d(int n2, int n3, int n4, e e2, float f2, float f3) {
        super(n2, n3, n4, 150, 20, "");
        this.c = e2;
        this.n = f2;
        this.o = f3;
        r r2 = r.z();
        this.b = e2.b(r2.w.a(e2));
        this.i = r2.w.c(e2);
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
                this.b = net.minecraft.u.b.n.a(this.b, 0.0f, 1.0f);
                float f2 = this.c.c(this.b);
                r2.w.a(this.c, f2);
                this.b = this.c.b(f2);
                this.i = r2.w.c(this.c);
            }
            r2.N().a(d);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a_(this.g + (int)(this.b * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
            this.a_(this.g + (int)(this.b * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean a(r r2, int n2, int n3) {
        if (super.a(r2, n2, n3)) {
            this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            this.b = net.minecraft.u.b.n.a(this.b, 0.0f, 1.0f);
            r2.w.a(this.c, this.c.c(this.b));
            this.i = r2.w.c(this.c);
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

