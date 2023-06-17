/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.agi;
import com.a.a.d.bx;
import com.a.a.d.cb;
import com.a.a.d.gd;
import java.util.Iterator;

class ca
extends gd {
    final /* synthetic */ Object a;
    final /* synthetic */ bx b;

    ca(bx bx2, Object object) {
        this.b = bx2;
        this.a = object;
    }

    public agi a() {
        return new cb(this.b, this.a);
    }

    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

