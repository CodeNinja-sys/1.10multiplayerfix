/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.UUID;
import net.minecraft.q.ae;
import net.minecraft.q.ar;
import net.minecraft.q.q;
import net.minecraft.x.d.a;
import net.minecraft.x.d.b.w;
import net.minecraft.x.p;

public class ak
implements p {
    private UUID a;
    private w b;
    private net.minecraft.u.d.a c;
    private float d;
    private ae e;
    private ar f;
    private boolean g;
    private boolean h;
    private boolean i;

    public ak() {
    }

    public ak(w w2, q q2) {
        this.b = w2;
        this.a = q2.a();
        this.c = q2.b();
        this.d = q2.c();
        this.e = q2.d();
        this.f = q2.e();
        this.g = q2.f();
        this.h = q2.g();
        this.i = q2.h();
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.g();
        this.b = (w)a2.a(w.class);
        switch (this.b) {
            case a: {
                this.c = a2.d();
                this.d = a2.O();
                this.e = (ae)a2.a(ae.class);
                this.f = (ar)a2.a(ar.class);
                this.a(a2.F());
            }
            default: {
                break;
            }
            case c: {
                this.d = a2.O();
                break;
            }
            case d: {
                this.c = a2.d();
                break;
            }
            case e: {
                this.e = (ae)a2.a(ae.class);
                this.f = (ar)a2.a(ar.class);
                break;
            }
            case f: {
                this.a(a2.F());
            }
        }
    }

    private void a(int n2) {
        this.g = (n2 & 1) > 0;
        this.h = (n2 & 2) > 0;
        this.i = (n2 & 2) > 0;
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        a2.a(this.b);
        switch (this.b) {
            case a: {
                a2.a(this.c);
                a2.a(this.d);
                a2.a(this.e);
                a2.a(this.f);
                a2.B(this.k());
            }
            default: {
                break;
            }
            case c: {
                a2.a(this.d);
                break;
            }
            case d: {
                a2.a(this.c);
                break;
            }
            case e: {
                a2.a(this.e);
                a2.a(this.f);
                break;
            }
            case f: {
                a2.B(this.k());
            }
        }
    }

    private int k() {
        int n2 = 0;
        if (this.g) {
            n2 |= 1;
        }
        if (this.h) {
            n2 |= 2;
        }
        if (this.i) {
            n2 |= 2;
        }
        return n2;
    }

    public void a(a a2) {
        a2.a(this);
    }

    public UUID a() {
        return this.a;
    }

    public w b() {
        return this.b;
    }

    public net.minecraft.u.d.a c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public ae e() {
        return this.e;
    }

    public ar f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }
}

