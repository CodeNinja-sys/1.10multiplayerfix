/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ae;
import com.a.a.b.cl;
import com.a.a.b.m;
import java.util.Arrays;

final class z
extends ae {
    z(String string) {
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return true;
    }

    @Override
    public int f(CharSequence charSequence) {
        return charSequence.length() == 0 ? -1 : 0;
    }

    @Override
    public int a(CharSequence charSequence, int n2) {
        int n3 = charSequence.length();
        cl.b(n2, n3);
        return n2 == n3 ? -1 : n2;
    }

    @Override
    public int g(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    @Override
    public boolean d(CharSequence charSequence) {
        cl.a(charSequence);
        return true;
    }

    @Override
    public boolean e(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @Override
    public String i(CharSequence charSequence) {
        cl.a(charSequence);
        return "";
    }

    @Override
    public String a(CharSequence charSequence, char c2) {
        char[] arrc = new char[charSequence.length()];
        Arrays.fill(arrc, c2);
        return new String(arrc);
    }

    @Override
    public String a(CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder stringBuilder = new StringBuilder(charSequence.length() * charSequence2.length());
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            stringBuilder.append(charSequence2);
        }
        return stringBuilder.toString();
    }

    @Override
    public String b(CharSequence charSequence, char c2) {
        return charSequence.length() == 0 ? "" : String.valueOf(c2);
    }

    @Override
    public String k(CharSequence charSequence) {
        cl.a(charSequence);
        return "";
    }

    @Override
    public int h(CharSequence charSequence) {
        return charSequence.length();
    }

    @Override
    public m a(m m2) {
        return (m)cl.a(m2);
    }

    @Override
    public m b(m m2) {
        cl.a(m2);
        return this;
    }

    @Override
    public m a() {
        return m;
    }
}

