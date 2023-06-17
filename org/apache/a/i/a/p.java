/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.a.i.a.n;
import org.apache.a.i.a.o;
import org.apache.a.i.a.r;
import org.apache.a.i.a.s;
import org.apache.a.i.a.u;
import org.apache.a.i.a.v;
import org.apache.a.i.a.w;
import org.apache.a.o.f;

final class p
implements n {
    protected static final int a = 1;
    protected static final int b = 4;
    protected static final int c = 16;
    protected static final int d = 32;
    protected static final int e = 128;
    protected static final int f = 512;
    protected static final int g = 4096;
    protected static final int h = 8192;
    protected static final int i = 32768;
    protected static final int j = 524288;
    protected static final int k = 0x2000000;
    protected static final int l = 0x800000;
    protected static final int m = 0x20000000;
    protected static final int n = 0x40000000;
    protected static final int o = Integer.MIN_VALUE;
    private static final SecureRandom q;
    static final String p = "ASCII";
    private String r = "ASCII";
    private static final byte[] s;

    p() {
    }

    final String b(String string, String string2, String string3, String string4, String string5) {
        String string6;
        if (string == null || string.trim().equals("")) {
            string6 = this.b(string4, string5);
        } else {
            v v2 = new v(string);
            string6 = this.a(string2, string3, string4, string5, v2.d(), v2.g(), v2.e(), v2.f());
        }
        return string6;
    }

    String b(String string, String string2) {
        return new u(string2, string).c();
    }

    String a(String string, String string2, String string3, String string4, byte[] arrby, int n2, String string5, byte[] arrby2) {
        return new w(string4, string3, string, string2, arrby, n2, string5, arrby2).c();
    }

    String a() {
        return this.r;
    }

    void a(String string) {
        this.r = string;
    }

    private static String f(String string) {
        if (string == null) {
            return null;
        }
        int n2 = string.indexOf(".");
        if (n2 != -1) {
            return string.substring(0, n2);
        }
        return string;
    }

    private static String g(String string) {
        return org.apache.a.i.a.p.f(string);
    }

    private static String h(String string) {
        return org.apache.a.i.a.p.f(string);
    }

    private static int e(byte[] arrby, int n2) {
        if (arrby.length < n2 + 4) {
            throw new o("NTLM authentication - buffer too small for DWORD");
        }
        return arrby[n2] & 0xFF | (arrby[n2 + 1] & 0xFF) << 8 | (arrby[n2 + 2] & 0xFF) << 16 | (arrby[n2 + 3] & 0xFF) << 24;
    }

    private static int f(byte[] arrby, int n2) {
        if (arrby.length < n2 + 2) {
            throw new o("NTLM authentication - buffer too small for WORD");
        }
        return arrby[n2] & 0xFF | (arrby[n2 + 1] & 0xFF) << 8;
    }

    private static byte[] g(byte[] arrby, int n2) {
        int n3 = org.apache.a.i.a.p.f(arrby, n2);
        int n4 = org.apache.a.i.a.p.e(arrby, n2 + 4);
        if (arrby.length < n4 + n3) {
            throw new o("NTLM authentication - buffer too small for data item");
        }
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, n4, arrby2, 0, n3);
        return arrby2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] e() {
        if (q == null) {
            throw new o("Random generator not available");
        }
        byte[] arrby = new byte[8];
        SecureRandom secureRandom = q;
        synchronized (secureRandom) {
            q.nextBytes(arrby);
        }
        return arrby;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static byte[] f() {
        if (q == null) {
            throw new o("Random generator not available");
        }
        byte[] arrby = new byte[16];
        SecureRandom secureRandom = q;
        synchronized (secureRandom) {
            q.nextBytes(arrby);
        }
        return arrby;
    }

    static byte[] a(byte[] arrby, byte[] arrby2) {
        r r2 = new r(arrby2);
        r2.a(arrby);
        return r2.a();
    }

    static byte[] b(byte[] arrby, byte[] arrby2) {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(arrby2, "RC4"));
            return cipher.doFinal(arrby);
        }
        catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    static byte[] a(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(arrby2);
            messageDigest.update(arrby3);
            byte[] arrby4 = messageDigest.digest();
            byte[] arrby5 = new byte[8];
            System.arraycopy(arrby4, 0, arrby5, 0, 8);
            return org.apache.a.i.a.p.d(arrby, arrby5);
        }
        catch (Exception exception) {
            if (exception instanceof o) {
                throw (o)exception;
            }
            throw new o(exception.getMessage(), exception);
        }
    }

    private static byte[] i(String string) {
        try {
            byte[] arrby = string.toUpperCase(Locale.US).getBytes("US-ASCII");
            int n2 = Math.min(arrby.length, 14);
            byte[] arrby2 = new byte[14];
            System.arraycopy(arrby, 0, arrby2, 0, n2);
            Key key = org.apache.a.i.a.p.h(arrby2, 0);
            Key key2 = org.apache.a.i.a.p.h(arrby2, 7);
            byte[] arrby3 = "KGS!@#$%".getBytes("US-ASCII");
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, key);
            byte[] arrby4 = cipher.doFinal(arrby3);
            cipher.init(1, key2);
            byte[] arrby5 = cipher.doFinal(arrby3);
            byte[] arrby6 = new byte[16];
            System.arraycopy(arrby4, 0, arrby6, 0, 8);
            System.arraycopy(arrby5, 0, arrby6, 8, 8);
            return arrby6;
        }
        catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    private static byte[] j(String string) {
        try {
            byte[] arrby = string.getBytes("UnicodeLittleUnmarked");
            s s2 = new s();
            s2.a(arrby);
            return s2.a();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new o("Unicode not supported: " + unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    private static byte[] c(String string, String string2, byte[] arrby) {
        try {
            r r2 = new r(arrby);
            r2.a(string2.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked"));
            if (string != null) {
                r2.a(string.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked"));
            }
            return r2.a();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new o("Unicode not supported! " + unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    private static byte[] d(String string, String string2, byte[] arrby) {
        try {
            r r2 = new r(arrby);
            r2.a(string2.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked"));
            if (string != null) {
                r2.a(string.getBytes("UnicodeLittleUnmarked"));
            }
            return r2.a();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new o("Unicode not supported! " + unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    private static byte[] d(byte[] arrby, byte[] arrby2) {
        try {
            byte[] arrby3 = new byte[21];
            System.arraycopy(arrby, 0, arrby3, 0, 16);
            Key key = org.apache.a.i.a.p.h(arrby3, 0);
            Key key2 = org.apache.a.i.a.p.h(arrby3, 7);
            Key key3 = org.apache.a.i.a.p.h(arrby3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, key);
            byte[] arrby4 = cipher.doFinal(arrby2);
            cipher.init(1, key2);
            byte[] arrby5 = cipher.doFinal(arrby2);
            cipher.init(1, key3);
            byte[] arrby6 = cipher.doFinal(arrby2);
            byte[] arrby7 = new byte[24];
            System.arraycopy(arrby4, 0, arrby7, 0, 8);
            System.arraycopy(arrby5, 0, arrby7, 8, 8);
            System.arraycopy(arrby6, 0, arrby7, 16, 8);
            return arrby7;
        }
        catch (Exception exception) {
            throw new o(exception.getMessage(), exception);
        }
    }

    private static byte[] d(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        r r2 = new r(arrby);
        r2.a(arrby2);
        r2.a(arrby3);
        byte[] arrby4 = r2.a();
        byte[] arrby5 = new byte[arrby4.length + arrby3.length];
        System.arraycopy(arrby4, 0, arrby5, 0, arrby4.length);
        System.arraycopy(arrby3, 0, arrby5, arrby4.length, arrby3.length);
        return arrby5;
    }

    private static byte[] e(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        byte[] arrby4 = new byte[]{1, 1, 0, 0};
        byte[] arrby5 = new byte[]{0, 0, 0, 0};
        byte[] arrby6 = new byte[]{0, 0, 0, 0};
        byte[] arrby7 = new byte[]{0, 0, 0, 0};
        byte[] arrby8 = new byte[arrby4.length + arrby5.length + arrby3.length + 8 + arrby6.length + arrby2.length + arrby7.length];
        int n2 = 0;
        System.arraycopy(arrby4, 0, arrby8, n2, arrby4.length);
        System.arraycopy(arrby5, 0, arrby8, n2 += arrby4.length, arrby5.length);
        System.arraycopy(arrby3, 0, arrby8, n2 += arrby5.length, arrby3.length);
        System.arraycopy(arrby, 0, arrby8, n2 += arrby3.length, 8);
        System.arraycopy(arrby6, 0, arrby8, n2 += 8, arrby6.length);
        System.arraycopy(arrby2, 0, arrby8, n2 += arrby6.length, arrby2.length);
        System.arraycopy(arrby7, 0, arrby8, n2 += arrby2.length, arrby7.length);
        n2 += arrby7.length;
        return arrby8;
    }

    private static Key h(byte[] arrby, int n2) {
        byte[] arrby2 = new byte[7];
        System.arraycopy(arrby, n2, arrby2, 0, 7);
        byte[] arrby3 = new byte[]{arrby2[0], (byte)(arrby2[0] << 7 | (arrby2[1] & 0xFF) >>> 1), (byte)(arrby2[1] << 6 | (arrby2[2] & 0xFF) >>> 2), (byte)(arrby2[2] << 5 | (arrby2[3] & 0xFF) >>> 3), (byte)(arrby2[3] << 4 | (arrby2[4] & 0xFF) >>> 4), (byte)(arrby2[4] << 3 | (arrby2[5] & 0xFF) >>> 5), (byte)(arrby2[5] << 2 | (arrby2[6] & 0xFF) >>> 6), (byte)(arrby2[6] << 1)};
        org.apache.a.i.a.p.a(arrby3);
        return new SecretKeySpec(arrby3, "DES");
    }

    private static void a(byte[] arrby) {
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            boolean bl2;
            byte by2 = arrby[i2];
            boolean bl3 = bl2 = ((by2 >>> 7 ^ by2 >>> 6 ^ by2 >>> 5 ^ by2 >>> 4 ^ by2 >>> 3 ^ by2 >>> 2 ^ by2 >>> 1) & 1) == 0;
            if (bl2) {
                int n2 = i2;
                arrby[n2] = (byte)(arrby[n2] | 1);
                continue;
            }
            int n3 = i2;
            arrby[n3] = (byte)(arrby[n3] & 0xFFFFFFFE);
        }
    }

    static void a(byte[] arrby, int n2, int n3) {
        arrby[n3] = (byte)(n2 & 0xFF);
        arrby[n3 + 1] = (byte)(n2 >> 8 & 0xFF);
        arrby[n3 + 2] = (byte)(n2 >> 16 & 0xFF);
        arrby[n3 + 3] = (byte)(n2 >> 24 & 0xFF);
    }

    static int a(int n2, int n3, int n4) {
        return n2 & n3 | ~n2 & n4;
    }

    static int b(int n2, int n3, int n4) {
        return n2 & n3 | n2 & n4 | n3 & n4;
    }

    static int c(int n2, int n3, int n4) {
        return n2 ^ n3 ^ n4;
    }

    static int a(int n2, int n3) {
        return n2 << n3 | n2 >>> 32 - n3;
    }

    public String a(String string, String string2) {
        return this.b(string2, string);
    }

    public String a(String string, String string2, String string3, String string4, String string5) {
        v v2 = new v(string5);
        return this.a(string, string2, string4, string3, v2.d(), v2.g(), v2.e(), v2.f());
    }

    static /* synthetic */ byte[] b() {
        return org.apache.a.i.a.p.e();
    }

    static /* synthetic */ byte[] c() {
        return org.apache.a.i.a.p.f();
    }

    static /* synthetic */ byte[] b(String string) {
        return org.apache.a.i.a.p.i(string);
    }

    static /* synthetic */ byte[] c(byte[] arrby, byte[] arrby2) {
        return org.apache.a.i.a.p.d(arrby, arrby2);
    }

    static /* synthetic */ byte[] c(String string) {
        return org.apache.a.i.a.p.j(string);
    }

    static /* synthetic */ byte[] a(String string, String string2, byte[] arrby) {
        return org.apache.a.i.a.p.c(string, string2, arrby);
    }

    static /* synthetic */ byte[] b(String string, String string2, byte[] arrby) {
        return org.apache.a.i.a.p.d(string, string2, arrby);
    }

    static /* synthetic */ byte[] b(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        return org.apache.a.i.a.p.e(arrby, arrby2, arrby3);
    }

    static /* synthetic */ byte[] c(byte[] arrby, byte[] arrby2, byte[] arrby3) {
        return org.apache.a.i.a.p.d(arrby, arrby2, arrby3);
    }

    static /* synthetic */ Key a(byte[] arrby, int n2) {
        return org.apache.a.i.a.p.h(arrby, n2);
    }

    static /* synthetic */ byte[] d() {
        return s;
    }

    static /* synthetic */ int b(byte[] arrby, int n2) {
        return org.apache.a.i.a.p.f(arrby, n2);
    }

    static /* synthetic */ int c(byte[] arrby, int n2) {
        return org.apache.a.i.a.p.e(arrby, n2);
    }

    static /* synthetic */ byte[] d(byte[] arrby, int n2) {
        return org.apache.a.i.a.p.g(arrby, n2);
    }

    static /* synthetic */ String d(String string) {
        return org.apache.a.i.a.p.g(string);
    }

    static /* synthetic */ String e(String string) {
        return org.apache.a.i.a.p.h(string);
    }

    static {
        Object object = null;
        try {
            object = SecureRandom.getInstance("SHA1PRNG");
        }
        catch (Exception exception) {
            // empty catch block
        }
        q = object;
        object = org.apache.a.o.f.a("NTLMSSP", p);
        s = new byte[((Object)object).length + 1];
        System.arraycopy(object, 0, s, 0, ((Object)object).length);
        org.apache.a.i.a.p.s[((Object)object).length] = 0;
    }
}

