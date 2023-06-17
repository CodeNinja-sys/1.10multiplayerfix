/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.util.Iterator;
import org.lwjgl.opencl.be;
import org.lwjgl.opencl.bf;

public class bg
implements Iterator {
    private int b;
    private bf c;
    final /* synthetic */ be a;

    bg(be be2) {
        this.a = be2;
        this.a();
    }

    public void a() {
        int n2;
        this.c = null;
        bf[] arrbf = be.a(this.a);
        for (n2 = arrbf.length - 1; n2 >= 0 && arrbf[n2] == null; --n2) {
        }
        this.b = n2;
    }

    @Override
    public boolean hasNext() {
        if (this.b >= 0) {
            return true;
        }
        bf bf2 = this.c;
        return bf2 != null && bf2.c != null;
    }

    public bf b() {
        bf bf2 = this.c;
        if (bf2 != null && (bf2 = bf2.c) != null) {
            this.c = bf2;
            return bf2;
        }
        bf[] arrbf = be.a(this.a);
        int n2 = this.b;
        bf2 = this.c = arrbf[n2];
        while (--n2 >= 0 && arrbf[n2] == null) {
        }
        this.b = n2;
        return bf2;
    }

    @Override
    public void remove() {
        this.a.c(this.c.a);
    }

    public /* synthetic */ Object next() {
        return this.b();
    }
}

