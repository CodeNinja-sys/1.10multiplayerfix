/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.m;

final class s
extends m {
    final /* synthetic */ cm s;

    s(String string, cm cm2) {
        this.s = cm2;
        super(string);
    }

    @Override
    public boolean c(char c2) {
        return this.s.a(Character.valueOf(c2));
    }

    @Override
    public boolean a(Character c2) {
        return this.s.a(cl.a(c2));
    }
}

