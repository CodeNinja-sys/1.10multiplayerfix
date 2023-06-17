/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.CodedOutputStream
 */
package io.netty.c.a.f;

import com.google.protobuf.CodedOutputStream;
import io.netty.b.g;
import io.netty.b.k;
import io.netty.c.a.p;
import io.netty.channel.bd;
import java.io.OutputStream;

public class d
extends p {
    protected void a(bd bd2, g g2, g g3) {
        int n2 = g2.r();
        int n3 = CodedOutputStream.computeRawVarint32Size((int)n2);
        g3.k(n3 + n2);
        CodedOutputStream codedOutputStream = CodedOutputStream.newInstance((OutputStream)new k(g3), (int)n3);
        codedOutputStream.writeRawVarint32(n2);
        codedOutputStream.flush();
        g3.b(g2, g2.p(), n2);
    }
}

