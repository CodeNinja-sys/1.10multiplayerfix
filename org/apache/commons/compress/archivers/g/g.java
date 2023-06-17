/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.h.am;

final class g
implements am {
    g() {
    }

    public boolean a(String string) {
        return true;
    }

    public ByteBuffer b(String string) {
        int n2 = string.length();
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby[i2] = (byte)string.charAt(i2);
        }
        return ByteBuffer.wrap(arrby);
    }

    public String a(byte[] arrby) {
        byte by2;
        int n2 = arrby.length;
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2 && (by2 = arrby[i2]) != 0; ++i2) {
            stringBuilder.append((char)(by2 & 0xFF));
        }
        return stringBuilder.toString();
    }
}

