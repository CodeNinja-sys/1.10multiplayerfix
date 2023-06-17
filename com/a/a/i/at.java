/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.ak;
import com.a.a.i.aq;
import com.a.a.i.cc;
import java.io.Reader;

final class at
extends ak {
    final /* synthetic */ cc a;

    at(cc cc2) {
        this.a = cc2;
    }

    @Override
    public Reader a() {
        return aq.c((Readable)this.a.h());
    }

    public String toString() {
        return "CharStreams.asCharSource(" + this.a + ")";
    }
}

