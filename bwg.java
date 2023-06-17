/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;
import javax.crypto.Cipher;

public class bwg
extends p {
    private final tq a;

    public bwg(Cipher cipher) {
        this.a = new tq(cipher);
    }

    protected void a(bd bd2, g g2, g g3) {
        this.a.a(g2, g3);
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, g g2) {
        this.a(bd2, (g)object, g2);
    }
}

