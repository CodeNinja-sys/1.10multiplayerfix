/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.a;
import io.netty.c.a.j.am;
import io.netty.c.a.j.an;
import io.netty.c.a.j.v;
import io.netty.util.e;
import io.netty.util.o;
import java.net.IDN;

public final class q
extends am {
    private final v a;
    private final a b;
    private final String c;
    private final int d;
    private static final byte[] e = new byte[]{0};
    private static final byte[] f = new byte[]{0, 0, 0, 0};
    private static final byte[] g = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public q(v v2, a a2) {
        this(v2, a2, null, 0);
    }

    public q(v v2, a a2, String string, int n2) {
        super(an.c);
        if (v2 == null) {
            throw new NullPointerException("cmdStatus");
        }
        if (a2 == null) {
            throw new NullPointerException("addressType");
        }
        if (string != null) {
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
            string = IDN.toASCII(string);
        }
        if (n2 < 0 || n2 > 65535) {
            throw new IllegalArgumentException(n2 + " is not in bounds 0 <= x <= 65535");
        }
        this.a = v2;
        this.b = a2;
        this.c = string;
        this.d = n2;
    }

    public v a() {
        return this.a;
    }

    public a b() {
        return this.b;
    }

    public String c() {
        if (this.c != null) {
            return IDN.toUnicode(this.c);
        }
        return null;
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
                byte[] arrby = this.c == null ? f : o.a(this.c);
                g2.c(arrby);
                g2.C(this.d);
                break;
            }
            case b: {
                byte[] arrby = this.c == null ? e : this.c.getBytes(io.netty.util.e.f);
                g2.B(arrby.length);
                g2.c(arrby);
                g2.C(this.d);
                break;
            }
            case c: {
                byte[] arrby = this.c == null ? g : o.a(this.c);
                g2.c(arrby);
                g2.C(this.d);
                break;
            }
        }
    }
}

