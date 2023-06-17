/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.TopicConnection
 *  javax.jms.TopicPublisher
 *  javax.jms.TopicSession
 */
package org.apache.logging.log4j.core.net;

import javax.jms.TopicConnection;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

class t {
    private final TopicConnection a;
    private final TopicSession b;
    private final TopicPublisher c;

    public t(TopicConnection topicConnection, TopicSession topicSession, TopicPublisher topicPublisher) {
        this.a = topicConnection;
        this.b = topicSession;
        this.c = topicPublisher;
    }

    static /* synthetic */ TopicSession a(t t2) {
        return t2.b;
    }

    static /* synthetic */ TopicPublisher b(t t2) {
        return t2.c;
    }

    static /* synthetic */ TopicConnection c(t t2) {
        return t2.a;
    }
}

