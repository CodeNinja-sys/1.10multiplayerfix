/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aga;
import com.a.a.d.age;
import com.a.a.d.agi;
import com.a.a.d.gd;
import java.util.Iterator;

class agd
extends gd {
    final /* synthetic */ Object a;
    final /* synthetic */ aga b;

    agd(aga aga2, Object object) {
        this.b = aga2;
        this.a = object;
    }

    public agi a() {
        return new age(this.b, this.a);
    }

    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

