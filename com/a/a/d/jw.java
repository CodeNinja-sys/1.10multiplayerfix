/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jt;
import com.a.a.d.jv;
import com.a.a.d.jx;
import com.a.a.d.kc;
import java.util.Iterator;

class jw
extends kc {
    final /* synthetic */ jv a;

    jw(jv jv2) {
        this.a = jv2;
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    public agi aO_() {
        agi agi2 = jv.a(this.a).e().aO_();
        return new jx(this, agi2);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

