/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.MarshallerFactory
 *  org.jboss.marshalling.MarshallingConfiguration
 *  org.jboss.marshalling.Unmarshaller
 */
package io.netty.c.a.e;

import io.netty.c.a.e.g;
import io.netty.channel.bd;
import io.netty.util.b;
import io.netty.util.c;
import org.jboss.marshalling.MarshallerFactory;
import org.jboss.marshalling.MarshallingConfiguration;
import org.jboss.marshalling.Unmarshaller;

public class e
extends g {
    private static final c a = c.a(e.class.getName() + ".UNMARSHALLER");

    public e(MarshallerFactory marshallerFactory, MarshallingConfiguration marshallingConfiguration) {
        super(marshallerFactory, marshallingConfiguration);
    }

    @Override
    public Unmarshaller a(bd bd2) {
        b b2 = bd2.a(a);
        Unmarshaller unmarshaller = (Unmarshaller)b2.get();
        if (unmarshaller == null) {
            unmarshaller = super.a(bd2);
            b2.set((Object)unmarshaller);
        }
        return unmarshaller;
    }
}

