/*
 * Decompiled with CFR 0.150.
 */
import io.netty.channel.an;
import io.netty.channel.ba;
import io.netty.channel.bg;

final class ccn
extends bg {
    final /* synthetic */ sz a;

    ccn(sz sz2) {
        this.a = sz2;
    }

    @Override
    protected void a(an an2) {
        an2.c().b("packet_handler", (ba)this.a);
    }
}

