/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.Marshaller
 *  org.jboss.marshalling.MarshallerFactory
 *  org.jboss.marshalling.MarshallingConfiguration
 */
package io.netty.c.a.e;

import io.netty.c.a.e.j;
import io.netty.channel.bd;
import io.netty.util.b.z;
import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;

public class m
implements j {
    private final z a = new z();
    private final MarshallerFactory b;
    private final MarshallingConfiguration c;

    public m(MarshallerFactory marshallerFactory, MarshallingConfiguration marshallingConfiguration) {
        this.b = marshallerFactory;
        this.c = marshallingConfiguration;
    }

    @Override
    public Marshaller a(bd bd2) {
        Marshaller marshaller = (Marshaller)this.a.f();
        if (marshaller == null) {
            marshaller = this.b.createMarshaller(this.c);
            this.a.b((Object)marshaller);
        }
        return marshaller;
    }
}

