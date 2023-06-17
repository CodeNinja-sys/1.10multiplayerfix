/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.br;
import io.netty.channel.e.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class e
extends b {
    private final List d = new ArrayList();

    protected e(an an2) {
        super(an2);
    }

    @Override
    protected void M() {
        ap ap2 = this.G();
        br br2 = this.c();
        boolean bl2 = false;
        int n2 = ap2.c();
        Throwable throwable = null;
        int n3 = 0;
        try {
            while ((n3 = this.a(this.d)) != 0) {
                if (n3 < 0) {
                    bl2 = true;
                } else if (this.d.size() < n2 && ap2.g()) continue;
                break;
            }
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
        }
        int n4 = this.d.size();
        for (int i2 = 0; i2 < n4; ++i2) {
            br2.b(this.d.get(i2));
        }
        this.d.clear();
        br2.n();
        if (throwable != null) {
            if (throwable instanceof IOException) {
                bl2 = true;
            }
            this.c().a(throwable);
        }
        if (bl2) {
            if (this.H()) {
                this.t().b(this.t().h());
            }
        } else if (n3 == 0 && this.I()) {
            this.o();
        }
    }

    protected abstract int a(List var1);
}

