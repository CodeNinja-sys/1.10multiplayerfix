/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.client.r;
import net.minecraft.q.q;
import net.minecraft.u.b.n;
import net.minecraft.x.d.b.ak;

public class ap
extends q {
    protected float h;
    protected long i;

    public ap(ak ak2) {
        super(ak2.a(), ak2.c(), ak2.e(), ak2.f());
        this.h = ak2.d();
        this.b = ak2.d();
        this.i = r.I();
        this.a(ak2.g());
        this.b(ak2.h());
        this.c(ak2.i());
    }

    @Override
    public void a(float f2) {
        this.b = this.c();
        this.h = f2;
        this.i = r.I();
    }

    @Override
    public float c() {
        long l2 = r.I() - this.i;
        float f2 = n.a((float)l2 / 100.0f, 0.0f, 1.0f);
        return this.b + (this.h - this.b) * f2;
    }

    public void a(ak ak2) {
        switch (ak2.b()) {
            case d: {
                this.a(ak2.c());
                break;
            }
            case c: {
                this.a(ak2.d());
                break;
            }
            case e: {
                this.a(ak2.e());
                this.a(ak2.f());
                break;
            }
            case f: {
                this.a(ak2.g());
                this.b(ak2.h());
            }
        }
    }
}

