/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.MessageLiteOrBuilder
 */
package io.netty.c.a.f;

import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import io.netty.b.bi;
import io.netty.c.a.u;
import io.netty.channel.bd;
import java.util.List;

public class b
extends u {
    protected void a(bd bd2, MessageLiteOrBuilder messageLiteOrBuilder, List list) {
        if (messageLiteOrBuilder instanceof MessageLite) {
            list.add(bi.a(((MessageLite)messageLiteOrBuilder).toByteArray()));
            return;
        }
        if (messageLiteOrBuilder instanceof MessageLite.Builder) {
            list.add(bi.a(((MessageLite.Builder)messageLiteOrBuilder).build().toByteArray()));
        }
    }
}

