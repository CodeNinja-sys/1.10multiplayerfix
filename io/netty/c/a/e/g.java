/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.MarshallerFactory
 *  org.jboss.marshalling.MarshallingConfiguration
 *  org.jboss.marshalling.Unmarshaller
 */
package io.netty.c.a.e;

import io.netty.c.a.e.o;
import io.netty.channel.bd;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.Unmarshaller;

public class g
implements o {
    private final MarshallerFactory a;
    private final MarshallingConfiguration b;

    public g(MarshallerFactory marshallerFactory, MarshallingConfiguration marshallingConfiguration) {
        this.a = marshallerFactory;
        this.b = marshallingConfiguration;
    }

    @Override
    public Unmarshaller a(bd bd2) {
        return this.a.createUnmarshaller(this.b);
    }
}

