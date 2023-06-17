/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.az;
import org.apache.commons.compress.archivers.h.v;

public class u
extends ZipException {
    private final v a;
    private final ab b;
    private static final long c = 20130101L;

    public u(v v2, ab ab2) {
        super("unsupported feature " + v2 + " used in entry " + ab2.getName());
        this.a = v2;
        this.b = ab2;
    }

    public u(az az2, ab ab2) {
        super("unsupported feature method '" + az2.name() + "' used in entry " + ab2.getName());
        this.a = v.b;
        this.b = ab2;
    }

    public u(v v2) {
        super("unsupported feature " + v2 + " used in archive.");
        this.a = v2;
        this.b = null;
    }

    public v a() {
        return this.a;
    }

    public ab b() {
        return this.b;
    }
}

