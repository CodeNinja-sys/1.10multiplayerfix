/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.b.b;

public class y {
    private String a;
    private int b = 0;
    private String c = null;

    private static String a(String string) {
        return com.ibm.icu.b.b.a(string, true);
    }

    private void b() {
        if (this.c == null) {
            this.c = y.a(this.a);
        }
    }

    public y(String string) {
        this.a = string;
    }

    public String a() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        this.b();
        try {
            y y2 = (y)object;
            y2.b();
            return this.c.equals(y2.c);
        }
        catch (ClassCastException classCastException) {
            try {
                String string = (String)object;
                return this.c.equals(y.a(string));
            }
            catch (ClassCastException classCastException2) {
                return false;
            }
        }
    }

    public int hashCode() {
        this.b();
        if (this.b == 0) {
            this.b = this.c.hashCode();
        }
        return this.b;
    }

    public String toString() {
        return this.a;
    }
}

