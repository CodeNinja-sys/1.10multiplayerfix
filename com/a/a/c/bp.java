/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ab;
import com.a.a.c.bo;
import java.util.concurrent.Callable;

class bp
extends ab {
    final /* synthetic */ Callable a;
    final /* synthetic */ bo b;

    bp(bo bo2, Callable callable) {
        this.b = bo2;
        this.a = callable;
    }

    @Override
    public Object a(Object object) {
        return this.a.call();
    }
}

