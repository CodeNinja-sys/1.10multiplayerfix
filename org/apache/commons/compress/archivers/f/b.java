/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.compress.archivers.f.a;
import org.apache.commons.compress.archivers.f.f;

class b
extends InputStream {
    private boolean e = false;
    private CipherInputStream f = null;
    final /* synthetic */ f a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ InputStream c;
    final /* synthetic */ a d;

    b(a a2, f f2, byte[] arrby, InputStream inputStream) {
        this.d = a2;
        this.a = f2;
        this.b = arrby;
        this.c = inputStream;
    }

    private CipherInputStream a() {
        Object object;
        Object object2;
        byte[] arrby;
        if (this.e) {
            return this.f;
        }
        int n2 = 0xFF & this.a.d[0];
        int n3 = n2 & 0x3F;
        int n4 = 0xFF & this.a.d[1];
        int n5 = (n2 >> 7 & 1) + (n4 >> 4);
        int n6 = (n2 >> 6 & 1) + (n4 & 0xF);
        if (2 + n5 + n6 > this.a.d.length) {
            throw new IOException("Salt size + IV size too long");
        }
        byte[] arrby2 = new byte[n5];
        System.arraycopy(this.a.d, 2, arrby2, 0, n5);
        byte[] arrby3 = new byte[16];
        System.arraycopy(this.a.d, 2 + n5, arrby3, 0, n6);
        if (this.b == null) {
            throw new IOException("Cannot read encrypted files without a password");
        }
        if (n3 == 63) {
            arrby = new byte[32];
            System.arraycopy(arrby2, 0, arrby, 0, n5);
            System.arraycopy(this.b, 0, arrby, n5, Math.min(this.b.length, arrby.length - n5));
        } else {
            try {
                object2 = MessageDigest.getInstance("SHA-256");
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                IOException iOException = new IOException("SHA-256 is unsupported by your Java implementation");
                iOException.initCause(noSuchAlgorithmException);
                throw iOException;
            }
            object = new byte[8];
            block4: for (long i2 = 0L; i2 < 1L << n3; ++i2) {
                ((MessageDigest)object2).update(arrby2);
                ((MessageDigest)object2).update(this.b);
                ((MessageDigest)object2).update((byte[])object);
                for (int i3 = 0; i3 < ((byte[])object).length; ++i3) {
                    Object object3 = object;
                    int n7 = i3;
                    object3[n7] = (byte)(object3[n7] + 1);
                    if (object[i3] != false) continue block4;
                }
            }
            arrby = ((MessageDigest)object2).digest();
        }
        object2 = new SecretKeySpec(arrby, "AES");
        try {
            object = Cipher.getInstance("AES/CBC/NoPadding");
            ((Cipher)object).init(2, (Key)object2, new IvParameterSpec(arrby3));
            this.f = new CipherInputStream(this.c, (Cipher)object);
            this.e = true;
            return this.f;
        }
        catch (GeneralSecurityException generalSecurityException) {
            IOException iOException = new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)");
            iOException.initCause(generalSecurityException);
            throw iOException;
        }
    }

    public int read() {
        return this.a().read();
    }

    public int read(byte[] arrby, int n2, int n3) {
        return this.a().read(arrby, n2, n3);
    }

    public void close() {
    }
}

