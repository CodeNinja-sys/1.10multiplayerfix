/*
 * Decompiled with CFR 0.150.
 */
import java.io.ByteArrayOutputStream;

class bda
extends ByteArrayOutputStream {
    private final int b;
    private final int c;
    final /* synthetic */ aig a;

    public bda(aig aig2, int n2, int n3) {
        this.a = aig2;
        super(8096);
        this.b = n2;
        this.c = n3;
    }

    @Override
    public void close() {
        this.a.a(this.b, this.c, this.buf, this.count);
    }
}

