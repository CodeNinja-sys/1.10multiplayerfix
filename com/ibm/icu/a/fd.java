/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.ff;
import com.ibm.icu.a.fg;
import com.ibm.icu.a.fh;
import com.ibm.icu.a.fi;
import java.util.Iterator;

public class fd {
    private fh b = new fh(this, null);
    boolean a;

    public fd(boolean bl2) {
        this.a = bl2;
    }

    public fd a(CharSequence charSequence, Object object) {
        ff ff2 = new ff(charSequence, 0, this.a);
        this.b.a(ff2, object);
        return this;
    }

    public Iterator a(String string) {
        return this.a((CharSequence)string, 0);
    }

    public Iterator a(CharSequence charSequence, int n2) {
        return this.a(charSequence, n2, (int[])null);
    }

    public Iterator a(CharSequence charSequence, int n2, int[] arrn) {
        fg fg2 = new fg(null);
        this.a(charSequence, n2, (fi)fg2);
        if (arrn != null && arrn.length > 0) {
            arrn[0] = fg2.b();
        }
        return fg2.a();
    }

    public void a(CharSequence charSequence, fi fi2) {
        this.a(charSequence, 0, fi2);
    }

    public void a(CharSequence charSequence, int n2, fi fi2) {
        ff ff2 = new ff(charSequence, n2, this.a);
        this.a(this.b, ff2, fi2);
    }

    private synchronized void a(fh fh2, ff ff2, fi fi2) {
        Iterator iterator = fh2.a();
        if (iterator != null && !fi2.a(ff2.c(), iterator)) {
            return;
        }
        fh fh3 = fh2.a(ff2);
        if (fh3 != null) {
            this.a(fh3, ff2, fi2);
        }
    }

    private static char[] b(CharSequence charSequence) {
        char[] arrc = new char[charSequence.length()];
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            arrc[i2] = charSequence.charAt(i2);
        }
        return arrc;
    }

    private static char[] b(char[] arrc, int n2) {
        if (n2 == 0) {
            return arrc;
        }
        char[] arrc2 = new char[arrc.length - n2];
        System.arraycopy(arrc, n2, arrc2, 0, arrc2.length);
        return arrc2;
    }

    private static char[] b(char[] arrc, int n2, int n3) {
        if (n2 == 0 && n3 == arrc.length) {
            return arrc;
        }
        char[] arrc2 = new char[n3 - n2];
        System.arraycopy(arrc, n2, arrc2, 0, n3 - n2);
        return arrc2;
    }

    static /* synthetic */ char[] a(CharSequence charSequence) {
        return fd.b(charSequence);
    }

    static /* synthetic */ char[] a(char[] arrc, int n2) {
        return fd.b(arrc, n2);
    }

    static /* synthetic */ char[] a(char[] arrc, int n2, int n3) {
        return fd.b(arrc, n2, n3);
    }
}

