/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.b;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.b.b.a;
import org.apache.commons.b.b.n;
import org.apache.commons.b.b.q;

public class e
extends a
implements Serializable {
    public static final n a = new e();
    public static final n b = new q(a);

    protected e() {
    }

    @Override
    public boolean accept(File file) {
        return file.canWrite();
    }
}

