/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.CodedInputStream
 */
package io.netty.c.a.f;

import com.google.protobuf.CodedInputStream;
import io.netty.b.g;
import io.netty.c.a.d;
import io.netty.c.a.f;
import io.netty.channel.bd;
import java.util.List;

public class c
extends d {
    @Override
    protected void a(bd bd2, g g2, List list) {
        g2.x();
        byte[] arrby = new byte[5];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            if (!g2.u()) {
                g2.y();
                return;
            }
            arrby[i2] = g2.E();
            if (arrby[i2] < 0) continue;
            int n2 = CodedInputStream.newInstance((byte[])arrby, (int)0, (int)(i2 + 1)).readRawVarint32();
            if (n2 < 0) {
                throw new f("negative length: " + n2);
            }
            if (g2.r() < n2) {
                g2.y();
                return;
            }
            list.add(g2.y(n2));
            return;
        }
        throw new f("length wider than 32-bit");
    }
}

