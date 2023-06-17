/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.acu;
import com.a.a.d.ada;
import com.a.a.d.go;
import java.util.Collection;
import java.util.Iterator;

class adb
extends go {
    final /* synthetic */ Iterator a;
    final /* synthetic */ ada b;

    adb(ada ada2, Iterator iterator) {
        this.b = ada2;
        this.a = iterator;
    }

    @Override
    protected Iterator a() {
        return this.a;
    }

    public Collection b() {
        return acu.a((Collection)super.next(), this.b.h);
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

