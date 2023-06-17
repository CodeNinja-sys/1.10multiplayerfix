/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.iq;
import com.ibm.icu.d.kx;

public class is
implements iq {
    private StringBuffer a;

    public is(String string) {
        this.a = new StringBuffer(string);
    }

    public is(StringBuffer stringBuffer) {
        this.a = stringBuffer;
    }

    public is() {
        this.a = new StringBuffer();
    }

    public String toString() {
        return this.a.toString();
    }

    public String a(int n2, int n3) {
        return this.a.substring(n2, n3);
    }

    public int a() {
        return this.a.length();
    }

    public char a(int n2) {
        return this.a.charAt(n2);
    }

    public int b(int n2) {
        return kx.a(this.a, n2);
    }

    public void a(int n2, int n3, char[] arrc, int n4) {
        if (n2 != n3) {
            this.a.getChars(n2, n3, arrc, n4);
        }
    }

    public void a(int n2, int n3, String string) {
        this.a.replace(n2, n3, string);
    }

    public void a(int n2, int n3, char[] arrc, int n4, int n5) {
        this.a.delete(n2, n3);
        this.a.insert(n2, arrc, n4, n5);
    }

    public void a(int n2, int n3, int n4) {
        if (n2 == n3 && n2 >= 0 && n2 <= this.a.length()) {
            return;
        }
        char[] arrc = new char[n3 - n2];
        this.a(n2, n3, arrc, 0);
        this.a(n4, n4, arrc, 0, n3 - n2);
    }

    public boolean b() {
        return false;
    }
}

