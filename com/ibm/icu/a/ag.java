/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ah;
import com.ibm.icu.util.VersionInfo;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class ag {
    private static final byte a = -38;
    private static final byte b = 39;
    private static final byte c = 1;
    private static final byte d = 0;
    private static final byte e = 2;
    private static final String f = "ICU data file error: Not an ICU data file";
    private static final String g = "ICU data file error: Header authentication failed, please check if you have a valid ICU data file";

    public static final byte[] a(InputStream inputStream, byte[] arrby, ah ah2) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        char c2 = dataInputStream.readChar();
        char c3 = '\u0002';
        byte by2 = dataInputStream.readByte();
        ++c3;
        byte by3 = dataInputStream.readByte();
        ++c3;
        if (by2 != -38 || by3 != 39) {
            throw new IOException(f);
        }
        dataInputStream.readChar();
        c3 += 2;
        dataInputStream.readChar();
        c3 += 2;
        byte by4 = dataInputStream.readByte();
        ++c3;
        byte by5 = dataInputStream.readByte();
        ++c3;
        byte by6 = dataInputStream.readByte();
        ++c3;
        dataInputStream.readByte();
        ++c3;
        byte[] arrby2 = new byte[4];
        dataInputStream.readFully(arrby2);
        c3 += 4;
        byte[] arrby3 = new byte[4];
        dataInputStream.readFully(arrby3);
        c3 += 4;
        byte[] arrby4 = new byte[4];
        dataInputStream.readFully(arrby4);
        if (c2 < (c3 += 4)) {
            throw new IOException("Internal Error: Header size error");
        }
        dataInputStream.skipBytes(c2 - c3);
        if (by4 != 1 || by5 != 0 || by6 != 2 || !Arrays.equals(arrby, arrby2) || ah2 != null && !ah2.a(arrby3)) {
            throw new IOException(g);
        }
        return arrby4;
    }

    public static final VersionInfo b(InputStream inputStream, byte[] arrby, ah ah2) {
        byte[] arrby2 = ag.a(inputStream, arrby, ah2);
        return VersionInfo.a(arrby2[0], arrby2[1], arrby2[2], arrby2[3]);
    }
}

