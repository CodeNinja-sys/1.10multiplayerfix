/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.b.c.o;

public class v
extends o {
    private final Serializable a = UUID.randomUUID();

    public v(InputStream inputStream) {
        super(inputStream);
    }

    public boolean a(Throwable throwable) {
        return org.apache.commons.b.v.a(throwable, this.a);
    }

    public void b(Throwable throwable) {
        org.apache.commons.b.v.b(throwable, this.a);
    }

    @Override
    protected void a(IOException iOException) {
        throw new org.apache.commons.b.v(iOException, this.a);
    }
}

