/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;

public class u
extends a
implements Serializable {
    private final long a;
    private final boolean b;

    public u(long l2) {
        this(l2, true);
    }

    public u(long l2, boolean bl2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("The size must be non-negative");
        }
        this.a = l2;
        this.b = bl2;
    }

    @Override
    public boolean accept(File file) {
        boolean bl2;
        boolean bl3 = bl2 = file.length() < this.a;
        return this.b ? !bl2 : bl2;
    }

    @Override
    public String toString() {
        String string = this.b ? ">=" : "<";
        return super.toString() + "(" + string + this.a + ")";
    }
}

