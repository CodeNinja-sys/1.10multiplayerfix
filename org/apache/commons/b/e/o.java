/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;
import org.apache.commons.b.e.l;
import org.apache.commons.b.v;

public class o
extends l {
    private final Serializable a = UUID.randomUUID();

    public o(OutputStream outputStream) {
        super(outputStream);
    }

    public boolean a(Exception exception) {
        return v.a(exception, this.a);
    }

    public void b(Exception exception) {
        v.b(exception, this.a);
    }

    @Override
    protected void a(IOException iOException) {
        throw new v(iOException, this.a);
    }
}

