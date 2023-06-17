/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

class j
implements Comparable {
    private final int a;
    private final Class b;

    public j(int n2, Class class_) {
        this.a = n2;
        this.b = class_;
    }

    public int a(j j2) {
        int n2 = j2.a;
        if (this.a == n2) {
            return 0;
        }
        if (this.a > n2) {
            return -1;
        }
        return 1;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((j)object);
    }

    static /* synthetic */ Class b(j j2) {
        return j2.b;
    }
}

