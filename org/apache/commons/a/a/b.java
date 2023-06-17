/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.InputStream;
import org.apache.commons.a.a.a;
import org.apache.commons.a.a.i;

public class b
extends i {
    public b(InputStream inputStream) {
        this(inputStream, false);
    }

    public b(InputStream inputStream, boolean bl2) {
        super(inputStream, new a(false), bl2);
    }

    public b(InputStream inputStream, boolean bl2, int n2, byte[] arrby) {
        super(inputStream, new a(n2, arrby), bl2);
    }
}

