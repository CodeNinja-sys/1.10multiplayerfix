/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;

public class j {
    private boolean a;
    private boolean b;
    private String c;
    private ThreadGroup d;

    public j() {
        this(true);
    }

    public j(boolean bl2) {
        this(bl2, false);
    }

    public j(boolean bl2, boolean bl3) {
        this(bl2, bl3, null);
    }

    public j(boolean bl2, boolean bl3, String string) {
        this(bl2, bl3, string, null);
    }

    public j(boolean bl2, boolean bl3, String string, ThreadGroup threadGroup) {
        this.a = bl2;
        this.b = bl3;
        this.c = string;
        this.d = threadGroup;
    }

    public String a(Callback callback) {
        return this.c;
    }

    public ThreadGroup b(Callback callback) {
        return this.d;
    }

    public boolean c(Callback callback) {
        return this.a;
    }

    public boolean d(Callback callback) {
        return this.b;
    }
}

