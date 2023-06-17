/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collection;

class m
extends p {
    private static final long a = -1L;
    private final String b;

    m(Collection collection, String string, Throwable throwable) {
        super(collection, throwable);
        this.b = string;
    }

    public String getMessage() {
        return "Cannot parse argument '" + this.b + "' of option " + this.c();
    }
}

