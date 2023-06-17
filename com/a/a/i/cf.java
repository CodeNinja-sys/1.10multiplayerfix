/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.cd;
import com.a.a.i.cg;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;

public final class cf {
    private final Readable a;
    private final Reader b;
    private final char[] c = new char[4096];
    private final CharBuffer d = CharBuffer.wrap(this.c);
    private final Queue e = new LinkedList();
    private final cd f = new cg(this);

    public cf(Readable readable) {
        this.a = (Readable)cl.a(readable);
        this.b = readable instanceof Reader ? (Reader)readable : null;
    }

    public String a() {
        while (this.e.peek() == null) {
            int n2;
            this.d.clear();
            int n3 = n2 = this.b != null ? this.b.read(this.c, 0, this.c.length) : this.a.read(this.d);
            if (n2 == -1) {
                this.f.a();
                break;
            }
            this.f.a(this.c, 0, n2);
        }
        return (String)this.e.poll();
    }

    static /* synthetic */ Queue a(cf cf2) {
        return cf2.e;
    }
}

