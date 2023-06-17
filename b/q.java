/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collection;

class q
extends p {
    private static final long a = -1L;

    q(Collection collection) {
        super(collection);
    }

    public String getMessage() {
        return "Option " + this.c() + " requires an argument";
    }
}

