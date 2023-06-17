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
import org.jboss.marshalling.Marshaller;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;

public class f
implements j {
    private final MarshallerFactory a;
    private final MarshallingConfiguration b;

    public f(MarshallerFactory marshallerFactory, MarshallingConfiguration marshallingConfiguration) {
        this.a = marshallerFactory;
        this.b = marshallingConfiguration;
    }

    @Override
    public Marshaller a(bd bd2) {
        return this.a.createMarshaller(this.b);
    }
}

