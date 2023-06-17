/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.dg;
import a.a.a.a.a.dh;
import a.a.a.a.a.n;
import java.io.Serializable;
import java.util.Iterator;

public class cv
extends n
implements Serializable {
    private static final long b = -7046029254386353129L;
    protected final dg a;

    protected cv(dg dg2) {
        if (dg2 == null) {
            throw new NullPointerException();
        }
        this.a = dg2;
    }

    @Override
    public int size() {
        int n2 = 0;
        dh dh2 = this.a();
        while (dh2.hasNext()) {
            dh2.next();
            ++n2;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        return !this.a.a().hasNext();
    }

    @Override
    public dh a() {
        return this.a.a();
    }

    @Override
    public dh g() {
        return this.a();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

