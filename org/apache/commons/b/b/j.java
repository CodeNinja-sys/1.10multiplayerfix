/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.n;

public class j
implements Serializable,
n {
    public static final n a;
    public static final n b;

    protected j() {
    }

    @Override
    public boolean accept(File file) {
        return false;
    }

    @Override
    public boolean accept(File file, String string) {
        return false;
    }

    static {
        b = a = new j();
    }
}

