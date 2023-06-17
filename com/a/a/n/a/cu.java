/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.n.a.cs;
import com.a.a.n.a.dl;

class cu
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ dl b;
    final /* synthetic */ cs c;

    cu(cs cs2, int n2, dl dl2) {
        this.c = cs2;
        this.a = n2;
        this.b = dl2;
    }

    @Override
    public void run() {
        cs.a(this.c, this.a, this.b);
    }
}

