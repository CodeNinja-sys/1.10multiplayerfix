/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.bx;
import com.a.a.d.bz;
import com.a.a.d.gd;
import java.util.Iterator;

class by
extends gd {
    final /* synthetic */ Object a;
    final /* synthetic */ bx b;

    by(bx bx2, Object object) {
        this.b = bx2;
        this.a = object;
    }

    public Iterator iterator() {
        return new bz(this);
    }
}

