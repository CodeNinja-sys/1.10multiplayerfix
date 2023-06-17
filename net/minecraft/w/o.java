/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.u.b.n;
import net.minecraft.w.f;
import net.minecraft.w.l;

public class o {
    private final l a;
    private int b;
    private float c;

    public o(l l2) {
        this.a = l2;
    }

    public void a() {
        double d2 = this.a.aU - this.a.aR;
        double d3 = this.a.aW - this.a.aT;
        if (d2 * d2 + d3 * d3 > 2.500000277905201E-7) {
            this.a.ak = this.a.ba;
            this.c = this.a.am = this.a(this.a.ak, this.a.am, 75.0f);
            this.b = 0;
        } else if (this.a.db().isEmpty() || !(this.a.db().get(0) instanceof f)) {
            float f2 = 75.0f;
            if (Math.abs(this.a.am - this.c) > 15.0f) {
                this.b = 0;
                this.c = this.a.am;
            } else {
                ++this.b;
                int n2 = 10;
                if (this.b > 10) {
                    f2 = Math.max(1.0f - (float)(this.b - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.a.ak = this.a(this.a.am, this.a.ak, f2);
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = n.g(f2 - f3);
        if (f5 < -f4) {
            f5 = -f4;
        }
        if (f5 >= f4) {
            f5 = f4;
        }
        return f2 - f5;
    }
}

