/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteOutput
 *  org.jboss.marshalling.Marshaller
 */
package io.netty.c.a.e;

import io.netty.b.g;
import io.netty.c.a.e.b;
import io.netty.c.a.e.j;
import io.netty.c.a.p;
import io.netty.channel.bd;
import org.jboss.marshalling.ByteOutput;
import org.jboss.marshalling.Marshaller;

public class d
extends p {
    private final j a;

    public d(j j2) {
        this.a = j2;
    }

    @Override
    protected void a(bd bd2, Object object, g g2) {
        Marshaller marshaller = this.a.a(bd2);
        marshaller.start((ByteOutput)new b(g2));
        marshaller.writeObject(object);
        marshaller.finish();
        marshaller.close();
    }
}

