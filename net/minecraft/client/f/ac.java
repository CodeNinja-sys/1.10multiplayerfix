/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import net.minecraft.client.f.ai;
import net.minecraft.u.bp;

class ac
extends InputStream {
    private final InputStream a;
    private final String b;
    private boolean c;

    public ac(InputStream inputStream, bp bp2, String string) {
        this.a = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new Exception().printStackTrace(new PrintStream(byteArrayOutputStream));
        this.b = "Leaked resource: '" + bp2 + "' loaded from pack: '" + string + "'\n" + byteArrayOutputStream;
    }

    @Override
    public void close() {
        this.a.close();
        this.c = true;
    }

    protected void finalize() {
        if (!this.c) {
            ai.b().f(this.b);
        }
        super.finalize();
    }

    @Override
    public int read() {
        return this.a.read();
    }
}

