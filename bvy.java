/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import io.netty.c.a.d;
import io.netty.c.a.g;
import io.netty.channel.bd;
import java.util.List;
import java.util.zip.Inflater;

public class bvy
extends d {
    private final Inflater a;
    private int c;

    public bvy(int n2) {
        this.c = n2;
        this.a = new Inflater();
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        if (g2.r() == 0) {
            return;
        }
        si si2 = new si(g2);
        int n2 = si2.e();
        if (n2 == 0) {
            list.add(si2.y(si2.r()));
        } else {
            if (n2 < this.c) {
                throw new g("Badly compressed packet - size of " + n2 + " is below server threshold of " + this.c);
            }
            if (n2 > 0x200000) {
                throw new g("Badly compressed packet - size of " + n2 + " is larger than protocol maximum of " + 0x200000);
            }
            byte[] arrby = new byte[si2.r()];
            si2.b(arrby);
            this.a.setInput(arrby);
            byte[] arrby2 = new byte[n2];
            this.a.inflate(arrby2);
            list.add(bi.a(arrby2));
            this.a.reset();
        }
    }

    public void a(int n2) {
        this.c = n2;
    }
}

