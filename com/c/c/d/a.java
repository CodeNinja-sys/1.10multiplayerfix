/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public enum a {
    a('0'),
    b('1'),
    c('2'),
    d('3'),
    e('4'),
    f('5'),
    g('6'),
    h('7'),
    i('8'),
    j('9'),
    k('a'),
    l('b'),
    m('c'),
    n('d'),
    o('e'),
    p('f'),
    q('k', true),
    r('l', true),
    s('m', true),
    t('n', true),
    u('o', true),
    v('r');

    public static final char w = '\u00a7';
    private static final Map x;
    private static final Map y;
    private static final Pattern z;
    private final char A;
    private final boolean B;
    private final String C;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a() {
        this((String)var1_-1, (int)var2_-1, (char)var3_1, false);
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - void declaration
     */
    private a() {
        void var4_2;
        void var3_1;
        this.A = var3_1;
        this.B = var4_2;
        this.C = "\u00a7" + (char)var3_1;
    }

    public char a() {
        return this.A;
    }

    public boolean b() {
        return this.B;
    }

    public boolean c() {
        return !this.B && this != v;
    }

    public String d() {
        return this.name().toLowerCase();
    }

    public String toString() {
        return this.C;
    }

    public static String a(String string) {
        return string == null ? null : z.matcher(string).replaceAll("");
    }

    public static a a(char c2) {
        return (a)((Object)x.get(Character.valueOf(c2)));
    }

    public static a b(String string) {
        if (string == null) {
            return null;
        }
        return (a)((Object)y.get(string.toLowerCase()));
    }

    public static Collection a(boolean bl2, boolean bl3) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (a a2 : com.c.c.d.a.values()) {
            if (a2.c() && !bl2 || a2.b() && !bl3) continue;
            arrayList.add(a2.d());
        }
        return arrayList;
    }

    static {
        x = new HashMap();
        y = new HashMap();
        z = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-OR]");
        for (a a2 : com.c.c.d.a.values()) {
            x.put(Character.valueOf(a2.a()), a2);
            y.put(a2.d(), a2);
        }
    }
}

