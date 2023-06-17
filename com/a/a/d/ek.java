/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ec;
import com.a.a.d.ed;
import com.a.a.d.eg;
import com.a.a.d.ej;
import com.a.a.d.jt;
import java.util.Map;

final class ek
extends eg {
    final /* synthetic */ ec a;

    private ek(ec ec2) {
        this.a = ec2;
        super(ec.a(ec2).length);
    }

    @Override
    jt a() {
        return ec.e(this.a);
    }

    Map b(int n2) {
        return new ej(this.a, n2);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ ek(ec ec2, ed ed2) {
        this(ec2);
    }
}

