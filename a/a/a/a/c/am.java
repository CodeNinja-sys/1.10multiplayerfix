/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.c.ad;
import a.a.a.a.c.c;

public class am
extends c {
    protected final ad a;

    public am(ad ad2) {
        this.a = ad2;
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }

    public Object next() {
        return this.a.next();
    }
}

