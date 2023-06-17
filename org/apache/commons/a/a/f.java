/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.OutputStream;
import org.apache.commons.a.a.d;
import org.apache.commons.a.a.j;

public class f
extends j {
    public f(OutputStream outputStream) {
        this(outputStream, true);
    }

    public f(OutputStream outputStream, boolean bl2) {
        super(outputStream, new d(false), bl2);
    }

    public f(OutputStream outputStream, boolean bl2, int n2, byte[] arrby) {
        super(outputStream, new d(n2, arrby), bl2);
    }
}

