/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collection;

class i
extends p {
    private static final long a = -1L;

    protected i(Collection collection) {
        super(collection);
    }

    public String getMessage() {
        return "Missing required option(s) " + this.c();
    }
}

