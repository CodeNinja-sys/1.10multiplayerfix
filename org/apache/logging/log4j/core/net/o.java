/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.jms.QueueConnection
 *  javax.jms.QueueSender
 *  javax.jms.QueueSession
 */
package org.apache.logging.log4j.core.net;

import javax.jms.QueueConnection;
import javax.jms.QueueSender;
import javax.jms.QueueSession;

class o {
    private final QueueConnection a;
    private final QueueSession b;
    private final QueueSender c;

    public o(QueueConnection queueConnection, QueueSession queueSession, QueueSender queueSender) {
        this.a = queueConnection;
        this.b = queueSession;
        this.c = queueSender;
    }

    static /* synthetic */ QueueSession a(o o2) {
        return o2.b;
    }

    static /* synthetic */ QueueSender b(o o2) {
        return o2.c;
    }

    static /* synthetic */ QueueConnection c(o o2) {
        return o2.a;
    }
}

