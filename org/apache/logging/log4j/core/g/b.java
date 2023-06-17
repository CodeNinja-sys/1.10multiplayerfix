/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import java.nio.charset.Charset;
import org.apache.logging.log4j.core.g.a;
import org.apache.logging.log4j.core.h;

public abstract class b
extends a {
    private final Charset d;

    protected b(Charset charset) {
        this.d = charset;
    }

    @Override
    public byte[] a(h h2) {
        return ((String)((Object)this.b(h2))).getBytes(this.d);
    }

    @Override
    public String c() {
        return "text/plain";
    }

    protected Charset e() {
        return this.d;
    }
}

