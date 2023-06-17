/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.util.List;
import javax.crypto.Cipher;

public class kw
extends t {
    private final tq a;

    public kw(Cipher cipher) {
        this.a = new tq(cipher);
    }

    protected void a(bd bd2, g g2, List list) {
        list.add(this.a.a(bd2, g2));
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, List list) {
        this.a(bd2, (g)object, list);
    }
}

