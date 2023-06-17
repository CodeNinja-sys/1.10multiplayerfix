/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.compress.b.d.j;

class k
extends FileInputStream {
    final /* synthetic */ j a;

    k(j j2, File file) {
        this.a = j2;
        super(file);
    }

    public void close() {
        super.close();
        j.a(this.a).delete();
    }
}

