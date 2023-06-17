/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.l;

public final class ab
extends ac
implements l {
    private final String b;
    private final d c;
    private final boolean d;

    public ab(d d2, String string) {
        super("Literal", "literal");
        this.b = string;
        this.c = d2;
        this.d = d2 != null && string.contains("${");
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        stringBuilder.append(this.d ? this.c.l().a(h2, this.b) : this.b);
    }

    @Override
    public void a(Object object, StringBuilder stringBuilder) {
        stringBuilder.append(this.d ? this.c.l().a(this.b) : this.b);
    }

    @Override
    public void a(StringBuilder stringBuilder, Object ... arrobject) {
        stringBuilder.append(this.d ? this.c.l().a(this.b) : this.b);
    }

    public String c() {
        return this.b;
    }
}

