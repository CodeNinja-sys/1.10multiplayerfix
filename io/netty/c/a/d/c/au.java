/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.a.a;
import io.netty.util.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class au {
    static byte[] a(byte[] arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            return messageDigest.digest(arrby);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError("MD5 not supported on this platform - Outdated?");
        }
    }

    static byte[] b(byte[] arrby) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            return messageDigest.digest(arrby);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InternalError("SHA-1 is not supported on this platform - Outdated?");
        }
    }

    static String c(byte[] arrby) {
        g g2 = bi.a(arrby);
        g g3 = a.a(g2);
        String string = g3.a(e.d);
        g3.ad();
        return string;
    }

    static byte[] a(int n2) {
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            arrby[i2] = (byte)au.a(0, 255);
        }
        return arrby;
    }

    static int a(int n2, int n3) {
        return (int)(Math.random() * (double)n3 + (double)n2);
    }

    private au() {
    }
}

