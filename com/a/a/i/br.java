/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.bs;
import com.a.a.i.bt;
import com.a.a.i.bu;
import com.a.a.i.bv;
import com.a.a.i.bw;
import com.a.a.i.bx;
import com.a.a.i.by;
import com.a.a.i.bz;
import com.a.a.i.ca;
import com.a.a.i.cb;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

final class br {
    private br() {
    }

    static ca a(Reader reader) {
        cl.a(reader);
        return new bs(reader);
    }

    static ca a(CharSequence charSequence) {
        cl.a(charSequence);
        return new bt(charSequence);
    }

    static InputStream a(by by2) {
        cl.a(by2);
        return new bu(by2);
    }

    static OutputStream a(bz bz2) {
        cl.a(bz2);
        return new bv(bz2);
    }

    static cb a(Writer writer) {
        cl.a(writer);
        return new bw(writer);
    }

    static cb a(int n2) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        return new bx(stringBuilder);
    }
}

