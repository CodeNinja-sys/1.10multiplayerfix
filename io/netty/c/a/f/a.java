/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ExtensionRegistry
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.MessageLite
 */
package io.netty.c.a.f;

import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import io.netty.b.g;
import io.netty.c.a.t;
import io.netty.channel.bd;
import java.util.List;

public class a
extends t {
    private static final boolean a;
    private final MessageLite b;
    private final ExtensionRegistry c;

    public a(MessageLite messageLite) {
        this(messageLite, null);
    }

    public a(MessageLite messageLite, ExtensionRegistry extensionRegistry) {
        if (messageLite == null) {
            throw new NullPointerException("prototype");
        }
        this.b = messageLite.getDefaultInstanceForType();
        this.c = extensionRegistry;
    }

    protected void a(bd bd2, g g2, List list) {
        int n2;
        byte[] arrby;
        int n3 = g2.r();
        if (g2.W()) {
            arrby = g2.X();
            n2 = g2.Y() + g2.p();
        } else {
            arrby = new byte[n3];
            g2.a(g2.p(), arrby, 0, n3);
            n2 = 0;
        }
        if (this.c == null) {
            if (a) {
                list.add(this.b.getParserForType().parseFrom(arrby, n2, n3));
            } else {
                list.add(this.b.newBuilderForType().mergeFrom(arrby, n2, n3).build());
            }
        } else if (a) {
            list.add(this.b.getParserForType().parseFrom(arrby, n2, n3, (ExtensionRegistryLite)this.c));
        } else {
            list.add(this.b.newBuilderForType().mergeFrom(arrby, n2, n3, (ExtensionRegistryLite)this.c).build());
        }
    }

    static {
        boolean bl2 = false;
        try {
            MessageLite.class.getDeclaredMethod("getParserForType", new Class[0]);
            bl2 = true;
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        a = bl2;
    }
}

