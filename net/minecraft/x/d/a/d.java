/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.w.n;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class d
implements p {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;

    public d() {
    }

    public d(n n2) {
        this.a = n2.aU;
        this.b = n2.aV;
        this.c = n2.aW;
        this.d = n2.ba;
        this.e = n2.bb;
    }

    @Override
    public void a(a a2) {
        this.a = a2.P();
        this.b = a2.P();
        this.c = a2.P();
        this.d = a2.O();
        this.e = a2.O();
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }
}

