/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.f.a;

import java.io.ByteArrayOutputStream;
import net.minecraft.q.f.a.c;

class n
extends ByteArrayOutputStream {
    private final int b;
    private final int c;
    final /* synthetic */ c a;

    public n(c c2, int n2, int n3) {
        this.a = c2;
        super(8096);
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void close() {
        this.a.a(this.b, this.c, this.buf, this.count);
    }
}

