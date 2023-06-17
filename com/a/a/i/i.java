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
import com.a.a.j.g;
import java.math.RoundingMode;

final class i
extends b {
    private final b a;
    private final String b;
    private final int c;
    private final m d;

    i(b b2, String string, int n2) {
        this.a = (b)cl.a(b2);
        this.b = (String)cl.a(string);
        this.c = n2;
        cl.a(n2 > 0, "Cannot add a separator after every %s chars", new Object[]{n2});
        this.d = m.a(string).b();
    }

    @Override
    m a() {
        return this.a.a();
    }

    @Override
    int a(int n2) {
        int n3 = this.a.a(n2);
        return n3 + this.b.length() * g.a(Math.max(0, n3 - 1), this.c, RoundingMode.FLOOR);
    }

    @Override
    bz a(cb cb2) {
        return this.a.a(i.a(cb2, this.b, this.c));
    }

    @Override
    int b(int n2) {
        return this.a.b(n2);
    }

    @Override
    by a(ca ca2) {
        return this.a.a(i.a(ca2, this.d));
    }

    @Override
    public b b() {
        return this.a.b().a(this.b, this.c);
    }

    @Override
    public b a(char c2) {
        return this.a.a(c2).a(this.b, this.c);
    }

    @Override
    public b a(String string, int n2) {
        throw new UnsupportedOperationException("Already have a separator");
    }

    @Override
    public b c() {
        return this.a.c().a(this.b, this.c);
    }

    @Override
    public b d() {
        return this.a.d().a(this.b, this.c);
    }

    public String toString() {
        return this.a.toString() + ".withSeparator(\"" + this.b + "\", " + this.c + ")";
    }
}

