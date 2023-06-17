/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.c;
import org.apache.commons.b.b.e;
import org.apache.commons.b.b.n;
import org.apache.commons.b.b.q;

public class d
extends a
implements Serializable {
    public static final n a = new d();
    public static final n b = new q(a);
    public static final n c = new c(a, e.b);

    protected d() {
    }

    @Override
    public boolean accept(File file) {
        return file.canRead();
    }
}

