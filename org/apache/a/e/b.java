/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.e;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import org.apache.a.c;
import org.apache.a.e.a;
import org.apache.a.e.d;

public class b {
    private int a;
    private int b = -1;
    private Charset c;
    private CodingErrorAction d;
    private CodingErrorAction e;
    private d f;

    b() {
    }

    public b a(int n2) {
        this.a = n2;
        return this;
    }

    public b b(int n2) {
        this.b = n2;
        return this;
    }

    public b a(Charset charset) {
        this.c = charset;
        return this;
    }

    public b a(CodingErrorAction codingErrorAction) {
        this.d = codingErrorAction;
        if (codingErrorAction != null && this.c == null) {
            this.c = org.apache.a.c.f;
        }
        return this;
    }

    public b b(CodingErrorAction codingErrorAction) {
        this.e = codingErrorAction;
        if (codingErrorAction != null && this.c == null) {
            this.c = org.apache.a.c.f;
        }
        return this;
    }

    public b a(d d2) {
        this.f = d2;
        return this;
    }

    public a a() {
        Charset charset = this.c;
        if (charset == null && (this.d != null || this.e != null)) {
            charset = org.apache.a.c.f;
        }
        int n2 = this.a > 0 ? this.a : 8192;
        int n3 = this.b >= 0 ? this.b : n2;
        return new a(n2, n3, charset, this.d, this.e, this.f);
    }
}

