/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.TypeUDT
 *  com.barchart.udt.nio.SocketChannelUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.an;
import io.netty.channel.bh;
import io.netty.channel.i.a.a;
import io.netty.channel.i.a.c;
import java.util.List;

public class b
extends a {
    private static final bh g = new bh(false);

    public b() {
        super(TypeUDT.STREAM);
    }

    @Override
    protected int a(List list) {
        SocketChannelUDT socketChannelUDT = this.K().accept();
        if (socketChannelUDT == null) {
            return 0;
        }
        list.add(new c((an)this, socketChannelUDT));
        return 1;
    }

    @Override
    public bh F() {
        return g;
    }
}

