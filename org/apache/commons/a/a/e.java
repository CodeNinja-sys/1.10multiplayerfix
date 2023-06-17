/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.InputStream;
import org.apache.commons.a.a.d;
import org.apache.commons.a.a.i;

public class e
extends i {
    public e(InputStream inputStream) {
        this(inputStream, false);
    }

    public e(InputStream inputStream, boolean bl2) {
        super(inputStream, new d(false), bl2);
    }

    public e(InputStream inputStream, boolean bl2, int n2, byte[] arrby) {
        super(inputStream, new d(n2, arrby), bl2);
    }
}

