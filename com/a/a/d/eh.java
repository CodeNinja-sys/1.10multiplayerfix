/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.eg;
import com.a.a.d.ei;
import com.a.a.d.jt;
import com.a.a.d.kc;
import java.util.Iterator;

class eh
extends kc {
    final /* synthetic */ eg a;

    eh(eg eg2) {
        this.a = eg2;
    }

    @Override
    jt b() {
        return this.a;
    }

    @Override
    public agi aO_() {
        return new ei(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

