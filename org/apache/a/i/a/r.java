/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.security.MessageDigest;
import org.apache.a.i.a.o;

class r {
    protected byte[] a;
    protected byte[] b;
    protected MessageDigest c;

    r(byte[] arrby) {
        int n2;
        byte[] arrby2 = arrby;
        try {
            this.c = MessageDigest.getInstance("MD5");
        }
        catch (Exception exception) {
            throw new o("Error getting md5 message digest implementation: " + exception.getMessage(), exception);
        }
        this.a = new byte[64];
        this.b = new byte[64];
        int n3 = arrby2.length;
        if (n3 > 64) {
            this.c.update(arrby2);
            arrby2 = this.c.digest();
            n3 = arrby2.length;
        }
        for (n2 = 0; n2 < n3; ++n2) {
            this.a[n2] = (byte)(arrby2[n2] ^ 0x36);
            this.b[n2] = (byte)(arrby2[n2] ^ 0x5C);
        }
        while (n2 < 64) {
            this.a[n2] = 54;
            this.b[n2] = 92;
            ++n2;
        }
        this.c.reset();
        this.c.update(this.a);
    }

    byte[] a() {
        byte[] arrby = this.c.digest();
        this.c.update(this.b);
        return this.c.digest(arrby);
    }

    void a(byte[] arrby) {
        this.c.update(arrby);
    }

    void a(byte[] arrby, int n2, int n3) {
        this.c.update(arrby, n2, n3);
    }
}

