/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.ax;

public class w
extends RuntimeException {
    private int a;

    private static String a(int n2) {
        return ax.e() ? "GetLastError() returned " + n2 : "errno was " + n2;
    }

    private static String a(String string) {
        try {
            return w.a(Integer.parseInt(string));
        }
        catch (NumberFormatException numberFormatException) {
            return string;
        }
    }

    public w(String string) {
        super(w.a(string.trim()));
        try {
            if (string.startsWith("[")) {
                string = string.substring(1, string.indexOf("]"));
            }
            this.a = Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            this.a = -1;
        }
    }

    public int a() {
        return this.a;
    }

    public w(int n2) {
        super(w.a(n2));
        this.a = n2;
    }
}

