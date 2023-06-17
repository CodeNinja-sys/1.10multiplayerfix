/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aan;
import com.a.a.d.abx;
import com.a.a.d.aby;

abstract class act
extends aan {
    final /* synthetic */ abx b;

    private act(abx abx2) {
        this.b = abx2;
    }

    @Override
    public boolean isEmpty() {
        return this.b.a.isEmpty();
    }

    @Override
    public void clear() {
        this.b.a.clear();
    }

    /* synthetic */ act(abx abx2, aby aby2) {
        this(abx2);
    }
}

