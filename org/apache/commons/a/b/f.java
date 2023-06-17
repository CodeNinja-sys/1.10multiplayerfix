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
import org.apache.commons.a.d;

public class f {
    private static final int c = 5000;
    private static final int d = 999999999;
    private static final int e = 1000;
    private static final String f = "rounds=";
    private static final int g = 32;
    static final String a = "$5$";
    private static final int h = 64;
    static final String b = "$6$";
    private static final Pattern i = Pattern.compile("^\\$([56])\\$(rounds=(\\d+)\\$)?([\\.\\/a-zA-Z0-9]{1,16}).*");

    public static String a(byte[] arrby) {
        return org.apache.commons.a.b.f.a(arrby, null);
    }

    public static String a(byte[] arrby, String string) {
        if (string == null) {
            string = a + org.apache.commons.a.b.a.a(8);
        }
        return org.apache.commons.a.b.f.a(arrby, string, a, 32, "SHA-256");
    }

    private static String a(byte[] arrby, String string, String string2, int n2, String string3) {
        int n3;
        int n4;
        int n5 = arrby.length;
        int n6 = 5000;
        boolean bl2 = false;
        if (string == null) {
            throw new IllegalArgumentException("Salt must not be null");
        }
        Matcher matcher = i.matcher(string);
        if (matcher == null || !matcher.find()) {
            throw new IllegalArgumentException("Invalid salt value: " + string);
        }
        if (matcher.group(3) != null) {
            n6 = Integer.parseInt(matcher.group(3));
            n6 = Math.max(1000, Math.min(999999999, n6));
            bl2 = true;
        }
        String string4 = matcher.group(4);
        byte[] arrby2 = string4.getBytes(org.apache.commons.a.d.f);
        int n7 = arrby2.length;
        MessageDigest messageDigest = org.apache.commons.a.b.c.a(string3);
        messageDigest.update(arrby);
        messageDigest.update(arrby2);
        MessageDigest messageDigest2 = org.apache.commons.a.b.c.a(string3);
        messageDigest2.update(arrby);
        messageDigest2.update(arrby2);
        messageDigest2.update(arrby);
        byte[] arrby3 = messageDigest2.digest();
        for (n4 = arrby.length; n4 > n2; n4 -= n2) {
            messageDigest.update(arrby3, 0, n2);
        }
        messageDigest.update(arrby3, 0, n4);
        for (n4 = arrby.length; n4 > 0; n4 >>= 1) {
            if ((n4 & 1) != 0) {
                messageDigest.update(arrby3, 0, n2);
                continue;
            }
            messageDigest.update(arrby);
        }
        arrby3 = messageDigest.digest();
        messageDigest2 = org.apache.commons.a.b.c.a(string3);
        for (int i2 = 1; i2 <= n5; ++i2) {
            messageDigest2.update(arrby);
        }
        byte[] arrby4 = messageDigest2.digest();
        byte[] arrby5 = new byte[n5];
        for (n3 = 0; n3 < n5 - n2; n3 += n2) {
            System.arraycopy(arrby4, 0, arrby5, n3, n2);
        }
        System.arraycopy(arrby4, 0, arrby5, n3, n5 - n3);
        messageDigest2 = org.apache.commons.a.b.c.a(string3);
        for (int i3 = 1; i3 <= 16 + (arrby3[0] & 0xFF); ++i3) {
            messageDigest2.update(arrby2);
        }
        arrby4 = messageDigest2.digest();
        byte[] arrby6 = new byte[n7];
        for (n3 = 0; n3 < n7 - n2; n3 += n2) {
            System.arraycopy(arrby4, 0, arrby6, n3, n2);
        }
        System.arraycopy(arrby4, 0, arrby6, n3, n7 - n3);
        for (int i4 = 0; i4 <= n6 - 1; ++i4) {
            messageDigest = org.apache.commons.a.b.c.a(string3);
            if ((i4 & 1) != 0) {
                messageDigest.update(arrby5, 0, n5);
            } else {
                messageDigest.update(arrby3, 0, n2);
            }
            if (i4 % 3 != 0) {
                messageDigest.update(arrby6, 0, n7);
            }
            if (i4 % 7 != 0) {
                messageDigest.update(arrby5, 0, n5);
            }
            if ((i4 & 1) != 0) {
                messageDigest.update(arrby3, 0, n2);
            } else {
                messageDigest.update(arrby5, 0, n5);
            }
            arrby3 = messageDigest.digest();
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        if (bl2) {
            stringBuilder.append(f);
            stringBuilder.append(n6);
            stringBuilder.append("$");
        }
        stringBuilder.append(string4);
        stringBuilder.append("$");
        if (n2 == 32) {
            org.apache.commons.a.b.a.a(arrby3[0], arrby3[10], arrby3[20], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[21], arrby3[1], arrby3[11], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[12], arrby3[22], arrby3[2], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[3], arrby3[13], arrby3[23], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[24], arrby3[4], arrby3[14], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[15], arrby3[25], arrby3[5], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[6], arrby3[16], arrby3[26], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[27], arrby3[7], arrby3[17], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[18], arrby3[28], arrby3[8], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[9], arrby3[19], arrby3[29], 4, stringBuilder);
            org.apache.commons.a.b.a.a((byte)0, arrby3[31], arrby3[30], 3, stringBuilder);
        } else {
            org.apache.commons.a.b.a.a(arrby3[0], arrby3[21], arrby3[42], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[22], arrby3[43], arrby3[1], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[44], arrby3[2], arrby3[23], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[3], arrby3[24], arrby3[45], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[25], arrby3[46], arrby3[4], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[47], arrby3[5], arrby3[26], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[6], arrby3[27], arrby3[48], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[28], arrby3[49], arrby3[7], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[50], arrby3[8], arrby3[29], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[9], arrby3[30], arrby3[51], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[31], arrby3[52], arrby3[10], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[53], arrby3[11], arrby3[32], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[12], arrby3[33], arrby3[54], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[34], arrby3[55], arrby3[13], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[56], arrby3[14], arrby3[35], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[15], arrby3[36], arrby3[57], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[37], arrby3[58], arrby3[16], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[59], arrby3[17], arrby3[38], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[18], arrby3[39], arrby3[60], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[40], arrby3[61], arrby3[19], 4, stringBuilder);
            org.apache.commons.a.b.a.a(arrby3[62], arrby3[20], arrby3[41], 4, stringBuilder);
            org.apache.commons.a.b.a.a((byte)0, (byte)0, arrby3[63], 2, stringBuilder);
        }
        Arrays.fill(arrby4, (byte)0);
        Arrays.fill(arrby5, (byte)0);
        Arrays.fill(arrby6, (byte)0);
        messageDigest.reset();
        messageDigest2.reset();
        Arrays.fill(arrby, (byte)0);
        Arrays.fill(arrby2, (byte)0);
        return stringBuilder.toString();
    }

    public static String b(byte[] arrby) {
        return org.apache.commons.a.b.f.b(arrby, null);
    }

    public static String b(byte[] arrby, String string) {
        if (string == null) {
            string = b + org.apache.commons.a.b.a.a(8);
        }
        return org.apache.commons.a.b.f.a(arrby, string, b, 64, "SHA-512");
    }
}

