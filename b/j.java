/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collection;

class j
extends p {
    private static final long a = -1L;

    j(Collection collection) {
        super(collection);
    }

    public String getMessage() {
        return "Found multiple arguments for option " + this.c() + ", but you asked for only one";
    }
}

