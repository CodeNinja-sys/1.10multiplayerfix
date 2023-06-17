/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.di;
import com.a.a.c.dk;

class dj
implements Runnable {
    final /* synthetic */ dk a;
    final /* synthetic */ di b;

    dj(di di2, dk dk2) {
        this.b = di2;
        this.a = dk2;
    }

    @Override
    public void run() {
        this.b.b.a(this.a);
    }
}

