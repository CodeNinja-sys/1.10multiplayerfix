/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.b;

import java.util.Random;

class a {
    static final String a = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    a() {
    }

    static void a(byte by2, byte by3, byte by4, int n2, StringBuilder stringBuilder) {
        int n3 = by2 << 16 & 0xFFFFFF | by3 << 8 & 0xFFFF | by4 & 0xFF;
        int n4 = n2;
        while (n4-- > 0) {
            stringBuilder.append(a.charAt(n3 & 0x3F));
            n3 >>= 6;
        }
    }

    static String a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 1; i2 <= n2; ++i2) {
            stringBuilder.append(a.charAt(new Random().nextInt(a.length())));
        }
        return stringBuilder.toString();
    }
}

