/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.b.a;

public class w {
    final char[] a;
    final char[] b;
    final char[] c;
    final char d;
    final boolean e;
    public static final w f = new w("0123456789s", "sbq", "WYZ", 'L', false);
    public static final w g = new w("\u96f6\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u4e03\u516b\u4e5d\u5341", "\u5341\u767e\u5343", "\u842c\u5104\u5146", '\u5169', false);
    public static final w h = new w("\u96f6\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u4e03\u516b\u4e5d\u5341", "\u5341\u767e\u5343", "\u4e07\u4ebf\u5146", '\u4e24', false);
    public static final w i = new w("\uc601\uc77c\uc774\uc0bc\uc0ac\uc624\uc721\uce60\ud314\uad6c\uc2ed", "\uc2ed\ubc31\ucc9c", "\ub9cc\uc5b5?", '\uc774', true);

    w(String string, String string2, String string3, char c2, boolean bl2) {
        this.a = string.toCharArray();
        this.b = string2.toCharArray();
        this.c = string3.toCharArray();
        this.d = c2;
        this.e = bl2;
    }
}

