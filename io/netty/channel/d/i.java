/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.an;
import io.netty.channel.b;
import io.netty.channel.bj;
import io.netty.channel.d.d;
import io.netty.channel.d.e;
import io.netty.channel.d.k;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.List;

public abstract class i
extends d {
    protected i(an an2, SelectableChannel selectableChannel, int n2) {
        super(an2, selectableChannel, n2);
    }

    protected e L() {
        return new k(this, null);
    }

    @Override
    protected void a(bj bj2) {
        SelectionKey selectionKey = this.X();
        int n2 = selectionKey.interestOps();
        while (true) {
            Object object;
            if ((object = bj2.b()) == null) {
                if ((n2 & 4) == 0) break;
                selectionKey.interestOps(n2 & 0xFFFFFFFB);
                break;
            }
            try {
                boolean bl2 = false;
                for (int i2 = this.G().d() - 1; i2 >= 0; --i2) {
                    if (!this.a(object, bj2)) continue;
                    bl2 = true;
                    break;
                }
                if (bl2) {
                    bj2.c();
                    continue;
                }
                if ((n2 & 4) != 0) break;
                selectionKey.interestOps(n2 | 4);
            }
            catch (IOException iOException) {
                if (this.M()) {
                    bj2.a(iOException);
                    continue;
                }
                throw iOException;
            }
            break;
        }
    }

    protected boolean M() {
        return false;
    }

    protected abstract int a(List var1);

    protected abstract boolean a(Object var1, bj var2);

    @Override
    protected /* synthetic */ b bv_() {
        return this.L();
    }
}

