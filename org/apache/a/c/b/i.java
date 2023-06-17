/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.nio.charset.Charset;
import java.util.List;
import org.apache.a.c.f.l;
import org.apache.a.h.g;
import org.apache.a.h.m;
import org.apache.a.n.f;

public class i
extends m {
    public i(List list, String string) {
        super(l.a(list, string != null ? string : f.t.name()), g.a("application/x-www-form-urlencoded", string));
    }

    public i(Iterable iterable, Charset charset) {
        super(l.a(iterable, charset != null ? charset : f.t), g.a("application/x-www-form-urlencoded", charset));
    }

    public i(List list) {
        this((Iterable)list, (Charset)null);
    }

    public i(Iterable iterable) {
        this(iterable, null);
    }
}

