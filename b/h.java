/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collections;

class h
extends p {
    private static final long a = -1L;

    h(String string) {
        super(Collections.singletonList(string));
    }

    public String getMessage() {
        return this.b() + " is not a legal option character";
    }
}

