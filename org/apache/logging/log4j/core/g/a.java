/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.g;

import org.apache.logging.log4j.core.f;
import org.apache.logging.log4j.d;

public abstract class a
implements f {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    protected byte[] b;
    protected byte[] c;

    @Override
    public byte[] b() {
        return this.b;
    }

    public void a(byte[] arrby) {
        this.b = arrby;
    }

    @Override
    public byte[] a() {
        return this.c;
    }

    public void b(byte[] arrby) {
        this.c = arrby;
    }
}

