/*
 * Decompiled with CFR 0.150.
 */
import io.netty.channel.an;
import io.netty.channel.ar;
import io.netty.channel.ba;
import io.netty.channel.bg;
import io.netty.channel.bi;

class auw
extends bg {
    final /* synthetic */ ri a;
    final /* synthetic */ cyq b;
    final /* synthetic */ lq c;

    auw(lq lq2, ri ri2, cyq cyq2) {
        this.c = lq2;
        this.a = ri2;
        this.b = cyq2;
    }

    @Override
    protected void a(an an2) {
        try {
            an2.G().a(bi.y, true);
        }
        catch (ar ar2) {
            // empty catch block
        }
        an2.c().b(new ba[]{new clc(this)});
    }
}

