/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.j;

import io.netty.b.g;
import io.netty.c.a.j.ak;
import io.netty.c.a.j.al;
import io.netty.c.a.j.ao;
import io.netty.util.e;
import java.nio.charset.CharsetEncoder;

public final class b
extends ak {
    private static final CharsetEncoder a = e.a(e.f);
    private static final ao b = ao.a;
    private final String c;
    private final String d;

    public b(String string, String string2) {
        super(al.b);
        if (string == null) {
            throw new NullPointerException("username");
        }
        if (string2 == null) {
            throw new NullPointerException("username");
        }
        if (!a.canEncode(string) || !a.canEncode(string2)) {
            throw new IllegalArgumentException(" username: " + string + " or password: " + string2 + " values should be in pure ascii");
        }
        if (string.length() > 255) {
            throw new IllegalArgumentException(string + " exceeds 255 char limit");
        }
        if (string2.length() > 255) {
            throw new IllegalArgumentException(string2 + " exceeds 255 char limit");
        }
        this.c = string;
        this.d = string2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    @Override
    public void a(g g2) {
        g2.B(b.a());
        g2.B(this.c.length());
        g2.c(this.c.getBytes(e.f));
        g2.B(this.d.length());
        g2.c(this.d.getBytes(e.f));
    }
}

