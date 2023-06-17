/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ec;
import com.a.a.d.eg;
import com.a.a.d.jt;

final class ej
extends eg {
    private final int b;
    final /* synthetic */ ec a;

    ej(ec ec2, int n2) {
        this.a = ec2;
        super(ec.a(ec2)[n2]);
        this.b = n2;
    }

    @Override
    jt a() {
        return ec.b(this.a);
    }

    @Override
    Object a(int n2) {
        return ec.c(this.a)[this.b][n2];
    }

    @Override
    boolean b() {
        return true;
    }
}

