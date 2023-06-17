/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.util.Iterator;
import org.lwjgl.opengl.fq;
import org.lwjgl.opengl.fr;

public class fs
implements Iterator {
    private int b;
    private fr c;
    final /* synthetic */ fq a;

    fs(fq fq2) {
        this.a = fq2;
        this.a();
    }

    public void a() {
        int n2;
        this.c = null;
        fr[] arrfr = fq.a(this.a);
        for (n2 = arrfr.length - 1; n2 >= 0 && arrfr[n2] == null; --n2) {
        }
        this.b = n2;
    }

    public boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        fr fr2 = this.c;
        return fr2 != null && fr2.c != null;
    }

    public fr b() {
        fr fr2 = this.c;
        if (fr2 != null && (fr2 = fr2.c) != null) {
            this.c = fr2;
            return fr2;
        }
        fr[] arrfr = fq.a(this.a);
        int n2 = this.b;
        fr2 = this.c = arrfr[n2];
        while (--n2 >= 0 && arrfr[n2] == null) {
        }
        this.b = n2;
        return fr2;
    }

    public void remove() {
        this.a.c(this.c.a);
    }

    public /* synthetic */ Object next() {
        return this.b();
    }
}

