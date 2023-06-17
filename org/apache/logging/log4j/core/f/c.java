/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import javax.management.ObjectName;
import org.apache.logging.log4j.core.d.a;
import org.apache.logging.log4j.core.f.d;
import org.apache.logging.log4j.core.j.e;

public class c
implements d {
    private final ObjectName b;
    private final e c;

    public c(e e2) {
        this.c = (e)a.a(e2, "ContextSelector");
        try {
            this.b = new ObjectName("org.apache.logging.log4j2:type=ContextSelector");
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
    }

    public ObjectName a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.c.getClass().getName();
    }
}

