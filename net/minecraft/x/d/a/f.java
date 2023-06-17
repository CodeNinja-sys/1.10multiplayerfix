/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class f
implements p {
    private float a;
    private float b;
    private boolean c;
    private boolean d;

    public f() {
    }

    public f(float f2, float f3, boolean bl2, boolean bl3) {
        this.a = f2;
        this.b = f3;
        this.c = bl2;
        this.d = bl3;
    }

    @Override
    public void a(a a2) {
        this.a = a2.O();
        this.b = a2.O();
        byte by2 = a2.E();
        this.c = (by2 & 1) > 0;
        this.d = (by2 & 2) > 0;
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
        byte by2 = 0;
        if (this.c) {
            by2 = (byte)(by2 | true ? 1 : 0);
        }
        if (this.d) {
            by2 = (byte)(by2 | 2);
        }
        a2.B(by2);
    }

    public void a(b b2) {
        b2.a(this);
    }

    public float a() {
        return this.a;
    }

    public float b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}

