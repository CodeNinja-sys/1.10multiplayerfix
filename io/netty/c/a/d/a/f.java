/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.a;

import io.netty.c.a.d.a.a;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.aw;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.i;
import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.bw;
import io.netty.util.b.ad;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;

public class f
extends aq {
    private static final g a = h.a(f.class);
    private final a b;
    private bj c;

    public f(a a2) {
        this.b = a2;
    }

    @Override
    public void a_(bd bd2, Object object) {
        if (this.b.a() && object instanceof bj) {
            this.c = (bj)object;
            if (f.a(this.c)) {
                this.a(bd2, this.c);
                return;
            }
            if (this.b.l() && !this.a()) {
                f.b(bd2, this.c);
                return;
            }
        }
        bd2.b(object);
    }

    private void a(bd bd2, bj bj2) {
        i i2 = new i(bj2.r(), bp.d);
        if (this.b(i2)) {
            this.h(i2);
            this.i(i2);
            this.f(i2);
            this.j(i2);
            this.a(i2);
        }
        bd2.d(i2).a((ad)io.netty.channel.aw.g);
    }

    private void a(bm bm2) {
        bm2.q().a(this.b.k());
    }

    private boolean b(bm bm2) {
        String string = this.c.q().b("Origin");
        if (string != null) {
            if ("null".equals(string) && this.b.e()) {
                f.e(bm2);
                return true;
            }
            if (this.b.b()) {
                if (this.b.g()) {
                    this.c(bm2);
                    f.d(bm2);
                } else {
                    f.e(bm2);
                }
                return true;
            }
            if (this.b.d().contains(string)) {
                f.a(bm2, string);
                f.d(bm2);
                return true;
            }
            a.b("Request origin [" + string + "] was not among the configured origins " + this.b.d());
        }
        return false;
    }

    private boolean a() {
        if (this.b.b()) {
            return true;
        }
        String string = this.c.q().b("Origin");
        if (string == null) {
            return true;
        }
        if ("null".equals(string) && this.b.e()) {
            return true;
        }
        return this.b.d().contains(string);
    }

    private void c(bm bm2) {
        f.a(bm2, this.c.q().b("Origin"));
    }

    private static void d(bm bm2) {
        bm2.q().b("Vary", (Object)"Origin");
    }

    private static void e(bm bm2) {
        f.a(bm2, "*");
    }

    private static void a(bm bm2, String string) {
        bm2.q().b("Access-Control-Allow-Origin", (Object)string);
    }

    private void f(bm bm2) {
        if (this.b.g()) {
            bm2.q().b("Access-Control-Allow-Credentials", (Object)"true");
        }
    }

    private static boolean a(bj bj2) {
        ar ar2 = bj2.q();
        return bj2.s().equals(aw.a) && ar2.d("Origin") && ar2.d("Access-Control-Request-Method");
    }

    private void g(bm bm2) {
        if (!this.b.f().isEmpty()) {
            bm2.q().b("Access-Control-Expose-Headers", (Iterable)this.b.f());
        }
    }

    private void h(bm bm2) {
        bm2.q().b("Access-Control-Allow-Methods", (Iterable)this.b.i());
    }

    private void i(bm bm2) {
        bm2.q().b("Access-Control-Allow-Headers", (Iterable)this.b.j());
    }

    private void j(bm bm2) {
        bm2.q().b("Access-Control-Max-Age", (Object)this.b.h());
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        bm bm2;
        if (this.b.a() && object instanceof bm && this.b(bm2 = (bm)object)) {
            this.f(bm2);
            this.i(bm2);
            this.g(bm2);
        }
        bd2.b(object, bw2);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        a.e("Caught error in CorsHandler", throwable);
        bd2.a(throwable);
    }

    private static void b(bd bd2, bj bj2) {
        bd2.d(new i(bj2.r(), bp.v)).a((ad)io.netty.channel.aw.g);
    }
}

