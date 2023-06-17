/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.n.a.gf;
import io.netty.channel.epoll.i;

final class ik
extends cag {
    ik() {
    }

    protected i a() {
        return new i(0, new gf().a("Netty Epoll Client IO #%d").a(true).a());
    }

    @Override
    protected /* synthetic */ Object b() {
        return this.a();
    }
}

