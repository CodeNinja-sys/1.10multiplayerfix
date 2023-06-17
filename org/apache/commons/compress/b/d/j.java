/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.compress.b.d.i;
import org.apache.commons.compress.b.d.k;

class j
extends i {
    private final File a = File.createTempFile("commons-compress", "packtemp");

    j() {
        this.a.deleteOnExit();
        this.out = new FileOutputStream(this.a);
    }

    InputStream a() {
        this.out.close();
        return new k(this, this.a);
    }

    static /* synthetic */ File a(j j2) {
        return j2.a;
    }
}

