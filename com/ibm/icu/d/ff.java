/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fa;
import com.ibm.icu.d.fd;
import com.ibm.icu.d.fg;
import com.ibm.icu.d.fh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ff
extends fg {
    private List a = new ArrayList();

    public List a() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }

    private ff() {
        super(null);
    }

    private void a(fd fd2) {
        fd fd3;
        if (fd2 instanceof fh && !this.a.isEmpty() && (fd3 = (fd)this.a.get(this.a.size() - 1)) instanceof fh) {
            fh fh2 = (fh)fd3;
            fh.a(fh2, fh.a(fh2) + fh.a((fh)fd2));
            return;
        }
        this.a.add(fd2);
    }

    private ff b() {
        this.a = Collections.unmodifiableList(this.a);
        return this;
    }

    /* synthetic */ ff(fa fa2) {
        this();
    }

    static /* synthetic */ void a(ff ff2, fd fd2) {
        ff2.a(fd2);
    }

    static /* synthetic */ ff a(ff ff2) {
        return ff2.b();
    }
}

