/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.List;
import java.util.UUID;
import net.minecraft.w.a.b;
import net.minecraft.x.a.o;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ar
implements p {
    private int a;
    private UUID b;
    private double c;
    private double d;
    private double e;
    private byte f;
    private byte g;
    private o h;
    private List i;

    public ar() {
    }

    public ar(b b2) {
        this.a = b2.ca();
        this.b = b2.ac().a();
        this.c = b2.aU;
        this.d = b2.aV;
        this.e = b2.aW;
        this.f = (byte)(b2.ba * 256.0f / 360.0f);
        this.g = (byte)(b2.bb * 256.0f / 360.0f);
        this.h = b2.cc();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.g();
        this.c = a2.P();
        this.d = a2.P();
        this.e = a2.P();
        this.f = a2.E();
        this.g = a2.E();
        this.i = o.b(a2);
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.a(this.c);
        a2.a(this.d);
        a2.a(this.e);
        a2.B(this.f);
        a2.B(this.g);
        this.h.a(a2);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public List a() {
        if (this.i == null) {
            this.i = this.h.c();
        }
        return this.i;
    }

    public int b() {
        return this.a;
    }

    public UUID c() {
        return this.b;
    }

    public double d() {
        return this.c;
    }

    public double e() {
        return this.d;
    }

    public double f() {
        return this.e;
    }

    public byte g() {
        return this.f;
    }

    public byte h() {
        return this.g;
    }
}

