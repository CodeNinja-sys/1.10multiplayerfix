/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collections;

class ae
extends p {
    private static final long a = -1L;

    ae(String string) {
        super(Collections.singletonList(string));
    }

    public String getMessage() {
        return this.b() + " is not a recognized option";
    }
}

