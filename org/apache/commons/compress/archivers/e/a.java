/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.e;

import java.security.cert.Certificate;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.zip.ZipEntry;
import org.apache.commons.compress.archivers.h.ab;

public class a
extends ab {
    private final Attributes d = null;
    private final Certificate[] e = null;

    public a(ZipEntry zipEntry) {
        super(zipEntry);
    }

    public a(String string) {
        super(string);
    }

    public a(ab ab2) {
        super(ab2);
    }

    public a(JarEntry jarEntry) {
        super(jarEntry);
    }

    public Attributes b() {
        return this.d;
    }

    public Certificate[] c() {
        if (this.e != null) {
            Certificate[] arrcertificate = new Certificate[this.e.length];
            System.arraycopy(this.e, 0, arrcertificate, 0, arrcertificate.length);
            return arrcertificate;
        }
        return null;
    }
}

