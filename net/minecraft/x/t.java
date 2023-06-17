/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.bi;
import io.netty.c.a.d;
import io.netty.c.a.g;
import io.netty.channel.bd;
import java.util.List;
import java.util.zip.Inflater;
import net.minecraft.x.a;

public class t
extends d {
    private final Inflater a;
    private int c;

    public t(int n2) {
        this.c = n2;
        this.a = new Inflater();
    }

    @Override
    protected void a(bd bd2, io.netty.b.g g2, List list) {
        if (g2.r() != 0) {
            a a2 = new a(g2);
            int n2 = a2.e();
            if (n2 == 0) {
                list.add(a2.y(a2.r()));
            } else {
                if (n2 < this.c) {
                    throw new g("Badly compressed packet - size of " + n2 + " is below server threshold of " + this.c);
                }
                if (n2 > 0x200000) {
                    throw new g("Badly compressed packet - size of " + n2 + " is larger than protocol maximum of " + 0x200000);
                }
                byte[] arrby = new byte[a2.r()];
                a2.b(arrby);
                this.a.setInput(arrby);
                byte[] arrby2 = new byte[n2];
                this.a.inflate(arrby2);
                list.add(bi.a(arrby2));
                this.a.reset();
            }
        }
    }

    public void a(int n2) {
        this.c = n2;
    }
}

