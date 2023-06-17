/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.bl;
import com.a.a.b.eg;
import com.a.a.d.cz;
import com.a.a.d.da;
import com.a.a.d.ql;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

final class qn
extends da
implements Serializable {
    private static final long B = 0L;

    qn(ql ql2, bl bl2) {
        super(ql2, bl2);
    }

    @Override
    public Object get(Object object) {
        Object object2;
        try {
            object2 = this.a(object);
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            eg.a(throwable, cz.class);
            throw new cz(throwable);
        }
        if (object2 == null) {
            throw new NullPointerException(this.a + " returned null for key " + object + ".");
        }
        return object2;
    }
}

