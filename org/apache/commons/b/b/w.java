/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.n;

public class w
implements Serializable,
n {
    public static final n a;
    public static final n b;

    protected w() {
    }

    @Override
    public boolean accept(File file) {
        return true;
    }

    @Override
    public boolean accept(File file, String string) {
        return true;
    }

    static {
        b = a = new w();
    }
}

