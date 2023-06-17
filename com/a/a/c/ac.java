/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.c.ab;
import com.a.a.c.ad;
import com.a.a.n.a.dl;
import com.a.a.n.a.dm;
import java.util.Map;
import java.util.concurrent.Executor;

final class ac
extends ab {
    final /* synthetic */ ab a;
    final /* synthetic */ Executor b;

    ac(ab ab2, Executor executor) {
        this.a = ab2;
        this.b = executor;
    }

    @Override
    public Object a(Object object) {
        return this.a.a(object);
    }

    @Override
    public dl a(Object object, Object object2) {
        dm dm2 = dm.a(new ad(this, object, object2));
        this.b.execute(dm2);
        return dm2;
    }

    @Override
    public Map a(Iterable iterable) {
        return this.a.a(iterable);
    }
}

