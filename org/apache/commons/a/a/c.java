/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.OutputStream;
import org.apache.commons.a.a.a;
import org.apache.commons.a.a.j;

public class c
extends j {
    public c(OutputStream outputStream) {
        this(outputStream, true);
    }

    public c(OutputStream outputStream, boolean bl2) {
        super(outputStream, new a(false), bl2);
    }

    public c(OutputStream outputStream, boolean bl2, int n2, byte[] arrby) {
        super(outputStream, new a(n2, arrby), bl2);
    }
}

