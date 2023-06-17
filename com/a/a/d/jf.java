/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jd;
import com.a.a.d.jg;
import com.a.a.d.jt;
import com.a.a.d.kc;
import java.util.Iterator;

class jf
extends kc {
    final /* synthetic */ jd a;

    jf(jd jd2) {
        this.a = jd2;
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    public agi aO_() {
        return new jg(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

