/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.util.dn;
import java.util.Locale;
import java.util.Set;

final class bg {
    private String a;
    private ClassLoader b;
    private volatile dn[] c;
    private volatile Locale[] d;
    private volatile Set e;
    private volatile Set f;

    bg(String string, ClassLoader classLoader) {
        this.a = string;
        this.b = classLoader;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    dn[] a() {
        if (this.c == null) {
            bg bg2 = this;
            synchronized (bg2) {
                if (this.c == null) {
                    this.c = bc.e(this.a, this.b);
                }
            }
        }
        return this.c;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Locale[] b() {
        if (this.d == null) {
            bg bg2 = this;
            synchronized (bg2) {
                if (this.d == null) {
                    this.d = bc.f(this.a, this.b);
                }
            }
        }
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Set c() {
        if (this.e == null) {
            bg bg2 = this;
            synchronized (bg2) {
                if (this.e == null) {
                    this.e = bc.g(this.a, this.b);
                }
            }
        }
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    Set d() {
        if (this.f == null) {
            bg bg2 = this;
            synchronized (bg2) {
                if (this.f == null) {
                    this.f = bc.h(this.a, this.b);
                }
            }
        }
        return this.f;
    }
}

