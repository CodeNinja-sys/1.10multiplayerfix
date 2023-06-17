/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acx;
import com.a.a.d.acz;
import com.a.a.d.go;
import java.util.Iterator;
import java.util.Map;

class acy
extends go {
    final /* synthetic */ Iterator a;
    final /* synthetic */ acx b;

    acy(acx acx2, Iterator iterator) {
        this.b = acx2;
        this.a = iterator;
    }

    @Override
    protected Iterator a() {
        return this.a;
    }

    public Map.Entry b() {
        Map.Entry entry = (Map.Entry)super.next();
        return new acz(this, entry);
    }

    @Override
    public /* synthetic */ Object next() {
        return this.b();
    }

    @Override
    protected /* synthetic */ Object aN_() {
        return this.a();
    }
}

