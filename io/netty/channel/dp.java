/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.do;
import io.netty.util.b.ab;
import io.netty.util.b.ac;

class dp
implements ac {
    final /* synthetic */ do a;

    dp(do do_) {
        this.a = do_;
    }

    @Override
    public void a(ab ab2) {
        if (this.a.isTerminated()) {
            do.a(this.a).a_((Object)null);
        }
    }
}

