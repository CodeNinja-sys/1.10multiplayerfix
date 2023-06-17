/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.e;

import java.io.InputStream;
import org.apache.commons.compress.archivers.e.a;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.ac;

public class b
extends ac {
    public b(InputStream inputStream) {
        super(inputStream);
    }

    public a d() {
        ab ab2 = this.e();
        return ab2 == null ? null : new a(ab2);
    }

    public org.apache.commons.compress.archivers.a a() {
        return this.d();
    }

    public static boolean a(byte[] arrby, int n2) {
        return ac.b(arrby, n2);
    }
}

