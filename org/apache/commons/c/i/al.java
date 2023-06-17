/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Arrays;

class al {
    private final Object[] a;
    private int b;

    public al(Object ... arrobject) {
        this.a = arrobject;
    }

    public boolean equals(Object object) {
        return Arrays.equals(this.a, ((al)object).a);
    }

    public int hashCode() {
        if (this.b == 0) {
            int n2 = 0;
            for (Object object : this.a) {
                if (object == null) continue;
                n2 = n2 * 7 + object.hashCode();
            }
            this.b = n2;
        }
        return this.b;
    }
}

