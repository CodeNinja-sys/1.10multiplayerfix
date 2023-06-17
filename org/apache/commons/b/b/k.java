/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.n;

public class k
extends a
implements Serializable {
    public static final n a = new k();

    protected k() {
    }

    @Override
    public boolean accept(File file) {
        return file.isFile();
    }
}

