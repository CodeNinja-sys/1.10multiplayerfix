/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.b;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.a.b.a;
import org.apache.commons.a.b.c;

public class d {
    static final String a = "$apr1$";
    private static final int c = 16;
    static final String b = "$1$";
    private static final int d = 1000;

    public static String a(byte[] arrby) {
        return org.apache.commons.a.b.d.a(arrby, a + org.apache.commons.a.b.a.a(8));
    }

    public static String a(byte[] arrby, String string) {
        if (string != null && !string.startsWith(a)) {
            string = a + string;
        }
        return org.apache.commons.a.b.d.a(arrby, string, a);
    }

    public static String a(String string) {
        return org.apache.commons.a.b.d.a(string.getBytes(org.apache.commons.a.d.f));
    }

    public static String a(String string, String string2) {
        return org.apache.commons.a.b.d.a(string.getBytes(org.apache.commons.a.d.f), string2);
    }

    public static String b(byte[] arrby) {
        return org.apache.commons.a.b.d.b(arrby, b + org.apache.commons.a.b.a.a(8));
    }

    public static String b(byte[] arrby, String string) {
        return org.apache.commons.a.b.d.a(arrby, string, b);
    }

    public static String a(byte[] arrby, String string, String string2) {
        int n2;
        Object object;
        Object object2;
        String string3;
        int n3 = arrby.length;
        if (string == null) {
            string3 = org.apache.commons.a.b.a.a(8);
        } else {
            object2 = Pattern.compile("^" + string2.replace("$", "\\$") + "([\\.\\/a-zA-Z0-9]{1,8}).*");
            object = ((Pattern)object2).matcher(string);
            if (object == null || !((Matcher)object).find()) {
                throw new IllegalArgumentException("Invalid salt value: " + string);
            }
            string3 = ((Matcher)object).group(1);
        }
        object2 = string3.getBytes(org.apache.commons.a.d.f);
        object = org.apache.commons.a.b.c.b();
        ((MessageDigest)object).update(arrby);
        ((MessageDigest)object).update(string2.getBytes(org.apache.commons.a.d.f));
        ((MessageDigest)object).update((byte[])object2);
        MessageDigest messageDigest = org.apache.commons.a.b.c.b();
        messageDigest.update(arrby);
        messageDigest.update((byte[])object2);
        messageDigest.update(arrby);
        byte[] arrby2 = messageDigest.digest();
        for (n2 = n3; n2 > 0; n2 -= 16) {
            ((MessageDigest)object).update(arrby2, 0, n2 > 16 ? 16 : n2);
        }
        Arrays.fill(arrby2, (byte)0);
        boolean bl2 = false;
        for (n2 = n3; n2 > 0; n2 >>= 1) {
            if ((n2 & 1) == 1) {
                ((MessageDigest)object).update(arrby2[0]);
                continue;
            }
            ((MessageDigest)object).update(arrby[0]);
        }
        StringBuilder stringBuilder = new StringBuilder(string2 + string3 + "$");
        arrby2 = ((MessageDigest)object).digest();
        for (int i2 = 0; i2 < 1000; ++i2) {
            messageDigest = org.apache.commons.a.b.c.b();
            if ((i2 & 1) != 0) {
                messageDigest.update(arrby);
            } else {
                messageDigest.update(arrby2, 0, 16);
            }
            if (i2 % 3 != 0) {
                messageDigest.update((byte[])object2);
            }
            if (i2 % 7 != 0) {
                messageDigest.update(arrby);
            }
            if ((i2 & 1) != 0) {
                messageDigest.update(arrby2, 0, 16);
            } else {
                messageDigest.update(arrby);
            }
            arrby2 = messageDigest.digest();
        }
        org.apache.commons.a.b.a.a(arrby2[0], arrby2[6], arrby2[12], 4, stringBuilder);
        org.apache.commons.a.b.a.a(arrby2[1], arrby2[7], arrby2[13], 4, stringBuilder);
        org.apache.commons.a.b.a.a(arrby2[2], arrby2[8], arrby2[14], 4, stringBuilder);
        org.apache.commons.a.b.a.a(arrby2[3], arrby2[9], arrby2[15], 4, stringBuilder);
        org.apache.commons.a.b.a.a(arrby2[4], arrby2[10], arrby2[5], 4, stringBuilder);
        org.apache.commons.a.b.a.a((byte)0, (byte)0, arrby2[11], 2, stringBuilder);
        ((MessageDigest)object).reset();
        messageDigest.reset();
        Arrays.fill(arrby, (byte)0);
        Arrays.fill((byte[])object2, (byte)0);
        Arrays.fill(arrby2, (byte)0);
        return stringBuilder.toString();
    }
}

