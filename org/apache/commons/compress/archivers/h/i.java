/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.h.am;

class i
implements am {
    private final String a;

    public i() {
        this.a = null;
    }

    public i(String string) {
        this.a = string;
    }

    public boolean a(String string) {
        return true;
    }

    public ByteBuffer b(String string) {
        if (this.a == null) {
            return ByteBuffer.wrap(string.getBytes());
        }
        return ByteBuffer.wrap(string.getBytes(this.a));
    }

    public String a(byte[] arrby) {
        if (this.a == null) {
            return new String(arrby);
        }
        return new String(arrby, this.a);
    }
}

