/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ac;
import com.a.b.an;
import com.a.b.b.v;
import com.a.b.d.a;
import com.a.b.d.e;
import com.a.b.t;
import com.a.b.w;
import com.a.b.y;
import com.a.b.z;
import java.util.Map;

final class ar
extends an {
    ar() {
    }

    public w b(a a2) {
        switch (a2.f()) {
            case f: {
                return new ac(a2.h());
            }
            case g: {
                String string = a2.h();
                return new ac(new v(string));
            }
            case h: {
                return new ac(a2.i());
            }
            case i: {
                a2.j();
                return y.a;
            }
            case a: {
                t t2 = new t();
                a2.a();
                while (a2.e()) {
                    t2.a(this.b(a2));
                }
                a2.b();
                return t2;
            }
            case c: {
                z z2 = new z();
                a2.c();
                while (a2.e()) {
                    z2.a(a2.g(), this.b(a2));
                }
                a2.d();
                return z2;
            }
        }
        throw new IllegalArgumentException();
    }

    public void a(e e2, w w2) {
        if (w2 == null || w2.s()) {
            e2.f();
        } else if (w2.r()) {
            ac ac2 = w2.v();
            if (ac2.y()) {
                e2.a(ac2.c());
            } else if (ac2.b()) {
                e2.a(ac2.n());
            } else {
                e2.b(ac2.d());
            }
        } else if (w2.p()) {
            e2.b();
            for (w w3 : w2.u()) {
                this.a(e2, w3);
            }
            e2.c();
        } else if (w2.q()) {
            e2.d();
            for (Map.Entry entry : w2.t().b()) {
                e2.a((String)entry.getKey());
                this.a(e2, (w)entry.getValue());
            }
            e2.e();
        } else {
            throw new IllegalArgumentException("Couldn't write " + w2.getClass());
        }
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

