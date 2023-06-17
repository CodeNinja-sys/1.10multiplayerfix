/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.e.b;

public class q {
    protected final float a;
    protected final float b;
    protected final float c;

    public q(float f2, float f3, float f4) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
    }

    public q(net.minecraft.e.q q2) {
        this.a = q2.f(0);
        this.b = q2.f(1);
        this.c = q2.f(2);
    }

    public net.minecraft.e.q a() {
        net.minecraft.e.q q2 = new net.minecraft.e.q();
        q2.a(new b(this.a));
        q2.a(new b(this.b));
        q2.a(new b(this.c));
        return q2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof q)) {
            return false;
        }
        q q2 = (q)object;
        return this.a == q2.a && this.b == q2.b && this.c == q2.c;
    }

    public float b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }
}

