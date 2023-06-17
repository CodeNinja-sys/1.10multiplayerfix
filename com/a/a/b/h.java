/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.e;
import com.a.a.b.f;
import com.a.a.b.m;

final class h
extends f {
    h(m m2, String string2) {
    }

    @Override
    String a(String string) {
        return com.a.a.b.e.a(string);
    }

    @Override
    String b(f f2, String string) {
        if (f2 == a) {
            return string.replace('_', '-');
        }
        if (f2 == e) {
            return com.a.a.b.e.b(string);
        }
        return super.b(f2, string);
    }
}

