/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.n;
import org.apache.commons.b.b.q;

public class i
extends a
implements Serializable {
    public static final n a = new i();
    public static final n b = new q(a);

    protected i() {
    }

    @Override
    public boolean accept(File file) {
        if (file.isDirectory()) {
            File[] arrfile = file.listFiles();
            return arrfile == null || arrfile.length == 0;
        }
        return file.length() == 0L;
    }
}

