/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ec;
import com.a.a.d.ed;
import com.a.a.d.ee;
import com.a.a.d.eg;
import com.a.a.d.jt;
import java.util.Map;

final class ef
extends eg {
    final /* synthetic */ ec a;

    private ef(ec ec2) {
        this.a = ec2;
        super(ec.d(ec2).length);
    }

    @Override
    jt a() {
        return ec.b(this.a);
    }

    Map b(int n2) {
        return new ee(this.a, n2);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    /* synthetic */ Object a(int n2) {
        return this.b(n2);
    }

    /* synthetic */ ef(ec ec2, ed ed2) {
        this(ec2);
    }
}

