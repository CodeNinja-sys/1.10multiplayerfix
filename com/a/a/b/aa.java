/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.cl;
import com.a.a.b.m;

final class aa
extends ae {
    aa(String string) {
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return false;
    }

    @Override
    public int f(CharSequence charSequence) {
        cl.a(charSequence);
        return -1;
    }

    @Override
    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        cl.b(n2, n3);
        return -1;
    }

    @Override
    public int g(CharSequence charSequence) {
        cl.a(charSequence);
        return -1;
    }

    @Override
    public boolean d(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override
    public boolean e(CharSequence charSequence) {
        cl.a(charSequence);
        return true;
    }

    @Override
    public String i(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String a(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    @Override
    public String a(CharSequence charSequence, CharSequence charSequence2) {
        cl.a(charSequence2);
        return charSequence.toString();
    }

    @Override
    public String b(CharSequence charSequence, char c2) {
        return charSequence.toString();
    }

    @Override
    public String k(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String l(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public String m(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public int h(CharSequence charSequence) {
        cl.a(charSequence);
        return 0;
    }

    @Override
    public m a(m m2) {
        cl.a(m2);
        return this;
    }

    @Override
    public m b(m m2) {
        return (m)cl.a(m2);
    }

    @Override
    public m a() {
        return l;
    }
}

