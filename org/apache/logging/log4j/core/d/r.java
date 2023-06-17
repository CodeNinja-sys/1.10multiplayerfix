/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.security.MessageDigest;

public final class r {
    private static final int a = 255;

    private r() {
    }

    public static String a(String string) {
        if (string.isEmpty()) {
            return null;
        }
        int n2 = string.lastIndexOf(46);
        return n2 > 0 ? string.substring(0, n2) : "";
    }

    public static String b(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            byte[] arrby = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte by2 : arrby) {
                String string2 = Integer.toHexString(0xFF & by2);
                if (string2.length() == 1) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(string2);
            }
            return stringBuilder.toString();
        }
        catch (Exception exception) {
            return string;
        }
    }
}

