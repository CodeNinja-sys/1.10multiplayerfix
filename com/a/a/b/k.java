/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.e;
import com.a.a.b.f;
import com.a.a.b.m;

final class k
extends f {
    k(m m2, String string2) {
    }

    @Override
    String a(String string) {
        return com.a.a.b.e.b(string);
    }

    @Override
    String b(f f2, String string) {
        if (f2 == a) {
            return com.a.a.b.e.a(string.replace('_', '-'));
        }
        if (f2 == b) {
            return com.a.a.b.e.a(string);
        }
        return super.b(f2, string);
    }
}

