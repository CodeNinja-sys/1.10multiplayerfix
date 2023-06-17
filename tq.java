/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import io.netty.channel.bd;
import javax.crypto.Cipher;

public class tq {
    private final Cipher a;
    private byte[] b = new byte[0];
    private byte[] c = new byte[0];

    protected tq(Cipher cipher) {
        this.a = cipher;
    }

    private byte[] a(g g2) {
        int n2 = g2.r();
        if (this.b.length < n2) {
            this.b = new byte[n2];
        }
        g2.a(this.b, 0, n2);
        return this.b;
    }

    protected g a(bd bd2, g g2) {
        int n2 = g2.r();
        byte[] arrby = this.a(g2);
        g g3 = bd2.d().c(this.a.getOutputSize(n2));
        g3.h(this.a.update(arrby, 0, n2, g3.X(), g3.Y()));
        return g3;
    }

    protected void a(g g2, g g3) {
        int n2 = g2.r();
        byte[] arrby = this.a(g2);
        int n3 = this.a.getOutputSize(n2);
        if (this.c.length < n3) {
            this.c = new byte[n3];
        }
        g3.b(this.c, 0, this.a.update(arrby, 0, n2, this.c));
    }
}

