/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.ak;
import com.a.a.b.am;
import java.util.Iterator;

class al
implements Iterable {
    final /* synthetic */ Iterable a;
    final /* synthetic */ ak b;

    al(ak ak2, Iterable iterable) {
        this.b = ak2;
        this.a = iterable;
    }

    public Iterator iterator() {
        return new am(this);
    }
}

