/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import io.netty.b.g;
import io.netty.c.a.p;
import io.netty.channel.bd;
import java.util.zip.Deflater;
import net.minecraft.x.a;

public class j
extends p {
    private final byte[] a = new byte[8192];
    private final Deflater b;
    private int c;

    public j(int n2) {
        this.c = n2;
        this.b = new Deflater();
    }

    protected void a(bd bd2, g g2, g g3) {
        int n2 = g2.r();
        a a2 = new a(g3);
        if (n2 < this.c) {
            a2.d(0);
            a2.b(g2);
        } else {
            byte[] arrby = new byte[n2];
            g2.b(arrby);
            a2.d(arrby.length);
            this.b.setInput(arrby, 0, n2);
            this.b.finish();
            while (!this.b.finished()) {
                int n3 = this.b.deflate(this.a);
                a2.b(this.a, 0, n3);
            }
            this.b.reset();
        }
    }

    public void a(int n2) {
        this.c = n2;
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object, g g2) {
        this.a(bd2, (g)object, g2);
    }
}

