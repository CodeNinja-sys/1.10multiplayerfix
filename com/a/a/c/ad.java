/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ac;
import java.util.concurrent.Callable;

class ad
implements Callable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ ac c;

    ad(ac ac2, Object object, Object object2) {
        this.c = ac2;
        this.a = object;
        this.b = object2;
    }

    public Object call() {
        return this.c.a.a(this.a, this.b).get();
    }
}

