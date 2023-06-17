/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

public enum kf {
    a("+H:mm", "Hm", true),
    b("+H:mm:ss", "Hms", true),
    c("-H:mm", "Hm", false),
    d("-H:mm:ss", "Hms", false),
    e("+H", "H", true),
    f("-H", "H", false);

    private String g;
    private String h;
    private boolean i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kf(boolean bl2) {
        void var5_3;
        void var4_2;
        this.g = (String)bl2;
        this.h = var4_2;
        this.i = var5_3;
    }

    private String a() {
        return this.g;
    }

    private String b() {
        return this.h;
    }

    private boolean c() {
        return this.i;
    }

    static /* synthetic */ String a(kf kf2) {
        return kf2.a();
    }

    static /* synthetic */ String b(kf kf2) {
        return kf2.b();
    }

    static /* synthetic */ boolean c(kf kf2) {
        return kf2.c();
    }
}

