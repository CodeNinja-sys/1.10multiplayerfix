/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.b.m;
import com.a.a.i.b;
import com.a.a.i.by;
import com.a.a.i.bz;
import com.a.a.i.ca;
import com.a.a.i.cb;
import com.a.a.i.g;
import com.a.a.i.i;
import com.a.a.i.k;
import com.a.a.i.l;
import java.math.RoundingMode;

final class j
extends b {
    private final g a;
    private final Character b;
    private transient b c;
    private transient b d;

    j(String string, String string2, Character c2) {
        this(new g(string, string2.toCharArray()), c2);
    }

    j(g g2, Character c2) {
        this.a = (g)cl.a(g2);
        cl.a(c2 == null || !g2.c(c2.charValue()), "Padding character %s was already in alphabet", new Object[]{c2});
        this.b = c2;
    }

    @Override
    m a() {
        return this.b == null ? m.m : m.a(this.b.charValue());
    }

    @Override
    int a(int n2) {
        return this.a.u * com.a.a.j.g.a(n2, this.a.v, RoundingMode.CEILING);
    }

    @Override
    bz a(cb cb2) {
        cl.a(cb2);
        return new k(this, cb2);
    }

    @Override
    int b(int n2) {
        return (int)(((long)this.a.t * (long)n2 + 7L) / 8L);
    }

    @Override
    by a(ca ca2) {
        cl.a(ca2);
        return new l(this, ca2);
    }

    @Override
    public b b() {
        return this.b == null ? this : new j(this.a, null);
    }

    @Override
    public b a(char c2) {
        if (8 % this.a.t == 0 || this.b != null && this.b.charValue() == c2) {
            return this;
        }
        return new j(this.a, Character.valueOf(c2));
    }

    @Override
    public b a(String string, int n2) {
        cl.a(string);
        cl.a(this.a().b(this.a).e(string), (Object)"Separator cannot contain alphabet or padding characters");
        return new i(this, string, n2);
    }

    @Override
    public b c() {
        b b2 = this.c;
        if (b2 == null) {
            g g2 = this.a.d();
            this.c = g2 == this.a ? this : new j(g2, this.b);
            b2 = this.c;
        }
        return b2;
    }

    @Override
    public b d() {
        b b2 = this.d;
        if (b2 == null) {
            g g2 = this.a.e();
            this.d = g2 == this.a ? this : new j(g2, this.b);
            b2 = this.d;
        }
        return b2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BaseEncoding.");
        stringBuilder.append(this.a.toString());
        if (8 % this.a.t != 0) {
            if (this.b == null) {
                stringBuilder.append(".omitPadding()");
            } else {
                stringBuilder.append(".withPadChar(").append(this.b).append(')');
            }
        }
        return stringBuilder.toString();
    }

    static /* synthetic */ g a(j j2) {
        return j2.a;
    }

    static /* synthetic */ Character b(j j2) {
        return j2.b;
    }
}

