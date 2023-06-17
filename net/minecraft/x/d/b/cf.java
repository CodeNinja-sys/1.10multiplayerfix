/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class cf
implements p {
    private float a;
    private int b;
    private float c;

    public cf() {
    }

    public cf(float f2, int n2, float f3) {
        this.a = f2;
        this.b = n2;
        this.c = f3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.O();
        this.b = a2.e();
        this.c = a2.O();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.d(this.b);
        a2.a(this.c);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public float a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }
}

