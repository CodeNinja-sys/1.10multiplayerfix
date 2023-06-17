/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.ie;
import com.a.a.d.ig;
import com.a.a.d.tu;
import java.util.Iterator;
import java.util.Map;

class if
extends tu {
    final /* synthetic */ ie a;

    if(ie ie2) {
        this.a = ie2;
    }

    @Override
    Map a() {
        return this.a;
    }

    @Override
    public Iterator iterator() {
        return new ig(this);
    }
}

