/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.n;

public class q
extends a
implements Serializable {
    private final n a;

    public q(n n2) {
        if (n2 == null) {
            throw new IllegalArgumentException("The filter must not be null");
        }
        this.a = n2;
    }

    @Override
    public boolean accept(File file) {
        return !this.a.accept(file);
    }

    @Override
    public boolean accept(File file, String string) {
        return !this.a.accept(file, string);
    }

    @Override
    public String toString() {
        return super.toString() + "(" + this.a.toString() + ")";
    }
}

