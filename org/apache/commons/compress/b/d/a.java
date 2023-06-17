/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.b.d;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.commons.compress.b.d.i;

class a
extends i {
    a() {
        super(new ByteArrayOutputStream());
    }

    InputStream a() {
        return new ByteArrayInputStream(((ByteArrayOutputStream)this.out).toByteArray());
    }
}

