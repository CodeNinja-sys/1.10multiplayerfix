/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.g;

import com.sun.nio.sctp.MessageInfo;
import io.netty.b.ae;
import io.netty.b.g;
import io.netty.b.i;
import io.netty.b.w;
import io.netty.util.z;

public final class f
extends ae {
    private final int a;
    private final int b;
    private final MessageInfo c;

    public f(int n2, int n3, g g2) {
        super(g2);
        this.b = n2;
        this.a = n3;
        this.c = null;
    }

    public f(MessageInfo messageInfo, g g2) {
        super(g2);
        if (messageInfo == null) {
            throw new NullPointerException("msgInfo");
        }
        this.c = messageInfo;
        this.a = messageInfo.streamNumber();
        this.b = messageInfo.payloadProtocolID();
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.b;
    }

    public MessageInfo g() {
        return this.c;
    }

    public boolean h() {
        if (this.c != null) {
            return this.c.isComplete();
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        f f2 = (f)object;
        if (this.b != f2.b) {
            return false;
        }
        if (this.a != f2.a) {
            return false;
        }
        return this.a().equals(f2.a());
    }

    public int hashCode() {
        int n2 = this.a;
        n2 = 31 * n2 + this.b;
        n2 = 31 * n2 + this.a().hashCode();
        return n2;
    }

    public f i() {
        if (this.c == null) {
            return new f(this.b, this.a, this.a().Q());
        }
        return new f(this.c, this.a().Q());
    }

    public f j() {
        if (this.c == null) {
            return new f(this.b, this.a, this.a().S());
        }
        return new f(this.c, this.a().Q());
    }

    public f k() {
        super.bC_();
        return this;
    }

    public f b(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public String toString() {
        if (this.ac() == 0) {
            return "SctpFrame{streamIdentifier=" + this.a + ", protocolIdentifier=" + this.b + ", data=(FREED)}";
        }
        return "SctpFrame{streamIdentifier=" + this.a + ", protocolIdentifier=" + this.b + ", data=" + w.a(this.a()) + '}';
    }

    @Override
    public /* synthetic */ i a(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ i bC_() {
        return this.k();
    }

    @Override
    public /* synthetic */ i c() {
        return this.j();
    }

    @Override
    public /* synthetic */ i b() {
        return this.i();
    }

    @Override
    public /* synthetic */ z J(int n2) {
        return this.b(n2);
    }

    @Override
    public /* synthetic */ z ae() {
        return this.k();
    }
}

