/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.InputStream;
import java.util.zip.CRC32;
import org.apache.commons.compress.c.f;

public class c
extends f {
    public c(InputStream inputStream, long l2, int n2) {
        this(inputStream, l2, (long)n2 & 0xFFFFFFFFL);
    }

    public c(InputStream inputStream, long l2, long l3) {
        super(new CRC32(), inputStream, l2, l3);
    }
}

