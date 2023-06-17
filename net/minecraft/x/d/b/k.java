/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class k
implements p {
    private float a;
    private int b;
    private int c;

    public k() {
    }

    public k(float f2, int n2, int n3) {
        this.a = f2;
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.O();
        this.c = a2.e();
        this.b = a2.e();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.d(this.c);
        a2.d(this.b);
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

    public int c() {
        return this.c;
    }
}

