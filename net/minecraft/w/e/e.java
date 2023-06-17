/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.ad;
import net.minecraft.w.b.ax;
import net.minecraft.w.d;
import net.minecraft.w.e.av;

class e
extends ad {
    private float i;
    private int j;
    private final av k;
    private boolean l;

    public e(av av2) {
        super(av2);
        this.k = av2;
        this.i = 180.0f * av2.ba / (float)Math.PI;
    }

    public void a(float f2, boolean bl2) {
        this.i = f2;
        this.l = bl2;
    }

    public void a(double d2) {
        this.e = d2;
        this.h = ax.b;
    }

    @Override
    public void c() {
        this.a.am = this.a.ba = this.a(this.a.ba, this.i, 90.0f);
        this.a.ak = this.a.ba;
        if (this.h != ax.b) {
            this.a.b(0.0f);
        } else {
            this.h = ax.a;
            if (this.a.be) {
                this.a.e_((float)(this.e * this.a.a(net.minecraft.w.d.d).f()));
                if (this.j-- <= 0) {
                    this.j = this.k.s();
                    if (this.l) {
                        this.j /= 3;
                    }
                    this.k.M().a();
                    if (this.k.z()) {
                        this.k.a(this.k.E(), this.k.bE(), ((this.k.bd().nextFloat() - this.k.bd().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                    }
                } else {
                    this.k.aB = 0.0f;
                    this.k.aC = 0.0f;
                    this.a.e_(0.0f);
                }
            } else {
                this.a.e_((float)(this.e * this.a.a(net.minecraft.w.d.d).f()));
            }
        }
    }
}

