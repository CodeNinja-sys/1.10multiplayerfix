/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.gf;
import io.netty.channel.epoll.i;

final class auy
extends cag {
    auy() {
    }

    protected i a() {
        return new i(0, new gf().a("Netty Epoll Server IO #%d").a(true).a());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}

