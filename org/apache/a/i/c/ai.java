/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.a.e.a;
import org.apache.a.f.b.b;
import org.apache.a.f.p;
import org.apache.a.f.u;
import org.apache.a.i.c.ad;
import org.apache.a.i.c.o;
import org.apache.a.i.c.q;
import org.apache.a.i.g.l;
import org.apache.a.j.d;
import org.apache.a.j.f;
import org.apache.commons.d.c;

public class ai
implements p {
    private static final AtomicLong b = new AtomicLong();
    public static final ai a = new ai();
    private final org.apache.commons.d.a c = org.apache.commons.d.c.b(q.class);
    private final org.apache.commons.d.a d = org.apache.commons.d.c.d("org.apache.http.headers");
    private final org.apache.commons.d.a e = org.apache.commons.d.c.d("org.apache.http.wire");
    private final f f;
    private final d g;

    public ai(f f2, d d2) {
        this.f = f2 != null ? f2 : l.a;
        this.g = d2 != null ? d2 : o.a;
    }

    public ai(d d2) {
        this(null, d2);
    }

    public ai() {
        this(null, null);
    }

    public u a(b b2, a a2) {
        CodingErrorAction codingErrorAction;
        a a3 = a2 != null ? a2 : org.apache.a.e.a.a;
        CharsetDecoder charsetDecoder = null;
        CharsetEncoder charsetEncoder = null;
        Charset charset = a3.c();
        CodingErrorAction codingErrorAction2 = a3.d() != null ? a3.d() : CodingErrorAction.REPORT;
        CodingErrorAction codingErrorAction3 = codingErrorAction = a3.e() != null ? a3.e() : CodingErrorAction.REPORT;
        if (charset != null) {
            charsetDecoder = charset.newDecoder();
            charsetDecoder.onMalformedInput(codingErrorAction2);
            charsetDecoder.onUnmappableCharacter(codingErrorAction);
            charsetEncoder = charset.newEncoder();
            charsetEncoder.onMalformedInput(codingErrorAction2);
            charsetEncoder.onUnmappableCharacter(codingErrorAction);
        }
        String string = "http-outgoing-" + Long.toString(b.getAndIncrement());
        return new ad(string, this.c, this.d, this.e, a3.a(), a3.b(), charsetDecoder, charsetEncoder, a3.f(), null, null, this.f, this.g);
    }
}

