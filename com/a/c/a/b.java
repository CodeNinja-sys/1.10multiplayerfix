/*
 * Decompiled with CFR 0.150.
 */
package com.a.c.a;

enum b {
    a(':', ','),
    b('!', '?');

    private final char c;
    private final char d;

    /*
     * WARNING - void declaration
     */
    private b() {
        void var4_2;
        void var3_1;
        this.c = var3_1;
        this.d = var4_2;
    }

    char a() {
        return this.d;
    }

    char b() {
        return this.c;
    }

    static b a(char c2) {
        for (b b2 : com.a.c.a.b.values()) {
            if (b2.b() != c2 && b2.a() != c2) continue;
            return b2;
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + c2);
    }

    static b a(boolean bl2) {
        return bl2 ? a : b;
    }
}

