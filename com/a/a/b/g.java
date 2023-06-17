/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.e;
import com.a.a.b.f;
import com.a.a.b.m;

final class g
extends f {
    g(m m2, String string2) {
    }

    @Override
    String a(String string) {
        return com.a.a.b.e.a(string);
    }

    @Override
    String b(f f2, String string) {
        if (f2 == b) {
            return string.replace('-', '_');
        }
        if (f2 == e) {
            return com.a.a.b.e.b(string.replace('-', '_'));
        }
        return super.b(f2, string);
    }
}

