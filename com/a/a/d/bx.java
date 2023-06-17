/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cg;
import com.a.a.b.cl;
import com.a.a.d.aga;
import com.a.a.d.agi;
import com.a.a.d.by;
import com.a.a.d.ca;
import com.a.a.d.cc;
import com.a.a.d.cd;
import com.a.a.d.gd;
import java.util.Deque;

public abstract class bx
extends aga {
    public abstract cg a(Object var1);

    public abstract cg b(Object var1);

    @Override
    public final Iterable c(Object object) {
        cl.a(object);
        return new by(this, object);
    }

    @Override
    agi d(Object object) {
        return new cd(this, object);
    }

    @Override
    agi e(Object object) {
        return new cc(this, object);
    }

    public final gd f(Object object) {
        cl.a(object);
        return new ca(this, object);
    }

    private static void b(Deque deque, cg cg2) {
        if (cg2.b()) {
            deque.addLast(cg2.c());
        }
    }

    static /* synthetic */ void a(Deque deque, cg cg2) {
        bx.b(deque, cg2);
    }
}

