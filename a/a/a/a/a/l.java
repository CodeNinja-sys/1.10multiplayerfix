/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.c.c;
import a.a.a.a.c.v;
import java.util.Map;

public class l
extends c {
    protected final v a;

    public l(v v2) {
        this.a = v2;
    }

    public Object next() {
        return ((Map.Entry)this.a.next()).getValue();
    }

    @Override
    public boolean hasNext() {
        return this.a.hasNext();
    }
}

