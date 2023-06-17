/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.a;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.al;
import io.netty.c.a.j.w;
import io.netty.util.e;
import io.netty.util.o;
import java.net.IDN;

public final class l
extends ak {
    private final w a;
    private final a b;
    private final String c;
    private final int d;

    public l(w w2, a a2, String string, int n2) {
        super(al.c);
        if (w2 == null) {
            throw new NullPointerException("cmdType");
        }
        if (a2 == null) {
            throw new NullPointerException("addressType");
        }
        if (string == null) {
            throw new NullPointerException("host");
        }
        switch (a2) {
            case a: {
                if (o.d(string)) break;
                throw new IllegalArgumentException(string + " is not a valid IPv4 address");
            }
            case b: {
                if (IDN.toASCII(string).length() <= 255) break;
                throw new IllegalArgumentException(string + " IDN: " + IDN.toASCII(string) + " exceeds 255 char limit");
            }
            case c: {
                if (o.b(string)) break;
                throw new IllegalArgumentException(string + " is not a valid IPv6 address");
            }
        }
        if (n2 <= 0 || n2 >= 65536) {
            throw new IllegalArgumentException(n2 + " is not in bounds 0 < x < 65536");
        }
        this.a = w2;
        this.b = a2;
        this.c = IDN.toASCII(string);
        this.d = n2;
    }

    public w a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        return IDN.toUnicode(this.c);
    }

    public int d() {
        return this.d;
    }

    @Override
    public void a(g g2) {
        g2.B(this.f().a());
        g2.B(this.a.a());
        g2.B(0);
        g2.B(this.b.a());
        switch (this.b) {
            case a: {
                g2.c(o.a(this.c));
                g2.C(this.d);
                break;
            }
            case b: {
                g2.B(this.c.length());
                g2.c(this.c.getBytes(e.f));
                g2.C(this.d);
                break;
            }
            case c: {
                g2.c(o.a(this.c));
                g2.C(this.d);
            }
        }
    }
}

