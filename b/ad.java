/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collection;
import java.util.Collections;

class ad
extends p {
    private static final long a = -1L;

    ad(String string) {
        this(Collections.singletonList(string));
    }

    ad(Collection collection) {
        super(collection);
    }

    public String getMessage() {
        return "Option " + this.c() + " has not been configured on this parser";
    }
}

