/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import org.apache.a.e.d;

public class e {
    private int a = -1;
    private int b = -1;

    e() {
    }

    public e a(int n2) {
        this.a = n2;
        return this;
    }

    public e b(int n2) {
        this.b = n2;
        return this;
    }

    public d a() {
        return new d(this.a, this.b);
    }
}

