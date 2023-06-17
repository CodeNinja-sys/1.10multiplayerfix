/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class l
implements p {
    private double a;
    private double b;
    private double c;
    private float d;
    private List e;
    private float f;
    private float g;
    private float h;

    public l() {
    }

    public l(double d2, double d3, double d4, float f2, List list, s s2) {
        this.a = d2;
        this.b = d3;
        this.c = d4;
        this.d = f2;
        this.e = ov.a((Iterable)list);
        if (s2 != null) {
            this.f = (float)s2.b;
            this.g = (float)s2.c;
            this.h = (float)s2.d;
        }
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.O();
        this.b = a2.O();
        this.c = a2.O();
        this.d = a2.O();
        int n2 = a2.K();
        this.e = ov.b(n2);
        int n3 = (int)this.a;
        int n4 = (int)this.b;
        int n5 = (int)this.c;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n6 = a2.E() + n3;
            int n7 = a2.E() + n4;
            int n8 = a2.E() + n5;
            this.e.add(new b(n6, n7, n8));
        }
        this.f = a2.O();
        this.g = a2.O();
        this.h = a2.O();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a((float)this.a);
        a2.a((float)this.b);
        a2.a((float)this.c);
        a2.a(this.d);
        a2.E(this.e.size());
        int n2 = (int)this.a;
        int n3 = (int)this.b;
        int n4 = (int)this.c;
        for (b b2 : this.e) {
            int n5 = b2.cy_() - n2;
            int n6 = b2.k() - n3;
            int n7 = b2.l() - n4;
            a2.B(n5);
            a2.B(n6);
            a2.B(n7);
        }
        a2.a(this.f);
        a2.a(this.g);
        a2.a(this.h);
    }

    public void a(a a2) {
        a2.a(this);
    }

    public float a() {
        return this.f;
    }

    public float b() {
        return this.g;
    }

    public float c() {
        return this.h;
    }

    public double d() {
        return this.a;
    }

    public double e() {
        return this.b;
    }

    public double f() {
        return this.c;
    }

    public float g() {
        return this.d;
    }

    public List h() {
        return this.e;
    }
}

