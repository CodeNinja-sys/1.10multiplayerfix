/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.e.e;
import net.minecraft.m.cb;
import net.minecraft.m.cu;
import net.minecraft.q.l;
import net.minecraft.u.n;
import net.minecraft.w.a.b;

public class am {
    private int a = 20;
    private float b = 5.0f;
    private float c;
    private int d;
    private int e = 20;

    public void a(int n2, float f2) {
        this.a = Math.min(n2 + this.a, 20);
        this.b = Math.min(this.b + (float)n2 * f2 * 2.0f, (float)this.a);
    }

    public void a(cb cb2, cu cu2) {
        this.a(cb2.h(cu2), cb2.i(cu2));
    }

    public void a(b b2) {
        boolean bl2;
        l l2 = b2.aQ.R();
        this.e = this.a;
        if (this.c > 4.0f) {
            this.c -= 4.0f;
            if (this.b > 0.0f) {
                this.b = Math.max(this.b - 1.0f, 0.0f);
            } else if (l2 != l.a) {
                this.a = Math.max(this.a - 1, 0);
            }
        }
        if ((bl2 = b2.aQ.G().b("naturalRegeneration")) && this.b > 0.0f && b2.aq() && this.a >= 20) {
            ++this.d;
            if (this.d >= 10) {
                float f2 = Math.min(this.b, 4.0f);
                b2.a(f2 / 4.0f);
                this.a(f2);
                this.d = 0;
            }
        } else if (bl2 && this.a >= 18 && b2.aq()) {
            ++this.d;
            if (this.d >= 80) {
                b2.a(1.0f);
                this.a(4.0f);
                this.d = 0;
            }
        } else if (this.a <= 0) {
            ++this.d;
            if (this.d >= 80) {
                if (b2.bo() > 10.0f || l2 == l.d || b2.bo() > 1.0f && l2 == l.c) {
                    b2.a(n.h, 1.0f);
                }
                this.d = 0;
            }
        } else {
            this.d = 0;
        }
    }

    public void a(e e2) {
        if (e2.b("foodLevel", 99)) {
            this.a = e2.h("foodLevel");
            this.d = e2.h("foodTickTimer");
            this.b = e2.j("foodSaturationLevel");
            this.c = e2.j("foodExhaustionLevel");
        }
    }

    public void b(e e2) {
        e2.a("foodLevel", this.a);
        e2.a("foodTickTimer", this.d);
        e2.a("foodSaturationLevel", this.b);
        e2.a("foodExhaustionLevel", this.c);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.a < 20;
    }

    public void a(float f2) {
        this.c = Math.min(this.c + f2, 40.0f);
    }

    public float c() {
        return this.b;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void b(float f2) {
        this.b = f2;
    }
}

