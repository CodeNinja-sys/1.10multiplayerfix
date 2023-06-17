/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.f;

import com.a.a.b.cl;
import com.a.a.f.h;
import com.a.a.f.p;
import com.a.a.f.q;
import java.util.logging.Level;
import java.util.logging.Logger;

final class m
implements q {
    private final Logger a;

    public m(String string) {
        this.a = Logger.getLogger(h.class.getName() + "." + (String)cl.a(string));
    }

    @Override
    public void a(Throwable throwable, p p2) {
        this.a.log(Level.SEVERE, "Could not dispatch event: " + p2.c() + " to " + p2.d(), throwable.getCause());
    }
}

