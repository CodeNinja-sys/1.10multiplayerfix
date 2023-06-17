/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.jd;
import com.a.a.d.lo;
import com.a.a.d.nj;
import java.util.Iterator;

class je
extends lo {
    final /* synthetic */ jd a;

    je(jd jd2) {
        this.a = jd2;
    }

    @Override
    public boolean contains(Object object) {
        return jd.a(this.a).containsKey(object);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public agi aO_() {
        return nj.a(jd.a(this.a).keySet().iterator());
    }

    @Override
    boolean a() {
        return true;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.aO_();
    }
}

