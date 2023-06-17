/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ac;
import a.a.a.a.c.ad;
import a.a.a.a.c.b;
import java.io.Serializable;
import java.util.Iterator;

public class z
extends b
implements Serializable {
    private static final long b = -7046029254386353129L;
    protected final ac a;

    protected z(ac ac2) {
        if (ac2 == null) {
            throw new NullPointerException();
        }
        this.a = ac2;
    }

    @Override
    public int size() {
        int n2 = 0;
        ad ad2 = this.a();
        while (ad2.hasNext()) {
            ad2.next();
            ++n2;
        }
        return n2;
    }

    @Override
    public boolean isEmpty() {
        return !this.a.a().hasNext();
    }

    @Override
    public ad a() {
        return this.a.a();
    }

    @Override
    public ad g() {
        return this.a();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

