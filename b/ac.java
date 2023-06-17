/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.p;
import java.util.Collections;

class ac
extends p {
    private static final long a = -1L;
    private final int b;
    private final int c;
    private final int d;

    ac(int n2, int n3, int n4) {
        super(Collections.singletonList("[arguments]"));
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public String getMessage() {
        return String.format("actual = %d, minimum = %d, maximum = %d", this.d, this.b, this.c);
    }
}

