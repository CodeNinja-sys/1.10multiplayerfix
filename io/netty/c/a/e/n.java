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
import io.netty.util.b.z;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.Unmarshaller;

public class n
implements o {
    private final z a = new z();
    private final MarshallerFactory b;
    private final MarshallingConfiguration c;

    public n(MarshallerFactory marshallerFactory, MarshallingConfiguration marshallingConfiguration) {
        this.b = marshallerFactory;
        this.c = marshallingConfiguration;
    }

    @Override
    public Unmarshaller a(bd bd2) {
        Unmarshaller unmarshaller = (Unmarshaller)this.a.f();
        if (unmarshaller == null) {
            unmarshaller = this.b.createUnmarshaller(this.c);
            this.a.b((Object)unmarshaller);
        }
        return unmarshaller;
    }
}

