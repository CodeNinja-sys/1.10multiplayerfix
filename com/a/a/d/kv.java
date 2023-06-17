/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.ku;
import com.a.a.d.xd;
import java.util.Iterator;

class kv
extends agi {
    int a;
    Object b;
    final /* synthetic */ Iterator c;
    final /* synthetic */ ku d;

    kv(ku ku2, Iterator iterator) {
        this.d = ku2;
        this.c = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    public Object next() {
        if (this.a <= 0) {
            xd xd2 = (xd)this.c.next();
            this.b = xd2.a();
            this.a = xd2.b();
        }
        --this.a;
        return this.b;
    }
}

