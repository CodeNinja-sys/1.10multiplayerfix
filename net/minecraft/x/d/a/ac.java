/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.a;

import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.x.a;
import net.minecraft.x.d.b;
import net.minecraft.x.p;

public class ac
implements p {
    private net.minecraft.u.b.b a;
    private ad b;
    private ah c;
    private float d;
    private float e;
    private float f;

    public ac() {
    }

    public ac(net.minecraft.u.b.b b2, ad ad2, ah ah2, float f2, float f3, float f4) {
        this.a = b2;
        this.b = ad2;
        this.c = ah2;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    @Override
    public void a(a a2) {
        this.a = a2.c();
        this.b = (ad)a2.a(ad.class);
        this.c = (ah)a2.a(ah.class);
        this.d = (float)a2.F() / 16.0f;
        this.e = (float)a2.F() / 16.0f;
        this.f = (float)a2.F() / 16.0f;
    }

    @Override
    public void b(a a2) {
        a2.a(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.B((int)(this.d * 16.0f));
        a2.B((int)(this.e * 16.0f));
        a2.B((int)(this.f * 16.0f));
    }

    public void a(b b2) {
        b2.a(this);
    }

    public net.minecraft.u.b.b a() {
        return this.a;
    }

    public ad b() {
        return this.b;
    }

    public ah c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.f;
    }
}

