/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.bi;
import io.netty.c.c.q;
import io.netty.channel.bd;
import io.netty.channel.bw;

class r
implements Runnable {
    final /* synthetic */ bd a;
    final /* synthetic */ bw b;
    final /* synthetic */ q c;

    r(q q2, bd bd2, bw bw2) {
        this.c = q2;
        this.a = bd2;
        this.b = bw2;
    }

    @Override
    public void run() {
        block2: {
            q.a(this.c).closeOutbound();
            try {
                this.c.a(this.a, (Object)bi.c, this.b);
                this.c.d(this.a);
            }
            catch (Exception exception) {
                if (this.b.b(exception)) break block2;
                q.j().d("flush() raised a masked exception.", exception);
            }
        }
    }
}

